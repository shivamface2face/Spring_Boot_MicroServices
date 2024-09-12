package com.cvm.quizApp.Service;

import com.cvm.quizApp.Entity.Qestion;
import com.cvm.quizApp.Resposotries.QestionRepostories;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QestionService {


    private final QestionRepostories qestionRepostories;

    public ResponseEntity<List<Qestion>> getAllQestion() {

        try{
            return new ResponseEntity<>(qestionRepostories.findAll(),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity< List<Qestion>> getQestionByCategory(String cat) {
    try {
        return new ResponseEntity<>(qestionRepostories.findByCategory(cat),HttpStatus.OK);
    }catch (Exception e){
        e.printStackTrace();
    }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<Qestion> addQestion(Qestion qestion) {

        return new ResponseEntity<>( qestionRepostories.save(qestion),HttpStatus.CREATED);
    }
}

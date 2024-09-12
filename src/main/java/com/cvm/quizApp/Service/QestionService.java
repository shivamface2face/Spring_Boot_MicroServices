package com.cvm.quizApp.Service;

import com.cvm.quizApp.Entity.Qestion;
import com.cvm.quizApp.Resposotries.QestionRepostories;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QestionService {


    private final QestionRepostories qestionRepostories;

    public List<Qestion> getAllQestion() {

        return qestionRepostories.findAll();
    }

    public List<Qestion> getQestionByCategory(String cat) {
     return qestionRepostories.findByCategory(cat);
    }
}

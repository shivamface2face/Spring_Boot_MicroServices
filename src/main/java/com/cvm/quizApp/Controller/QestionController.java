package com.cvm.quizApp.Controller;

import com.cvm.quizApp.Entity.Qestion;
import com.cvm.quizApp.Service.QestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qest")
@RequiredArgsConstructor
public class QestionController {

   private final QestionService qestionService;

    @GetMapping("/all")
    public ResponseEntity<List<Qestion>> getAllQestion(){
        return qestionService.getAllQestion();
    }


    @GetMapping("/cat/{cat}")
    public ResponseEntity<List<Qestion>>getQestionByCategory(@PathVariable(value = "cat") String cat){
return qestionService.getQestionByCategory(cat);
    }

    @PostMapping
    public ResponseEntity<Qestion> addQestion(@RequestBody Qestion qestion){

        return qestionService.addQestion(qestion);

    }

}

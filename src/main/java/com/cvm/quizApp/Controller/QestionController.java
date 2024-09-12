package com.cvm.quizApp.Controller;

import com.cvm.quizApp.Entity.Qestion;
import com.cvm.quizApp.Service.QestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/qest")
@RequiredArgsConstructor
public class QestionController {

   private final QestionService qestionService;

    @GetMapping("/all")
    public List<Qestion> getAllQestion(){
        return qestionService.getAllQestion();
    }


    @GetMapping("/cat/{cat}")
    public List<Qestion>getQestionByCategory(@PathVariable(value = "cat") String cat){
return qestionService.getQestionByCategory(cat);
    }

}

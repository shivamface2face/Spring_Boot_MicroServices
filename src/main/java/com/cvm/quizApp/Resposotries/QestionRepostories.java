package com.cvm.quizApp.Resposotries;

import com.cvm.quizApp.Entity.Qestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QestionRepostories extends JpaRepository<Qestion,Long> {

    List<Qestion>findByCategory(String cat);

}

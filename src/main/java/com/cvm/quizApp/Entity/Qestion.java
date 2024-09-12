package com.cvm.quizApp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Qestion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Qestion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String qestionTilte;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String diffucltyLavel;


}

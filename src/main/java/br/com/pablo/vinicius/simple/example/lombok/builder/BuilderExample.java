package br.com.pablo.vinicius.simple.example.lombok.builder;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class BuilderExample {

    private String name;
    private String surname;
    private Long age;
    private LocalDate birthDay;
    private String job;
    private boolean isMarried;
    private boolean haveChildren;
}

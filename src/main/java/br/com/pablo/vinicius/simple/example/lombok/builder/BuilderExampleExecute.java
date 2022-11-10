package br.com.pablo.vinicius.simple.example.lombok.builder;

import java.time.LocalDate;

public class BuilderExampleExecute {

    public static void main(String[] args) {

        BuilderExample builderExample2 = new BuilderExample("Joao","de Barro",20l,LocalDate.now(),"programador",Boolean.TRUE,Boolean.TRUE);

        BuilderExample builderExample = BuilderExample.builder()
                .name("Joao")
                .surname("de Barro")
                .age(20l)
                .birthDay(LocalDate.now())
                .job("Programador")
                .isMarried(Boolean.TRUE)
                .haveChildren(Boolean.TRUE)
                .build();
    }
}

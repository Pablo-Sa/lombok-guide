package br.com.pablo.vinicius.simple.example.lombok.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ToStringExample {

    private String name;
    private Long age;
}

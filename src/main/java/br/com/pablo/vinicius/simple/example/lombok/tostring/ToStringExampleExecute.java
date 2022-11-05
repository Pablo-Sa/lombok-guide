package br.com.pablo.vinicius.simple.example.lombok.tostring;

public class ToStringExampleExecute {

    public static void main(String[] args) {
        ToStringExample toStringExample = new ToStringExample();
        toStringExample.setAge(20l);
        toStringExample.setName("Pablo");
        System.out.println(toStringExample);
    }
}

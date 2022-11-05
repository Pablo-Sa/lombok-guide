package br.com.pablo.vinicius.simple.example.lombok.data;

public class DataExampleExecute {

    public static void main(String[] args) {
        DataExample dataExample = new DataExample("Pablo");
        dataExample.setAge(20l);
        dataExample.getName();
        System.out.println(dataExample);
    }
}

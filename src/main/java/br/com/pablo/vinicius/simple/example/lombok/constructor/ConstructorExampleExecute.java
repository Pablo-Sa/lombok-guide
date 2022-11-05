package br.com.pablo.vinicius.simple.example.lombok.constructor;

public class ConstructorExampleExecute {

    public static void main(String[] args) {
        NoArgsAndAllAgrsConstructorExample noArgs = new NoArgsAndAllAgrsConstructorExample();
        NoArgsAndAllAgrsConstructorExample allArgs = new NoArgsAndAllAgrsConstructorExample("name",20l);
        RequiredArgsConstructorExample requiredArgs = new RequiredArgsConstructorExample("teste");
    }
}

import java.util.Arrays;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        for (var name : args) {
            var account = new Account(name);
            var result= account.checkNameToEmboss();
            System.out.println("Input: " + name + " is valid: " + result);
        }
    }

}
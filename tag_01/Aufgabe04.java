package tag_01;

public class Aufgabe04 {
    public static void main(String[] args){

        double number1 = Math.random();
        double number2 = Math.random();

        double number3 = number1;
        number1 = number2;
        number2 = number3;

        System.out.println(number1);
        System.out.println(number2);
    }
    
}

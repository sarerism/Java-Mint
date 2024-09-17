package tag_02;

public class Aufgabe_03 {
    public static void main(String[] args){

        int year = 1900;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("The year " + year + " is a leap year.");
        }
        else{
            System.out.println("The year " + year + " is NOT a leap year.");
        }
    }
}

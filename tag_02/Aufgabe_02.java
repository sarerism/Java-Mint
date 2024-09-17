package tag_02;

public class Aufgabe_02 {
    public static void main(String[] args){

        int numberOfMonths = 6;
        boolean isReserved = true;

        if (numberOfMonths<=5 && isReserved==false){
            System.out.println("The borrowing can be extended by another month.");
        }
        else if (numberOfMonths>=5 && isReserved==false){
            System.out.println("You must return this book.");
        }
        else if (numberOfMonths>=5 && isReserved==true){
            System.out.println("You must return this book.");
        }   
        else if (numberOfMonths<=5 && isReserved==true){
            System.out.println("Someone else has reserved this book for the next month.");
        }
    }
}

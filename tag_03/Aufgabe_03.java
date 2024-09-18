package tag_03;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Aufgabe_03 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean isFav = true;

        while(isFav){

            try {
                System.out.print("Enter you fav number: ");
                int favNumber = input.nextInt();

                System.out.println("Oh my fav number is " + favNumber + " too; ");
                isFav = false;
            }

            catch (InputMismatchException e) {
                System.out.println("Wrong Input!");
                input.next();
            }
        }
        input.close();
    }
}
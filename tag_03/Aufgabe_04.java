/*
 * Das ist Aufgabe 04 teil b
 */

package tag_03;

import java.util.Scanner;

public class Aufgabe_04 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Ener the number: ");
        int number = input.nextInt();

        boolean finish = false;

        while (!finish){
            if (number == 1){
                System.out.print(number);
                System.out.print(" ");
                finish = true;
            }
            else if (number%2==0){
                number = number/2;
                System.out.print(number);
                System.out.print(" ");
            } 
            else if (number%2!=0){
                number = 3*number+1;
                System.out.print(number);
                System.out.print(" ");
            }
            else{
                System.out.println("Something went wrong!");
            }
        }
        input.close();

    }
    
}

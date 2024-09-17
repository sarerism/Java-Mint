package tag_02;

public class Aufgabe_12 {
    public static void main(String[] args){

        int numberOfTerms = 20;

        int lastNumber = 0;
        int currentNumber = 1;
        
        for (int i = 1; i<=numberOfTerms; i++){
            int next = lastNumber + currentNumber;
            lastNumber = currentNumber;
            currentNumber = next;
            System.err.println(lastNumber);
        }
    }
    
}

package tag_02;

public class Aufgabe_10 {
    public static void main(String[] args) {

        int inputNumber = 70;
        int numberOfPrime = 0;

        for (int i = 2; i <= inputNumber; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " is a prime number!");
                numberOfPrime++;
            }
        }

        System.out.println("Number of prime numbers between 1 and " + inputNumber + ": " + numberOfPrime);
        double percentage = ((double)numberOfPrime/inputNumber)*100;
        System.out.println("There are " + percentage + "% of prime numbers between 1 and " + inputNumber );
    }
}

package tag_03;

public class Calculator {
    
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static double divide(double a, double b){

        if (b==0){
            System.out.println("Divide by Zero not Possible");
        }
        double div = a/b;
        return div;
    }

    public static long max(long x, long y, long z){
        long max;
        if (x>y && x>z){
            max = x;
        }
        else if (y>x && y>z){
            max=y;
        }
        else{
            max=z;
        }
        return max;
    }

    public static void rectangle(int height, int width){
        for (int i = 0; i<height;i++){
            for (int j = 0; j<width; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void square(int length){
        for (int i = 0; i<length;i++){
            for (int j = 0; j<length; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is Not a Prime number!");
            return false; 
        }
        
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is Not a Prime number!");
                return false;
            }
        }
    
        System.out.println(n + " is a Prime number!");
        return true;
    }
    
}

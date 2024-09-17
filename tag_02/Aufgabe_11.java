package tag_02;

public class Aufgabe_11 {
    public static void main(String[] args){

        double valueOfPi = 0;
        double n = 100000;

        for (int i = 0;i<n;i++){
            double term = 4.0/(2*i+1);
            if (i%2==0){
                valueOfPi = valueOfPi + term;
            }
            else{
                valueOfPi = valueOfPi - term;
            }
        }
        System.out.println(valueOfPi);
    }
}

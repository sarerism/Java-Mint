package tag_02;

public class Aufgabe_04 {
    public static void main(String[] args) {

        // For loops

        System.out.println("--------------------------------------For Loops--------------------------------------");

        for (int i = 10; i > 0; i--){
            System.out.print(i);
            System.out.print(" ");
        }
        
        System.out.println();

        for (int i = 20; i > -8; i=i-3){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 100; i > 0; i=i-10){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 1; i<=10; i++){
            System.out.print(i*i);
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 0; i<=19; i=i+2){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 0; i<=23; i++){
            if (i%5==0){
                System.out.print(i+1);
                System.out.print(" ");
                System.out.print(i+2);
                System.out.print(" ");
            }
        }

        System.out.println();

        // while loops

        System.out.println("--------------------------------------While Loops--------------------------------------");

        int a = 10;

        while(a>0){
            System.out.print(a);
            System.out.print(" ");
            a--;
        }

        System.out.println();
        
        int b = 20;

        while(b>-8){
            System.out.print(b);
            System.out.print(" ");
            b=b-3;
        }

        System.out.println();

        int c = 100;

        while(c>=10){
            System.out.print(c);
            System.out.print(" ");
            c=c-10;
        }

        System.out.println();

        int d = 1;

        while(d<=10){
            System.out.print(d*d);
            System.out.print(" ");
            d++;
        }

        System.out.println();

        int e = 0;

        while(e<19){
            System.out.print(e);
            System.out.print(" ");
            e=e+2;
        }

        System.out.println();

        int f = 0;

        while(f<23){
            if (f%5==0){
                System.out.print(f+1);
                System.out.print(" ");
                System.out.print(f+2);
                System.out.print(" ");
            }
            f++;
        }
        System.out.println();
    }    
}

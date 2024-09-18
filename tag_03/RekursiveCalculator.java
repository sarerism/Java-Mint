package tag_03;

public class RekursiveCalculator {

    public static void mystery(int p, int q){

        if (p == 0 ) {
            System.out.println(q);
        }
        else {
            p--;
            q++;
            mystery(p, q);
        }
    }

    public static void main(String[] args) {

        mystery(4, 3);

    }
    
}

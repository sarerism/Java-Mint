package tag_01;

public class Puzzle { 
    public static void main(String[] aargs){
        int l;
        int x = 4;
        int y = 4;
        int x2 =5;
        x = x -1;
        int a = x;
        l = a-y;
        int y2 = (a-(y))*l;
        int f = ((a+y) * (x+ y))+y2;
        f = f / 2;
        double z = Math.pow(x2,2);
        System.out.println ( f + " == " + z + " " + (f==z) );
        System.out.println ( " z " );

    }
    
}

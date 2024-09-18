/*
 * Das ist Aufgabe 04 teil c
 */

package tag_03;

public class Tetrahedron {
    
    public static int sum(int n){
        return (n*(n+1))/2;
    }

    public static int tetrahedron(int n){
        if (n == 1) {
            return 1;
        }
        return tetrahedron(n-1) +sum(n);
    }

    public static void main(String[] args){

        for (int i = 1; i<= 10; i++){
            System.out.println("Tetrahedron(" + i + ") = " + tetrahedron(i));
        }
    }

}

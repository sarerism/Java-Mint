package tag_02;

public class Aufgabe_08 {
    public static void main(String[] args){
        
        String text1 = "Sareer";
        String text2 = "cahn";
        String text3 = "sareer";
        
        if (text1.equals(text2) && text1.equals(text3) && text2.equals(text3)){
            System.out.println("All texts are equal.");
        }
        else if (!text1.equals(text2) && !text1.equals(text3) && !text2.equals(text3)){
            System.out.println("All texts are different.");
        }
        else{
            System.out.println("Two of the texts are equal.");
        }

    }
    
}

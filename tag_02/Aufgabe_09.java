package tag_02;

public class Aufgabe_09 {
    public static void main(String[] args){

        int numberOfCoins = 10;
        int numberOfNotes = 4;
        int totalMoney = numberOfCoins + numberOfNotes*5;
        int price = 26;

        if (totalMoney>price){
            System.out.println("You can buy this item!");
        }
        else{
            System.out.println("Sorry! You CANNOT buy this item!");
        }
    }
}

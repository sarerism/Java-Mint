package tag_01;

public class Cars {
			public static void main(String[] args) {
			
			// Deklarieren Sie eine Variable "numberOfCars" vom Typ int
			// Weisen Sie ihr den Wert 4 zu
			int numberOfCars = 4;

			System.out.println("4 expected: " + numberOfCars);
			
			// Erhoehen Sie den Wert von numberOfCars um 5
            numberOfCars = numberOfCars+5;

			System.out.println("9 expected: " + numberOfCars);

			// Deklarieren Sie eine Variable "typeOfCar" vom Typ String
			// Weisen Sie Ihr den Wert "Ferrari" zu
            String typeOfCar = "Ferrari";
			
			// Lassen Sie sich "9 Ferraris pass by" ausgeben
			// Verwenden Sie dabei beide Variablen

            System.out.println(numberOfCars + " " + typeOfCar + " pass by");
	
    }
	   
    
}

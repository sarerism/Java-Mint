package tag_04;
/**
 * Test for the classes Person and Account *
 */
public class Test {


   public static void main (String[] args) {

	   
	  System.out.println("--- Test Person ---");
	  Person paul = new Person("Paul",20);
	  System.out.println(paul.toString());
	  Person paula = new Person("Paula",19);
	  System.out.println(paula.toString());
	  paul.celebrateBirthday();
	  System.out.println("Age of paul should be 21: " + paul.getAge());
	  
	   
      System.out.println("--- Test constructors of Account ---");
      Account paulsAccount = new Account("DE123",paul,20.0);
      Account paulasAccount = new Account("DE124",paula);

      System.out.println("--- Test get-methods of Account ---");
      System.out.println("Balance of Paul's account (should be 20.0): " + paulsAccount.getBalance());
      System.out.println("Balance of Paula's account (should be 0.0): " + paulasAccount.getBalance());

      System.out.println("--- Test deposit-method of Account ---");
      paulsAccount.deposit(20.50);
      System.out.println("Balance of Paul's account (should be 40.5): " + paulsAccount.getBalance());
      System.out.println("Balance of Paula's account (should be 0.0): " + paulasAccount.getBalance());
      
      //System.out.println("Now an Exception should be thrown: ...")
      //paulasAccount.deposit(-10.0);
 
      System.out.println("--- Test withdraw-method of Account ---");
      paulsAccount.withdraw(10.0);
      System.out.println("Balance of Paul's account (should be 30.5): " + paulsAccount.getBalance());
      System.out.println("Balance of Paula's account (should be 0.0): " + paulasAccount.getBalance());

      //System.out.println("Now an Exception should be thrown: ...")
      //paulsAccount.withdraw(100);
      

      System.out.println("--- Test toString-method of Account ---");
      System.out.println("expected: Account No DE123 by (Person: Paul,20), balance: 30.5");
      System.out.println("actual  : " + paulsAccount.toString());

      System.out.println("--- Test transfer-method of Account ---");
      paulsAccount.transferMoneyTo(10.0,paulasAccount);

   }

}

package tag_04;

/**
 * This class represents a bank account Persons can deposit or withdraw money
 */
public class Account {

	/**
	 * Saves the number of this account
	 **/
	private String accountNumber;

	/**
	 * Saves the owner of this account
	 **/
	private Person owner;

	/**
	 * Saves the balance of this account
	 **/
	private double balance;


	/**
	 * Initializes a newly created Account object
	 **/
	public Account(String accountNumber, Person owner, double balance) {
		if(balance < 0.0) {
			throw new IllegalArgumentException("balance must not be negative");
		}
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	/**
	 * Initializes a newly created Account object Sets the balance of this account
	 * to zero
	 **/
	public Account(String accountNumber, Person owner) {
		this(accountNumber, owner, 0.0);
	}

	/**
	 * Returns the balance of this account
	 * @return balance
	 */
	public double getBalance() {
		return this.balance;
	}

	/**
	 * Withdraw money and lower balance.  
	 * It is not possible to withdraw more money than available
	 */
	public void withdraw(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("amount must be positive");
		} else if (amount > this.getBalance()) {
			throw new IllegalArgumentException("not enough money available");			
		}
		this.balance -= amount;
	}

	/**
	 * Deposit money and increase balance. Max. 10000 per deposit allowed.
	 */
	public void deposit(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("amount must be positive");
		} else if (amount > 10000) {
			throw new IllegalArgumentException("aount must be lower than 10000");			
		}
		this.balance += amount;
	}

	/**
	 * Returns a String representation of this account
	 * 
	 * @return "Account No <accountNumber> by <owner>, balance: <balance>"
	 */
	public String toString() {
		String result = "Account No ";
		result += this.accountNumber;
		result += " by ";
		result += this.owner.toString();
		result += ", balance: ";
		result += this.balance;
		return result;
		
	}
	
	/**
	 * Transfers certain amount of money from this account
	 * to the other account given
	 * 
	 * @param amount must be positive ands lower than 10000
	 * @param account account to which money is transferred
	 */
	public void transferMoneyTo(double amount, Account account) {
		if(amount < 0) {
			throw new IllegalArgumentException("amount must be positive");
		} else if (amount > this.getBalance()) {
			throw new IllegalArgumentException("not enough money available");			
		} else if (amount > 10000) {
			throw new IllegalArgumentException("aount must be lower than 10000");			
		}
		this.withdraw(amount);
		account.deposit(amount);
	}

}

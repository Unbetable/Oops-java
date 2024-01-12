import java.util.ArrayList;

class Bank
{
	//collection
    private ArrayList<Account> accounts;

    
    //constructor 
    public Bank(ArrayList<Account> accounts)
    {
	
		this.accounts = accounts;
	}
    
   // getter method to get the values from collections
    public ArrayList<Account> getAccounts() 
    {
        return accounts;
    }
    
    
    //adding account 
    public void addAccount(Account account)
    {
        accounts.add(account);
    }

    
   //removing account
	public void removeAccount(Account account) {
        accounts.remove(account);
    }

	
	//deposit method
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    //withdraw method
    
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    
    
    @Override
	public String toString() {
		return "Bank [accounts=" + accounts + "]";
	}
    

	public static void main(String[] args) 
    {
    	 ArrayList<Account> accountList = new ArrayList<>(); // Creating the ArrayList for accounts

         Bank bank = new Bank(accountList);

         
        // Create some Account objects
        Account account1 = new Account("John Doe", "1234567890", 1000.0);
        Account account2 = new Account("Jane Smith", "0987654321", 500.0);
       

        // Add the accounts to the collection
        bank.addAccount(account1);
        bank.addAccount(account2);
        
        System.out.println(bank);
        System.out.println("-----------------------------------------------");
        // Deposit and withdraw money from an account
        bank.deposit(account1, 500.0);
        //in account 1 we are adding 500 means 1000+500=1500
        System.out.println("Deposit"+bank);
        
        System.out.println("---------------------------------------------------------");
        bank.withdraw(account2, 100.0);
        //accoun2 we are withdraw ing  500-100=400
        System.out.println("Withdraw"+bank);
        

       
    }
    
     
}


// class account to balance all operations
class Account 
{
    private String name;
    private String accountNumber;
    private double balance;

    
    //constructor for above attributes 
    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    //getter methods

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

     //deposit method if we want to deposit in collection and update amount
    public void deposit(double amount) {
        balance += amount;
    }

    //withdraw method and update the amount
    public void withdraw(double amount) {
        balance -= amount;
    }

	@Override
	public String toString() {
		return "Account [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
     
    
}





    

	

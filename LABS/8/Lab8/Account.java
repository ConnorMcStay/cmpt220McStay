
public class Account {
	
	public int id = 0; 
	public double balance = 0 ;
	public double annualInterestRate = 0; 
	public java.util.Date dateCreated;
	
	public Account() {
		dateCreated = new java.util.Date();
	}
	public Account(int id , double balance) {
		this(); 
		this.id = id;
		this.balance = balance; 
	}
		public int getId() {
			return this.id; 
		}
		public double getbalance(){
			return this.balance;
		}
		public double getannualInterestRate () {
			return this.getannualInterestRate(); 
		}
		public String getDateCreated() {
	        return this.dateCreated.toString();
	    }
		public void setId(int id) {
	        this.id = id;
	    }
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }
	    public void setAnnualInterestRate(double annualInterestRate) {
	        this.annualInterestRate = annualInterestRate;
	    }
	    public double getMonthlyInterestRate() {
	        return (annualInterestRate / 100) / 12 ;
	    }
	    public double getMonthlyInterest() {
	        return balance * getMonthlyInterestRate();
	    }
	    public void withdraw(double amount) {
	        this.balance -= amount;
	    }

	    public void deposit(double amount) {
	        this.balance += amount;
	    }

	}
			



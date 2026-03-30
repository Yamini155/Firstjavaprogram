package bankaccountProgram;
class BankAccount {
    private double balance;
    
    public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(int amount) {
            balance -= amount;
            System.out.println("Amount withdrawl:" + amount);
           
    }
   
}

class SavingsAccount extends BankAccount{
	double balance=1000;
	 void withdraw(int amount) {
	        if (amount >= balance) {
	            balance += amount;
	            System.out.println("Savings Account is: " + balance);
	        }else {
	            System.out.println("Insufficient balance");
	        }
	    }
	
}

class CurrentAcount extends BankAccount{
	double balance=100000;
	 void withdraw(int amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Current Account is: " + balance);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }
	
}
	


public class BankAccountDemoMain {

	public static void main(String[] args) {
		
		SavingsAccount obj1= new SavingsAccount();
		obj1.withdraw(10000);
		
		CurrentAcount obj2= new CurrentAcount();
		obj2.withdraw(10000);
		

	}

}

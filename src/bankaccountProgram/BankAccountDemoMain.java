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
	
	 void withdraw(int amount) {
		 double balance=getBalance();
	        if (amount <= balance) {
	            balance -= amount;
	            setBalance(balance);
	            System.out.println("Savings Account is: " + balance);
	        }else {
	            System.out.println("Insufficient balance");
	        }
	    }
	
}

class CurrentAcount extends BankAccount{
	
	 void withdraw(int amount) {
		 double balance=getBalance();
	        if (amount <= balance) {
	            balance -= amount;
	            setBalance(balance);
	            System.out.println("Current Account is: " + balance);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }
	
}
	


public class BankAccountDemoMain {

	public static void main(String[] args) {
		
		SavingsAccount obj1= new SavingsAccount();
		obj1.deposit(10000);
		obj1.withdraw(1000);
		System.out.println("savings balance :" + obj1.getBalance());
		
		
		
		CurrentAcount obj2= new CurrentAcount();
		obj2.deposit(1000);
		obj2.withdraw(100);
		System.out.println("current balance :" +obj2. getBalance());
		
		
		
		

	}

}

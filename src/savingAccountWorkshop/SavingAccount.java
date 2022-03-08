package savingAccountWorkshop;



public class SavingAccount {
	
	/**
	 * creat a static Variable Annual Interest 
	 * 
	 */
	
	public static double annualInterestRate;
	public double savingBalance;
	
	public static double getAnnualInterestRate() {
		 return annualInterestRate;
	}
	

	public double getSavingBalance() {
		return savingBalance;
	}
	
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingAccount.annualInterestRate = annualInterestRate;
	}
	
	/**
	 * calculating SavingBalance by finding the monthlyInterestRate
	 */
	public void calculateInterest() {
		
		double savingBalance = getSavingBalance();
		double annualInterestRate = getAnnualInterestRate();
		
		double monthlyInterest = savingBalance * ((annualInterestRate/100)/12);
		
			savingBalance = savingBalance + monthlyInterest;
			setSavingBalance(savingBalance);
			
	}
	/**
	 * modify my rate for calculating new InterestRate
	 * @param newInterestRate
	 */
	
	public static void modifyRate(double newInterestRate) {
		setAnnualInterestRate(newInterestRate);
	}
	
	SavingAccount(double savingBalance) {
		setSavingBalance(savingBalance);
		setAnnualInterestRate(savingBalance);
	}
	
	

	
}

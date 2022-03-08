package savingAccountWorkshop;

public class Main {
	
	public static void main(String[] args) {

        System.out.println("Banking - Saving Account Annual and Monthly Interest Calculation");

        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);

        System.out.println("Savings Balance of saver 1: Rs." + saver1.getSavingBalance());
        System.out.println("Savings Balance of saver 2: Rs." + saver2.getSavingBalance());

        /**
         * set my Annual Interest rate as 4%
         */
        SavingAccount.setAnnualInterestRate(4);
        System.out.println("First Month Interest rate set to " + SavingAccount.getAnnualInterestRate() + "%.");

        /**
         * calculating AnnualInterest for 4 % for saver1 and saver 2
         */
        saver1.calculateInterest();
        saver2.calculateInterest();

        System.out.println("Savings balance of saver 1  " + SavingAccount.getAnnualInterestRate() + "% interest: Rs." + saver1.getSavingBalance());
        System.out.println("Savings balance of saver 2  " + SavingAccount.getAnnualInterestRate() + "% interest: Rs." + saver2.getSavingBalance());

        /**
         * set my Annual Interest rate as 4%
         */
        
        SavingAccount.modifyRate(5);
        System.out.println("Second Month Interest rate set to " + SavingAccount.getAnnualInterestRate() + "%.");


        /**
         * calculating AnnualInterest for 4 % for saver1 and saver 2
         */
        
        saver1.calculateInterest();
        saver2.calculateInterest();

        System.out.println("Savings balance of saver 1  " + SavingAccount.getAnnualInterestRate() + "% interest: Rs." + saver1.getSavingBalance());
        System.out.println("Savings balance of saver 2  " + SavingAccount.getAnnualInterestRate() + "% interest: Rs." + saver2.getSavingBalance());

    }
}
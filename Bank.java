package assignmentsday2;

public class Bank extends SBI {

	public void creditScore() {
		System.out.println("CreditScore = 99");
		
	}

	public void minimumBalance() {
		System.out.println("MinimumBalance = 500");
		
	}

	public void cibilScore() {
		System.out.println("CibilScore = 83");
		
	}

	@Override
	public void bankBalance() {
		System.out.println("BankBalance = 1000000");
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("MaximumLoanAmount = 5Lacks");
		
	}
	public static void main(String[] args) {
		Bank details = new Bank();
		details.creditScore();
		details.minimumBalance();
		details.bankBalance();
		details.itLoan();
		details.maximumLoanAmount();
		details.cibilScore();
		
		
		//we can only call specified class and interface by changing the object ClassName 
		//for SBI
		/*SBI details = new Bank();
		details.bankBalance();
		details.cibilScore();
		details.creditScore();
		details.maximumLoanAmount();
		details.minimumBalance();*/
		
		//for PNB
		/*PNB details = new Bank();
		details.cibilScore();
		details.creditScore();
		details.maximumLoanAmount();
		details.minimumBalance();*/
		
		//for CIBIL
		/*CIBIL details = new Bank();
		details.cibilScore();*/		
	}

}

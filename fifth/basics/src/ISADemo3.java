abstract class Loan{
	protected double amount;
	protected String name;
	abstract void roi();
	//abstract void adharNumber();
//	void roi() {
//		System.out.println("Loan ROI 7%");
//	}
	void report() {
		System.out.println("Loan History");
	}
}
class HomeLoan extends Loan{
	void insurance(){
		System.out.println("Home Loan Need Insurance");
	}
	void taxBenefit() {
		System.out.println("Tax ");
	}
	@Override
	void roi() {
		//super.roi();
		System.out.println("Loan ROI 9%");
	}
	
}
class AutoLoan extends Loan{
	@Override
	void roi() {
		System.out.println("Loan ROI 11%");
	}
}
class PersonalLoan extends Loan{
	@Override
	void roi() {
		System.out.println("Loan ROI 14%");
	}
	void durationLess(){
		System.out.println("Less Duration of Payment");
	}
}
public class ISADemo3 {
	
	static void callMe(Loan loan){
		loan.roi();
		loan.report();
		if(loan instanceof HomeLoan) {
		HomeLoan hl = (HomeLoan)loan; // Downcasting
		hl.insurance();
		hl.taxBenefit();
		}
		else
		if(loan instanceof AutoLoan) {
			AutoLoan al = (AutoLoan) loan;
		}
		else
		if(loan instanceof PersonalLoan) {
			PersonalLoan pl = (PersonalLoan) loan;
			pl.durationLess();
		}
		System.out.println("***************************");
	}
	
	public static void main(String[] args) {
		// Upcasting
		//callMe(new Loan());
		callMe(new HomeLoan());
		callMe(new AutoLoan());
		callMe(new PersonalLoan());
		//Loan loan = new HomeLoan(); 
		//loan = new PersonalLoan();
		//loan = new AutoLoan();
		//loan.report();
		//loan.roi();
		//loan.insurance();
		/*
		HomeLoan homeLoan = new HomeLoan();
		homeLoan.insurance();
		homeLoan.roi();
		homeLoan.taxBenefit();
		homeLoan.report();
		System.out.println("*********************");
		AutoLoan autoLoan = new AutoLoan();
		autoLoan.report();
		autoLoan.roi();
		System.out.println("#########################");
		PersonalLoan personaLoan = new PersonalLoan();
		personaLoan.durationLess();
		personaLoan.report();
		personaLoan.roi();
		*/
		

	}

}

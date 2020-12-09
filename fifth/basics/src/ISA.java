class Account{
	int accountNumber;
	String name;
	double balance;
	int x = 100;
	
	void printBalance() {
		System.out.println("Print Balance is "+balance);
	}
	void roi() {
		System.out.println("ROI 3%");
	}
}
class SavingAccount extends Account{
	int x = 200;
	@Override
	void roi() {
		super.roi();
		//int z = this.x + this.x;
		int z = super.x + x;
		System.out.println("ROI 5% "+z);
	}
}
public class ISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount();
		sa.roi();
		sa.printBalance();

	}

}

package basics2;

interface DAO{
//abstract interface DAO{
	int MAX_USERS = 1000; // public static final int MAX_USERS = 1000;
	public abstract void create();   
	void read(); // public abstract void read();
		
}
interface Credentials{
	int TOTAL = 10; // public static final int TOTAL = 10;
	void auth();
	void close();
}
interface Transaction{
	int TOTAL = 20; // public static final int TOTAL = 20;
	void commit();
	void close();
}
interface Mix extends Credentials, Transaction{
	
}


abstract class CommonDB implements DAO{
	void login(){
		System.out.println("Common Login");
	}
	@Override
	public void create() {
		System.out.println("COMMON DAO CREATE....");
	}
//	@Override
//	public void read() {
//		System.out.println("Oracle DAO Read...");
//	}
}

class OracleDAO extends CommonDB implements Credentials, Transaction{
	
	@Override
	public void login() {
	//protected void login() {
		System.out.println("ORACLE LOGIN");
	}
	@Override
	public void read() {
		System.out.println("Oracle DAO Read...");
	}
	@Override
	public void commit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void auth() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

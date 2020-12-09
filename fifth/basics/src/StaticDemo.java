class User{
	 String userid;
	 String pwd;
	 static int noOfUserLoggedin;
	User(String userid, String pwd){
		this.userid = userid;
		this.pwd = pwd;
		noOfUserLoggedin++;
	}
	
}
class Emp{
	// Instance Variables
	//final int id =1 ;
	int id;
	String name;
	double salary;
	static final int MAX  = 1000;
	static int countEmployee;
	Emp(){
		//id = 1;
		if(countEmployee<MAX) {
		countEmployee++;
		}
		id++;
		System.out.println("Id is "+id+" Count is "+countEmployee);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		final int MAX = 1000; // Local Variable
		//static int A = 10; // Error
		//private int a = 100;
		User user = new User("amit","a1111");
		User user2 = new User("ram","ram12");
		System.out.println("Emp "+Emp.countEmployee);
		//System.out.println(Emp.id);
		
		Emp ram1 = new Emp();
		Emp ram2 = new Emp();
		Emp ram3 = new Emp();
		Emp ram4 = new Emp();
		
		
	}

}

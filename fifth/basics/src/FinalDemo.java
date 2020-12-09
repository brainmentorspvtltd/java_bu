// Utility Class
final class MathOperations{
	private MathOperations(){}
	
	static void sin() {
		
	}
	static void cos() {
		
	}
}
class P{
	int x, y;
	final void show() {
		System.out.println("I am Show I dont want no one override me");
	}
}
class C1 extends P{
	int z;
//	@Override
//	void show() {
//		System.out.println("I Done Override...");
//	}
}

public class FinalDemo {

	public static void main(String[] args) {
		//Math.abs(a)
		final C1 obj = new C1();
		//obj= new C1();
		System.out.println(obj.x++);
		obj.y = 100;
		System.out.println(obj.x + (++obj.y));
		MathOperations.sin();
		MathOperations.cos();
		//MathOperations math = new MathOperations();
		// TODO Auto-generated method stub
		int x = 100;
		x++;
		final int MAX  = 100;
		//MAX++;

	}

}

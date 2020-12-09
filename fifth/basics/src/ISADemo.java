
class A{
	A(){
		System.out.println("A Cons Call");
	}
	A(int x){
		this();
		System.out.println("A Param Cons");
	}
}

class B extends A{
	B(){
		// super();
		super(1000);
		System.out.println("B Cons Call");
	}
	B(int x){
		this();
		//super(200);
		System.out.println("B Param Cons Call");
	}
}

class C extends B{
	C(){
		super(300);
		//super();
		System.out.println("C Cons Call");
	}
	C(int x){
		this();
		//super(100);
		//super();
		// super();
		System.out.println("C Param Cons Call");
	}
}

public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C(100);

	}

}

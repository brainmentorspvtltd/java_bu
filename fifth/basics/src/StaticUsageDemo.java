import java.io.File;
//import java.lang.*;
import static java.lang.System.out;

class P2{
	static int x;
	int z;
	static {
		x = 1000;
		//z = 100;
		System.out.println("X is "+x);
	}
	P2(){
		x = 2000;
		z = 100;
	}
}
public class StaticUsageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub c:\\amit\\documents
		File file = new File("/Users/amit/Documents/java-bu/myfolder");
		file.mkdir();
		out.println(P2.x);

	}

}

package basics2;
class Producer implements WhatToShow, WhatToShow2{
	@Override
	public void expose() {
		System.out.println("Expose");
	}
	public void notShow() {
		System.out.println("Not Show");
	}
}
interface WhatToShow2{
	public void expose();
	public void notShow();
}
interface WhatToShow{
	public void expose();
}
class Consumer2{
	
}
class Factory{
	static WhatToShow createObject() {
		WhatToShow p = new Producer();
		return p;
	}
}
class Consumer{
	void call() {
		WhatToShow w = Factory.createObject();
		w.expose();
//		WhatToShow2 p = new Producer(); // Upcasting
//		p.expose();
		//p.notShow();
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer c = new Consumer();
		c.call();

	}

}

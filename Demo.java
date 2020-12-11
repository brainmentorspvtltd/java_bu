
class Node<T> {//extends Object{
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
		//this.next = null;
	}
//	@Override
//	public int hashCode() {
//		return 7;
//	}
	
	@Override
	public String toString() {
		return "Node Info "+data +" Ref "+next;
	}
	
}
class LinkedListOperations<T>{
	Node<T> start;
	Node<T> tail;
	
	void insertAtBeg(Node<T> node) {
		if(start == null) {
			start = node;
		}
		else {
			node.next = start;
			start = node;
		}
	}
	void delInBeg(){
		if(start == null) {
			System.out.println("LL is Empty");
			return ;
		}
		if(start.next==null) {
			start = null;
			System.out.println("Deleted....");
			return ;
		}
		Node<T> temp = start;
		start = start.next;
		temp = null;
		System.out.println("Deleted....");
		
	}
	
	void insertByPos(Node<T> node , int pos) {
		if(pos == 0) {
			node.next = start;
			start = node;
			return ;
		}
			
		Node<T> temp = start;	
		if(pos>0) {
			int i = 1;
			while(i<pos) {
				temp= temp.next;
				i++;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}
	
	void insertAtEnd(Node<T> node){
		if(start == null) {
			tail = start = node;
		}
		else {
			tail.next = node;
			tail = node;
//			Node<T> temp = start;
//			while(temp.next!=null) {
//				temp = temp.next;
//			}
//			temp.next = node;
		}
	}
	void print() {
		Node<T> temp = start;
		while(temp!=null) {
		System.out.println(temp.data);
		temp = temp.next;
		}
		
	}
	
	void reverseLL(){
		Node<T> prev = start;
		Node<T> current = prev.next;
		while(current!=null) {
			Node<T> ahead = current.next;
			current.next = prev;
			prev = current;
			current = ahead;
		}
		Node<T> temp = start;
		start = tail;
		tail = temp;
		tail.next = null;
		
	}
	
	void findKthNodeFromEnd( int k){
		Node<T> p, q;
		p = q = start;
		for(int i = 1; i<=k ; i++) {
			q = q.next;
		}
		while(q!=null) {
			p = p.next;
			q = q.next;
		}
		System.out.println("Kth node value is "+p.data);
	}
	
	void detectLoop() {
		Node<T> slow = start;
		Node<T> fast = start;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println("Loop Detected...");
				break;
			}
		}
		if(slow!=fast) {
			System.out.println("No Loop Found...");
			return ;
		}
		slow = start;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next.next;
			
		}
		fast.next = null; // remove loop
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations<Integer> opr = new LinkedListOperations<>();
		Node<Integer> node = new Node<>(10);
		opr.insertAtEnd(node);
		Node<Integer> node2 = new Node<Integer>(20);
		opr.insertAtEnd(node2);
		opr.insertAtEnd(new Node<Integer>(30));
		Node<Integer>  node3 = new Node<Integer>(1000);
		node3.next = node2;
		opr.insertAtEnd(node3);
		opr.detectLoop();
		opr.print();
		//Node<String> node = new Node<String>("Amit");
		//System.out.println(node);

	}

}

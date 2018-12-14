
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDups r = new RemoveDups();
		r.head = new Node(10); 
		r.head.next = new Node(12); 
		r.head.next.next = new Node(11); 
		r.head.next.next.next = new Node(11); 
		r.head.next.next.next.next = new Node(12); 
		r.head.next.next.next.next.next = new Node(11); 
		r.head.next.next.next.next.next.next = new Node(10); 
		r.printList(r.head);
		
		r.removeDuplicates(r.head);
		r.printList(r.head);
	}

}

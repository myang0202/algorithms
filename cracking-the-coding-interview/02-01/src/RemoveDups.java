import java.util.HashSet;

public class RemoveDups {
	public Node head;
	

	public void removeDuplicates(Node head) {
		Node current = head; 
		Node prev = null;
		HashSet<Integer> set = new HashSet<Integer>();
		while(current != null) {
			if(set.contains(current.value)) {
				prev.next = current.next;
			}
			else {
				set.add(current.value);
				prev = current;
			}
			current = current.next;
		}
	}
	public void printList(Node head)  
	    { 
	        while (head != null)  
	        { 
	            System.out.print(head.value + " "); 
	            head = head.next; 
	        } 
	        System.out.println("");
	    } 
}

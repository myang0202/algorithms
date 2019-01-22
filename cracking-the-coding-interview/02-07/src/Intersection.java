/**
 * Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.
 * @author myang0202
 *
 */
public class Intersection {
	
	public LinkedListNode findIntersection(LinkedListNode node1, LinkedListNode node2) {
		if(node1 == null || node2 == null) {
			return null;
		}
		LinkedListNode tempNode1 = node1;
		LinkedListNode tempNode2 = node2;
		
		int node1length = 1;
		int node2length = 1;
		//traverse to the end for varification
		while(tempNode1.next != null && tempNode2.next != null) {
			if(tempNode1.next != null) {
				node1length++;
				tempNode1 = tempNode1.next;
			}
			
			if(tempNode2.next != null) {
				node2length++;
				tempNode2 = tempNode2.next;

			}
		}
		if(tempNode2 != tempNode1) {
			return null;
		}
		
		int difflength = node1length - node2length;
		LinkedListNode shorterList = node1length<=node2length ? tempNode1 : tempNode2;
		LinkedListNode longerList = node1length>=node2length ? tempNode2 : tempNode1;

		for(int i = 1; i < difflength; i++) {
			// iterate longerlist
		}
		
		for(int j = 0; j < node1length; j++) {
			if(tempNode1 == tempNode2) {
				return tempNode1;
			}
			tempNode1 = tempNode1.next;
			tempNode2 = tempNode2.next;

		}
		
		return node1;
	}
}

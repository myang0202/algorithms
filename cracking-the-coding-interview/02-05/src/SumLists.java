
public class SumLists {
	
	public Node addLists(Node n1, Node n2) {
		
		Node sumList = null;
		int addToNextList = 0;
		int addToThisList = 0;
		while(n1 != null && n2 != null)
		{
			if(n1 == null) {
				sumList.next = new Node(n1.val + addToNextList);
				n2 = n2.next;
			}
			else if(n2 == null) {
				sumList.next = new Node (n2.val + addToNextList);
				n1 = n1.next;
			}
			else {
				if(n1.val + n2.val >= 10) {
					addToThisList = (n1.val + n2.val)%10;
					sumList.next = new Node(addToThisList + addToNextList);
					addToNextList++;
				}
				else {
					sumList.next = new Node(n1.val + n2.val + addToNextList);
				}
				n1 = n1.next;
				n2 = n2.next;
				addToNextList = 0;
			}
			
		}
		return sumList;
	}
}

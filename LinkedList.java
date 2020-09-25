public class LinkedList{
	Node head;
	Node tail;
	int size;

	public LinkedList(){
		head = null;
		tail = null;
		size = 0;
	} // i returns the number of element

	public int size(){
		return size;
	}// check if the list is empty an if it is then it returns true if not false

	public boolean isEmpty(){
		if (size == 0) {
			return true;
		}
		return false;
	}
	// returns the first element of the list
	public int first(){
		return head.getElement();
	}
	// returns the last element of the list
	public int last(){
		return tail.getElement();
	}

	// it is used to add new element infront of the list
	public void addFirst(int n){
		Node newest = new Node(n, null);
		// if the head and tail of the list is zero the they both point to the newest node

		if (size == 0) {
			 head = newest;
			 tail = newest;
		}


		else{
			newest.setNext(head);
			head = newest;
		}
		size = size + 1;
	}

	// to add element at the end of the linked list
	public void addLast(int n){
		Node newest = new Node(n, null);
		if (size == 0) {
			head = newest;
			tail = newest;
		}
		else{
			tail.setNext(newest);
			tail =newest;
		}
		size += 1;
	}

	// it removes the first element of the linked list
	public int removeFirst(){
		//it stores the value
		int deletedElement = head.getElement();
		if (size == 0) {
			return 0;
		}
		else{
			head = head.getNext();
			size = size -1;
		}
		return deletedElement;
	}



}

class Node{
	private int element;
	private Node next;
	// node constructor
	public Node(int element, Node next ){
	    this.element = element;
		this.next = next;
	}

	// getElement is used to get the private variable element
	public int getElement(){
		return element;
	}

	// getNext() ids used to get the net node
	public Node getNext(){
		return next;
	}

	// 
	public void setElement(int n){
		element = n;
	}

	// 
	public void setNext(Node n){
		next = n;
	}
}
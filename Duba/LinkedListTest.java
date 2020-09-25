public class LinkedListTest{
	public static void main(String[] args) {
		LinkedList obj1 = new LinkedList();


		obj1.addFirst(30);
		obj1.addLast(33);
		obj1.addLast(420);
		// assert is used to test the methods of linked list
		// System.out.println(obj1.size());
		assert(obj1.isEmpty() == false);
		assert(obj1.size() == 3);
		assert(obj1.first() == 1);
		assert(obj1.last() == 3);
		assert(obj1.removeFirst() == 1);
		assert(obj1.size() == 2);
		assert(obj1.first() == 2);
		System.out.println("All Test Cases Passed");
	}
}
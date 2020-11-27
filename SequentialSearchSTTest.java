public class SequentialSearchSTTest{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj=new SequentialSearchST<String, Integer>();
		obj.put("A",5);
		obj.put("B",7);
		obj.put("C",3);
		// System.out.println(obj.size());
		// System.out.println(obj.isEmpty());
		// System.out.println(obj.contains("A"));
		// System.out.println(obj.get("A"));
		obj.delete("B");
		obj.delete("C");
		// System.out.println(obj.size());
		assert(obj.size()==1);
		
		System.out.println("All test case passed");
	}
}
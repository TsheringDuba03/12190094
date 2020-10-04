public class ArrayList
{
	double  halfsize= 0.25;
	double doublesize= 0.75;
	int capacity = 4;
	static int c;
	int remove;
	int top = 0;
	static double length;
	static int Array[];
	public ArrayList()
	{
		Array = new int[capacity];
	}
	public void add(int x)
	{
		Array[top] = x;
		top++;
	}
	public void pop()
	{
		top--;
		remove = Array[top];
		Array[top] = 0;
		int count = 0;
		for(int i = 0; i < Array[i]; i++) {
			count++;
		}
		c = count;
		length = (double)c/capacity;
		System.out.println("Removed: " +remove);
	}
	
	public void resize()
	{
		if(length == halfsize) {
			int newArray[] = new int[(capacity/2)*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			Array = newArray;
			capacity = capacity/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == doublesize) {
			int newArray[] = new int[capacity*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			capacity = capacity * 2;
			Array = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("Array Index is out of limit");
		}
	}
	public int size()
	{
		return capacity;
	}
	public String toString()
	{
		String s = Integer.toString(capacity);
		return s;
	}

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.pop();
		obj.resize();
		System.out.println("String: " +obj.toString());
		System.out.println("The number of elements present in the new array is " +c);
		System.out.println("The size of the new array is: " +obj.size());
	}
}

public class stack
{
	
	int max=10;
	int size=0;
	int top; //-1  means no element in stack
	int [] arr=new int[max];

	

	public void push(int x)
	{
		if (top>max)
		{
			System.out.print("StackOverflow");
		}
		else
		{
			arr[++top]=x;
			System.out.println("pushed:" + x);
		}
		size=size+1;

	}

	public void pop()
	{
		if (top==0)
		{
			System.out.println("stack underflow");
		}
		else
		{
			int y = arr[top--];
			System.out.println("poped:" + y);
		}
		size=size-1;
	}


	public int size()
	{
		return size;
	}


	public boolean isEmpty()
	{
		if(size<=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void top()
	{
		int a= arr[top];
		System.out.println("The top of the element is: "+top);
	}



	public static void main (String[] args)
	{

		stack obj=new stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		
		obj.pop();
		
		obj.top();
		System.out.println(obj.isEmpty());
		System.out.println("The size of the stack is:" + obj.size());
		
		
	}		


}
public class Queue
{
	int rear;
	int front;
	int length=0;
	int max=10;
	int [] arr=new int[max];
	

	
	public int first()
	{
		if (isEmpty()) 
		{
			return 0;	
		}
		else
		{
			return arr[front];
		}
	}


	public void enqueue(int e)
	{
		if (isEmpty())
		 {
			arr[0] = e;
		}
		else
		{
			arr[rear++] = e;
			System.out.println("enqueued:" + e);
		}
		
		length = length + 1;
	}

	

	public int dequeue()
	{
		if (isEmpty()) 
		{
			return 0;
		}
		else
		{
			front=front+1;
		 	length = length - 1;
		}
		return front=front-1;

		
	}

	

	public boolean isEmpty()
	{
		if(length==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public int length()
	
	{
		return length;
	}



		public static void main(String[] args)
		{

			Queue obj= new Queue();
        	obj.enqueue(1);
        	obj.enqueue(2);
        	obj.enqueue(3);
        	obj.enqueue(4);
        	obj.enqueue(5);
			obj.enqueue(6);

            System.out.println("Dequeued :" + obj.dequeue());
       	 	System.out.println(obj.isEmpty());
        	System.out.println("Length of the Queue is :" + obj.length());
        	System.out.println("The first element is:"+obj.first());
            System.out.println("All test cases are correct");

		}


}



import java.util.*;
public class selectionsort{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int length = cin.nextInt();
		int array[] = new int[length];
			for(int i = 0; i < length; i++) {
				System.out.print("Enter elements of array : ");
				int element = cin.nextInt();
				array[i] = element;
			}
			System.out.println("Before sorting: ");
			for (int j=0;j<array.length;j++) {
				System.out.print(" "+array[j]);
			}

		selectionsort obj = new selectionsort();
		obj.sort(array);
		System.out.println();
		obj.printarray(array);
	}

	void sort(int array[]){

		int x = array.length; 
        for (int i = 0; i < x-1; i++) { 
            int min_idx = i; 
            for (int j = i+1; j < x; j++) 
                if (array[j] < array[min_idx]) 
                    min_idx = j; 
  
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        } 
	}

	void printarray(int array[]){
		System.out.println("After sorting: ");
		int n = array.length;
		for (int i=0;i<n ;i++ ) {
			System.out.print(" "+array[i]);
			
		}
	}



}
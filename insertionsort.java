import java.util.*;
public class insertionsort{
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

		insertionsort obj = new insertionsort();
		obj.sort(array);
		System.out.println();
		obj.printarray(array);
	}

	
	void sort(int array[]){

		int x = array.length;
		for (int i=1; i<x ;i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key){
				array[j + 1] = array[j]; 
                j = j - 1; 
			}
			array[j+1] = key;
		}
	}

	void printarray(int array[]){
		System.out.println("After sorting: ");
		int x = array.length;
		for (int i=0;i<x ;i++ ) {
			System.out.print(" "+array[i]);
			
		}
	}


}
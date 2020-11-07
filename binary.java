import java.util.*;
public class binary{
	public static void sort(int a[]){
		int n =a.length;

		for(int i =0;i<n-1;i++){
			int smallest = i;
			for(int k =i;k<n;k++){
				if(a[k]<a[smallest]){
					smallest =k;
				}
			}
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
			}
	}
	public static void binary(int a[],int n,int first,int last,int search){
		int mid = (first+last)/2;
		while(first<=last){
		
		
		 if(search <a[mid]){
			last=mid-1;
		}
		else if(search==a[mid]){
			System.out.println(" element is found");
                                      break;
}
		else if(search >mid){
			first = mid+1;
		}
		mid =(first + last)/2;

if(first>last){
	System.out.println("Element is not found");
}

	}


	}
	public static void main(String [] args){
	  	binary obj = new binary();

		int [] a= {7,5,9,0,2,4,3,6};
		int n= a.length;
		obj.sort(a);
		for(int i=0;i<n;i++){
		System.out.println(" "+a[i]);
		}
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the element you want to search: ");
		int search = ob.nextInt();
		obj.binary(a,n,0,4,search);
	}
		
}
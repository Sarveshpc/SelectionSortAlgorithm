package Arrays;
import java.io.*;
public class SelectionSort
{
	//dynamically abstarct methods design :
	//we can write a code of selection Sort arrays o(n)^2
																															
	
	//int arr[] = {11,12,22,25,64} shifting 4th positon of arrays 
	//int arr[] = {11,25,22,12,64}
	
	//shifting sorting of arrays :
	void sort(int arr[])
	{
		int n = arr.length;
//unsorted arrays can be convert sorted :
		//flow of iterations :
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Prints the array
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
/* This code is contributed by Rajat Mishra*/

package demo.test;


public class MergeSort
{
	// Merges two subarrays of arr[].
	// First subarray is arr[first..mid]
	// Second subarray is arr[mid+1..r]
	
	public static void merge(int arr[], int first, int mid, int end)
	{
		// n1 & n2 holds the sizes of two sub arrays 
		int n1 = mid - first + 1;
		int n2 = end - mid;

		//Create temp array
		int L[] = new int[n1];
		int R[] = new int[n2];

		//Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[first + i];
		
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		//Merge the temp arrays

		int i = 0, j = 0;

		//Initial index of merged sub array array
		int k = first;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		//Copy remaining elements of L[] 
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		//Copy remaining elements of R[] 
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[first..end] using
	void sort(int arr[], int first, int end)
	{
		if (first < end) {
			// Find the middle point
			int mid =first+ (end-first)/2;

			// Sort first and second halves
			sort(arr, first, mid);
			sort(arr, mid + 1, end);

			// Merge the sorted halves
			merge(arr, first, mid, end);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ",  ");
		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}

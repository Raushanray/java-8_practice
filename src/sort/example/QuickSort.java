package sort.example;
/*
 * Time Complexity:-
 * worst : O(n^2)
 * important:- Worst case occurs when pivot is always the smallest or the largest elemet.
 * (And this condition will occurs when the your array is sorted, the sorting order may be  ascending or may be descending..)
 * USE:-QuickSort:- when we have an average cases and we have a less memory.
 * And the Average Time Complexity: O(nlogn)
 */
public class QuickSort {
	public static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			//pidx = pivot index
			int pidx = partition(arr,low,high);
			quickSort(arr, low, pidx - 1);
			quickSort(arr, pidx + 1, high);
		}
	}
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low -1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		//swap with pivot..
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;   //pivot index
	}
	public static void main(String[] args) {
		int [] arr = {6,3,9,5,2,8};
		int n = arr.length;
		quickSort(arr, 0, n-1);
		//print
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

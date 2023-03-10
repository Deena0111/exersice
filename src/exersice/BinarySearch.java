package exersice;

public class BinarySearch {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,50,100};
		int searchElement=10;
		int index=binarySearch(arr,0,arr.length-1,searchElement);
		System.out.println("Element found at index "+index);
	}

	private static int binarySearch(int[] arr, int low, int high, int searchElement) {
		if(high>=low) {
			int mid=low+((high-low)/2);
			if(arr[mid]==searchElement)
				return mid;
			if(searchElement>arr[mid]) {
				//Search the element in the right side of array
				return binarySearch(arr, mid+1, high, searchElement);
			}
			if(searchElement<arr[mid]) {
				//Search the element in the left side of array
				return binarySearch(arr, low, mid-1, searchElement);
			}
		}
		return -1;
	}

}

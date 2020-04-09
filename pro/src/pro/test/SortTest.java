package pro.test;

import java.util.Arrays;

public class SortTest {

	public static int duplicate() {
		int arr[] = { 2, 3, 1, 0, 2, 5, 3 };
		for (int i = 0; i < arr.length; i++) {

			while (arr[i] != i) {
				if (arr[i] == arr[arr[i]])
					return arr[i];
				else {
					int temp = arr[i];
					arr[i] = arr[temp];
					arr[temp] = temp;
					// System.out.println(Arrays.toString(arr));
				}
			}
		}
		return -1;
	}

	public static int getSort(int arr[], int start, int end) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=start&&arr[i]<=end) {
				count++;
				
			}
			
		}
		return count;
	}

	public static int sort(int arr[]) {
		int start = 1;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (end - start) / 2 + start;
			int count = getSort(arr, start, end);
			if (start == end) {
				if (count > 1) {
					return start;

				} else {
					break;
				}

			}
			if (count > mid - start + 1) {
				return mid;

			} else {
				start = mid + 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		int a[] = {2,3,2,4,5};
		System.out.println(sort(a));

	}

}

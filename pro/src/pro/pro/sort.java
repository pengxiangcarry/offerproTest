package pro.pro;

public class sort {
	private void sor(int[] arr) {
		for(int i:arr) {
			System.out.print(i+",");
		}
		
	}
	private void Selectsort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
		}
		this.sor(arr);
	}
	public static void main(String[] args) {
		sort sr=new sort();
		int arr[] = { 12, 13, 10, 54, 4 };
//		sr.sor(arr);
//		for (int i = 1; i < arr.length; i++) {
//			int index = 0;
//			for (int j = 1; j < arr.length - i; j++) {
//				if (arr[j] > arr[index]) {
//					index = j;
//				}
//			}
//			int temp = arr[arr.length - i];
//			arr[arr.length - i] = arr[index];
//			arr[index] = temp;
//
//		}
		sr.Selectsort(arr);
	}

}

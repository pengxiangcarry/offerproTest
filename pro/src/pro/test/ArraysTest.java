package pro.test;

public class ArraysTest {
	public static boolean ArraysT(int arr[][],int number) {
		boolean tar=false;
		int rows=0;
		int comlums=arr[0].length-1;
		
		while(comlums>0&&rows<arr.length) {
			int diff=arr[rows][comlums]-number;
			
			if(diff==0) {
				tar=true;
				break;
			}else if(diff>0){
				comlums--;
			}else {
				rows++;
			}
			
		}
		
		
		return tar;
	}
	public static void main(String[] args) {
		int arr[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(ArraysT(arr,7));
	}

}

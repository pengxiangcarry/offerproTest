package pro.OfferTest.Frist;

public class ArraysMinTest {
	public static int[] GetArrays(int a[]) {
		int b[];
		return null;
	}

	public static int Minnumber(int a[]) {
		int i = 0;
		int j = a.length - 1;
		int min = 0;
		if(a[i]<a[j]) {
			return a[i];
			
		}
		while (a[i] <= a[(i + j) / 2]) {
			if(a[i]==a[(i + j) / 2]&&a[j]==a[(i + j) / 2]) {
				int result=a[i];
				for(int start=i+1;start<=j;start++) {
					if(a[start]<result) {
						result=a[start];
					}
					
				}
				return result;
				
			}
			
			if (a[(i + j) / 2] <= a[j]) {
				j = (i + j) / 2;
				min = a[j];
				break;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int b[]= {2,0,2,2,2};
		int a[] = {1,0,1,1,1,1,1};
		System.out.println(Minnumber(b));
	}
}

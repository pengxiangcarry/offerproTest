package pro.OfferTest.Second;

import java.util.Arrays;

public class ReorderTest {
	public static void reorder(int[] arr) {
		// ��һ��ָ��start
		int i = 0;
		// �ڶ���ָ��
		int j = arr.length - 1;
		int temp = 0;

		if (arr == null || arr.length == 0) {
			return;
		}
		// �ж��Ƿ�Ϊ����
		while (i < j && odd(arr[i])) {
			i++;
		}
		// �ж��Ƿ�Ϊż��j--
		while (i < j && !odd(arr[j])) {
			j--;
		}
		if (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

	}

	public static boolean odd(int val) {

		return (val & 1) == 1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		reorder(arr);
		System.out.println(Arrays.toString(arr));
	}

}

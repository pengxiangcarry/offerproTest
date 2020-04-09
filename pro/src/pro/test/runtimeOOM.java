package pro.test;

import java.util.ArrayList;
import java.util.List;

public class runtimeOOM {
	public static void main(String[] args) {
//		List<String> li = new ArrayList<String>();
//		int i = 0;
//		while (true) {
//			li.add(String.valueOf(i++).intern());
//		}
		String str1=new StringBuilder("¼ÆËã»ú").append("Èí¼ş").toString();
		System.out.println(str1.intern()==str1);
	}

}

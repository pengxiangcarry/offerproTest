package pro.Handle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

class GrandFather{
	public void test(){
		System.err.println("GrandFather");
	}
}
class Father extends GrandFather{
	@Override
	public void test(){
		System.err.println("Father");
	}
}

public class handletest extends Father{
	@Override
	public void test(){
		try{
			MethodType mt= MethodType.methodType(void.class); //方法返回类型
			MethodHandle mh =MethodHandles.lookup().findSpecial(GrandFather.class,"test",mt,getClass());		  
			mh.invoke(this);
		}catch(Throwable e){
			e.printStackTrace();
		}
	}
}

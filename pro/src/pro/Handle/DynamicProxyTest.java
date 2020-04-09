package pro.Handle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
	interface Ihello {
		void sayHello();
	}

	static class Hello implements Ihello {

		@Override
		public void sayHello() {
			System.out.println("hello world");

		}

	}

	static class DynamicProxy implements InvocationHandler {
		Object ob;

		Object bind(Object obj) {
			this.ob = obj;
			return Proxy.newProxyInstance(ob.getClass().getClassLoader(), ob.getClass().getInterfaces(), this);
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			// TODO Auto-generated method stub
			System.out.println("wecome");
			return method.invoke(ob, args);
			
		}

	}
	public static void main(String[] args) {
		Ihello Ih=(Ihello) new DynamicProxy().bind(new Hello());
		Ih.sayHello();
	}

}

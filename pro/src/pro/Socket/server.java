package pro.Socket;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public class server {
	private ServerSocket server;
	private void connection() {
		
		
	}
	public static void main(String[] args) {
		InetAddress ip;
		try {
			ip=InetAddress.getLocalHost();
			String name=ip.getHostName();
			String local=ip.getHostAddress();
			System.out.println(name);
			System.out.println(local);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

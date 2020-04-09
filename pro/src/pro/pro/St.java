package pro.pro;

public enum St {
	Constant_A("sdasd"), 
	Constant_B(10);
	private String str;
	private int s;
	
	public String getStr() {
		return str;
	}
	public int getS() {
		return s;
	}
	private St() {
	}
	private St(String str) {
		this.str = str;
	}
	private St(int s) {
		this.s = s;
	}
	

}

package headquerter;

public class B_I_Order {
	String b_code;
	String i_code;
	int cnt;
	
	public B_I_Order(String b_code, String i_code, int cnt) {
		this.b_code = b_code;
		this.i_code = i_code;
		this.cnt = cnt;
	}

	public String getB_code() {
		return b_code;
	}

	public String getI_code() {
		return i_code;
	}

	public int getCnt() {
		return cnt;
	}

	@Override
	public String toString() {
		return "B_I_Order [b_code=" + b_code + ", i_code=" + i_code + ", cnt=" + cnt + "]";
	}
}

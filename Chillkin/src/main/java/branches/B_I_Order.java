package branches;

public class B_I_Order {
	String B_Code;
	String I_Code;
    int I_Cnt;
    
	public B_I_Order(String b_Code, String i_Code, int i_Cnt) {
		super();
		B_Code = b_Code;
		I_Code = i_Code;
		I_Cnt = i_Cnt;
	}
	public String getB_Code() {
		return B_Code;
	}
	public String getI_Code() {
		return I_Code;
	}
	public int getI_Cnt() {
		return I_Cnt;
	}
	@Override
	public String toString() {
		return "B_I_ORDER [B_Code=" + B_Code + ", I_Code=" + I_Code + ", I_Cnt=" + I_Cnt + "]";
	}
    
}

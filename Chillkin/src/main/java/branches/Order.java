package branches;

public class Order {
	String O_Code;
	String Menu_Code;
	String Branch_Id;
	int O_cnt;
	
	
	public Order(String o_Code, String menu_Code, String branch_Id, int o_cnt) {
		super();
		O_Code = o_Code;
		Menu_Code = menu_Code;
		Branch_Id = branch_Id;
		O_cnt = o_cnt;
	}


	public String getO_Code() {
		return O_Code;
	}


	public String getMenu_Code() {
		return Menu_Code;
	}


	public String getBranch_Id() {
		return Branch_Id;
	}


	public int getO_cnt() {
		return O_cnt;
	}


	@Override
	public String toString() {
		return "Order [O_Code=" + O_Code + ", Menu_Code=" + Menu_Code + ", Branch_Id=" + Branch_Id + ", O_cnt=" + O_cnt
				+ "]";
	}
	
	
}

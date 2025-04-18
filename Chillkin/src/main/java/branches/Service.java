package branches;

import java.util.ArrayList;

public class Service {

	MenuDAO mdao = new MenuDAO();

	OrderDAO odao = new OrderDAO();

	BranchesDAO bdao = new BranchesDAO();
	
	HubDAO hdao = new HubDAO();
	
	B_I_OrderDAO bidao = new B_I_OrderDAO();

	public ArrayList<Menu> selectMenu() {

		ArrayList<Menu> list = mdao.selectAll();

		return list;
	}

	public void insertOrder(String Menu_Code, String Branch_Id, int O_cnt) {
		odao.insertOrder(Menu_Code, Branch_Id, O_cnt);
	}
	
	public ArrayList<Branches> selectBranchesList(){
		return bdao.selectBranches();
	}
	
	public ArrayList<Hub> selectHub(){
		
		return hdao.allHubs();
	}
	
	public void insertBIOrder(B_I_Order i) {
		bidao.insertIORder(i);
	}

}

package branches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class B_I_OrderDAO {
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String password="1234";

	public Connection dbcon() {

		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

			if (con != null)
				System.out.println("db ok~~");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
	
	public void insertIORder(B_I_Order i) {
		Connection con = dbcon();
		PreparedStatement pst = null;
		
		String sql="insert into B_I_Order (B_CODE, I_CODE, I_CNT) VALUES (?,?,?)";
		
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, i.getB_Code());
			pst.setString(2, i.getI_Code());
			pst.setInt(3, i.getI_Cnt());

			pst.executeUpdate();
			
			con.close();
			pst.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		B_I_OrderDAO a = new B_I_OrderDAO();
		B_I_Order b = new B_I_Order("B4444", "I003", 4);
		
		a.insertIORder(b);
	}

}

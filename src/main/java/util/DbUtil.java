package util;

import java.sql.*;

/**
 * @author Lenovo
 */
public class DbUtil {
	
	private static String url="jdbc:mysql://localhost:3306/javaee?serverTimezone=UTC";
	
	private static String userName = "root";
	
	private static String pwd = "rootroot";
	
	private static Connection conn = null;
	
	/**
	 * 静态代码块
	 */
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * static修饰的类方法
	 * @return
	 */
	public static Connection getConnection() {				
		try {
			conn = DriverManager.getConnection(url,userName,pwd);
		} catch (SQLException e) {			
			e.printStackTrace();			
		}
		return conn;
	}
	
	

	
	
	public static void closeBest(Connection conn,PreparedStatement pstm,ResultSet rs) throws SQLException {
		
			if(rs!=null) {
				try {
					rs.close();
				}catch(Exception e) {
					conn.rollback();
					e.printStackTrace();
				}
			}
			
			if(pstm!=null) {
				try {
					pstm.close();
				}catch(Exception e) {
					conn.rollback();
					e.printStackTrace();
				}				
			}
			
			if(conn!=null) {
				try {
					conn.close();
				}catch(Exception e) {
					conn.rollback();
					e.printStackTrace();
				}
				
			}
				
	}

}

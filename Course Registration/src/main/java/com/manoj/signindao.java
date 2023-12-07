package com.manoj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class signindao {
	
	//String url="jdbc:oracle:thin:@localhost:1521:xe";
	String ur="jdbc:mysql://localhost:3306/sam";
	String usr="root";
	String psw="Ms@1234";
	public boolean checkStudent(String un,String ps)
	{
		
		ResultSet rs=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection cn=DriverManager.getConnection(ur,usr,psw);
				String qr="select * from student where username=? and password=?";
				PreparedStatement st=cn.prepareStatement(qr);
				st.setString(1, un);
				st.setString(2, ps);
				rs=st.executeQuery();
				if(rs.next())
					return true;
				cn.close();
			} 
			
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
			return false;
	}
	public void addStudent(String name,String email,String username,String college,String rollno,String place,String password1,String cr) throws ClassNotFoundException, SQLException
	{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(ur,usr,psw);
			String query="insert into student(name,mail,username,college,rollno,place,password,courses)values(?,?,?,?,?,?,?,?)";
	        PreparedStatement p = cn.prepareStatement(query);
	        p.setString(1,name);
	        p.setString(2,email);
	        p.setString(3,username);
	        p.setString(4,college);
	        p.setString(5,rollno);
	        p.setString(6,place);
	        p.setString(7,password1);
	        p.setString(8, cr);
	        int r=p.executeUpdate();
	        cn.close();
	}
	public int deleteStudent(String gmail) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection(ur,usr,psw);
		String query="delete from student where mail='"+gmail+"'";
		PreparedStatement p = cn.prepareStatement(query);
		int r=p.executeUpdate();
		return r;
	}
	public void updateStudent(String name,String username,String pgmail,String ngmail,String password1,String college,String course) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection(ur,usr,psw);
		String query="update student set name =? , username=? , mail=? , password=? , college=? ,courses=? "
        		+ "where mail='"+pgmail+"'";
		PreparedStatement p = cn.prepareStatement(query);
        p.setString(1,name);
        p.setString(2,username);
        p.setString(3,ngmail);
        p.setString(4,password1);
        p.setString(5,college);
        p.setString(6,course);
        int f=  p.executeUpdate();
        cn.close();
		
	}
	
	
}

package bank1;
import java.sql.*;
public class Dbmanager {
	
	
	private String Pro_driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/bank1";
	private String passwd="";
	private String uname="root";
	
	
	public int show_amt(int acc) 
	{
		int amt = 0;
		try {
		 Class.forName("com.mysql.jdbc.Driver");
	        Connection con=DriverManager.getConnection(url,uname,passwd);
	        Statement stmt=con.createStatement();
	        ResultSet result=stmt.executeQuery("select amt,name from details where accn='"+acc+"'");
	        while(result.next()) {
	        	System.out.println("Hi "+result.getString(2)+" Your balance is");
	        	System.out.println("rs "+result.getInt(1));
	        
	        	amt=result.getInt(1);
	        }
	        con.close();
	  }
	  catch(Exception e) {
		  
		  
	  }
		return amt;
	
		
	}		
	public boolean add_records(String query) {
		boolean flag =false;
		  try {
			    Class.forName("com.mysql.jdbc.Driver");
		        Connection con=DriverManager.getConnection(url,uname,passwd);
		        Statement stmt=con.createStatement();
		        flag=stmt.executeUpdate(query) > 0 ? true:false;
		      
		       
		  }
		  catch(Exception e) {
			  
			  
		  }
		  return flag;
}
	public int amt_cntrl(int acc) 
	{
		int amt = 0;
		try {
		 Class.forName("com.mysql.jdbc.Driver");
	        Connection con=DriverManager.getConnection(url,uname,passwd);
	        Statement stmt=con.createStatement();
	        ResultSet result=stmt.executeQuery("select amt from details where accn='"+acc+"'");
	        while(result.next()) {
	        	
	        
	        	amt=result.getInt(1);
	        }
	        con.close();
	  }
	  catch(Exception e) {
		  
		  
	  }
		return amt;
	
		
	}		
}


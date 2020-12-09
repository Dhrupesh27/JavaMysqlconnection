import java.sql.*;  
class FirstProgram
{  
public static void main(String []a){  
try
{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/Assignment","root","dhrupesh");  
System.out.println("connected with Assignment");  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
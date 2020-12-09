import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class a extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     Connection con=null;
    PrintWriter pw=response.getWriter();
    try
    {
        
        Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/example","root","dhrupesh");  

Statement stmt=con.createStatement(); 
if(request.getParameter("t1").equals(request.getParameter("t2")))
{
stmt.executeUpdate("insert into login_master values('"+request.getParameter("t1")+"','"+request.getParameter("t2")+"')");
}
stmt.close();
con.close();       
    }
    catch(Exception e)
    {
        pw.println(e);
    
    }
    }

}
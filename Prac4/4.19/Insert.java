import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Insert extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
		try{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<h3>Enroll no:130050131060</h3>");
			Connection con=null;
			Statement stmt=null;
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/servlet","postgres","1994");
			stmt=con.createStatement();
			int i=stmt.executeUpdate("insert into student(id,name) values(001,'Meet');");
			if(i!=0){
				pw.println("<h3>Record Inserted</h3>");
				
			}
			else{
				pw.println("<h3>Insertion Failed</h3>");
			}
			
		}
		catch(Exception e){
				System.out.println(e.getMessage());
		}
		
	}
}
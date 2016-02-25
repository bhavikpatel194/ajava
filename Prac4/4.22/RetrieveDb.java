import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletConfig;
public class RetrieveDb extends HttpServlet {
	public void init(ServletConfig c){
	}
	public void doGet(HttpServletRequest rq,HttpServletResponse re) throws ServletException{
		re.setContentType("text/html");
		Connection c=null;
		PreparedStatement s=null;
		ResultSet rs=null;
		try{
			PrintWriter out=re.getWriter();
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5433/servlet","postgres","1994");
			String query="select * from student;";
			s=c.prepareStatement(query);
			out.println("<h1>Info Of Student</h1>");
			out.println("<h2>eno=130050131060</h2>");
			rs=s.executeQuery();
			while(rs.next()){
				out.println("<br/><br/><h3>id:"+rs.getString("id")+"</h3>");
				out.println("<h3>name:"+rs.getString("name")+"</h3>");
			}
		}
		catch(IOException i){
			System.out.println("IOException");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	public void destroy(){
	}
}
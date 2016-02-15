import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class DateTime extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		Date date=new Date();
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("En no:130050131060");
		pw.println("<h1>"+date.toString()+"</h1>");
	}
}
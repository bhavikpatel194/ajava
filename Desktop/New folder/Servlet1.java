import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class Servlet1 extends HttpServlet{  
public void doGet(HttpServletRequest request,HttpServletResponse response)  
throws ServletException,IOException  
{  
response.setContentType("text/html");  
PrintWriter pw=response.getWriter(); 

 pw.println("<h1>Welcome</h1>");
 pw.println("En no: 130050131060");
  }  
}  
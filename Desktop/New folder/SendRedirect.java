import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SendRedirect extends HttpServlet{  
public void doGet(HttpServletRequest request,HttpServletResponse response)  
throws ServletException,IOException  
{  
response.setContentType("text/html");  
PrintWriter pw=response.getWriter();  
String n=request.getParameter("username");  
    String p=request.getParameter("pass");  
          
    if(n.equals("admin") && p.equals("admin")){  
       response.sendRedirect("http://localhost:8080/Servlet1");
    }  
    else{  
          
        response.sendRedirect("http://localhost:8080/SendRedirect.html");
    }  
         
    }  
}  
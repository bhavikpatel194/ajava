import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HolisticCounter extends HttpServlet{
		int counter=0;
		static Hashtable h=new Hashtable();
		public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
			try{
				counter++;
				response.setContentType("text/html");
				PrintWriter pw=response.getWriter();
				pw.println("En no:130050131060");
				pw.println("<h1>Counter:"+counter+"</h1>");
				h.put(this,this);
				pw.println("<h1>Current Instances:"+h.size()+"</h1>");
				
			}catch(IOException e){
				System.out.println(e.getMessage());
			
			}
		}
}
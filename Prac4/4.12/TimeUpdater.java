import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TimeUpdater extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
	response.setContentType("text/html");
PrintWriter pw = response.getWriter();
pw.println("En no:130050131060");

response.addHeader("Refresh", "1");
pw.println("<h1>"+new Date().toString()+"</h1>");
}
}
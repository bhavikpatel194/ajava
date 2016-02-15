import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class DiceRoll extends HttpServlet{
protected void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
out.println("En no:130050131060");
int dice;
Random r=new Random();
dice=r.nextInt(6)+1;
out.println("<h2>Dice roller</h2><br>");
out.println("<h3>Value of dice1 = " + dice+ "</h3>");
}
}
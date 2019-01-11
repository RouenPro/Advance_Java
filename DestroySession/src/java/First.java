import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("user");
        Cookie ck = new Cookie("user",name); //Import
        resp.addCookie(ck);
        
        PrintWriter pw = resp.getWriter();
        if(name.equalsIgnoreCase("rouen")){
            pw.println("You login successfully");
            ck.setMaxAge(0);
            pw.println("<a href='Logout'>Logout</a>");
            
            Cookie[] cookies = req.getCookies();
            for(int i = 0; i < cookies.length; i++) 
            {
             cookies[i].setMaxAge(0);
             resp.addCookie(cookies[0]);
            }
        }
        else{
            pw.println("You need to login with correct username");
            ck.setMaxAge(0); 
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {   
    }
}

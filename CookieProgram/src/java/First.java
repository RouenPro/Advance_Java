

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
        String user = req.getParameter("user");
        
        Cookie ck = new Cookie("user",user);
        resp.addCookie(ck);
        
        PrintWriter pw = resp.getWriter();
        pw.println("<a href='Second'>Second</a>");
        
        
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String user = req.getParameter("user");
        
        Cookie ck = new Cookie("user",user);
        resp.addCookie(ck);
        
        PrintWriter pw = resp.getWriter();
        pw.println("<a href='Second'>Second</a>");
        
    }
    

}

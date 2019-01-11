

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie [] ck = req.getCookies();
        PrintWriter pw = resp.getWriter();
        for(Cookie cook:ck){
            pw.println("Cookie name "+cook.getName()+" Cookie value "+cook.getValue());
        }
        
       
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie [] ck = req.getCookies();
        PrintWriter pw = resp.getWriter();
        for(Cookie cook:ck){
            pw.println("Cookie name "+cook.getName()+" Cookie value "+cook.getValue());
        }
        
        
    }
    

   
}

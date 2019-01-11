/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chamrouen
 */
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("user");
        PrintWriter pw = resp.getWriter();
        
        
        pw.println("<form action='SecondServlet' method='get'>"
                    + "<input type='hidden' name='user' value='"+name+"'>"
                    + "<input type='submit' value='Second'>"
                    + "</form>");
        ServletConfig con = getServletConfig();
        ServletContext ctx = getServletContext();
        String color = con.getInitParameter("color");
        String cls = ctx.getInitParameter("class");
        pw.println(color);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

}







import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chamrouen
 */
public class FirstServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse Response) throws ServletException, IOException{
        
        
        
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter pw=response.getWriter();
        response.setContentType("text/html");
        String name = request.getParameter("user");
        pw.println("<a href='SecondServlet?user="+name+"'>Next</a>");
        
        
        
       
   }
    
}


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet{

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        
//    }
    @Override
    protected void doPost(HttpServletRequest reqq, HttpServletResponse ress) throws ServletException, IOException{
        PrintWriter pw = ress.getWriter();
        pw.println("I'm from MainServlet I will choose you username correct or not");
        String UserName = reqq.getParameter("Var_Name");
        if(UserName.equalsIgnoreCase("rouen")){
            RequestDispatcher RD = reqq.getRequestDispatcher("/Fail");
            RD.forward(reqq, ress);
              
        }
        else{
            RequestDispatcher RD = reqq.getRequestDispatcher("/Success");
            RD.forward(reqq, ress);
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
}
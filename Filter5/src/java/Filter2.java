
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter2 implements Filter{

    @Override
    public void init(FilterConfig fc) throws ServletException {        
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain fc) throws IOException, ServletException {
        
        System.out.println("Inside Do filter2 method... ");
        String email = request.getParameter("email").trim();
        
        if(email==null||email.equals("")){
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
        else{
            fc.doFilter(request, response);
            
        }      
    }

    @Override
    public void destroy() {
        System.out.println("Destory happenning...");
        
    }
    
    
}






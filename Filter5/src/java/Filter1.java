
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter{

    @Override
    public void init(FilterConfig fc) throws ServletException {
        System.out.println("Filer 1 Instantiated...");
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain fc) throws IOException, ServletException {
        System.out.println("Inside Do filter1 method... ");
        String user = request.getParameter("user").trim();
        
        if(user.contains("[0-9]+")||user.equals("")||user.contains(".")){
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






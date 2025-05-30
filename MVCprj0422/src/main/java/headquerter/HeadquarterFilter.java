package headquerter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/h_main","/updateanswer","/reviewPrint","/answering","/reviewList","/h_stockmanage","/h_orderingInfo","/h_branchesInfo","/answer123"})
public class HeadquarterFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
		
		HttpSession session = req.getSession();
		
		if(session==null || session.getAttribute("headquerter") == null) {
			resp.sendRedirect(req.getContextPath() + "/login");
            return;
		}
		
		chain.doFilter(request, response);
	}

}

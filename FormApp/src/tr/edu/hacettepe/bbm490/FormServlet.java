package tr.edu.hacettepe.bbm490;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/formServlet")
public class FormServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Enumeration<String> parameterNames = req.getParameterNames();
		
		resp.getWriter().write("<html><body>");
		
		resp.getWriter().write("<table border=\"1\">");
		while (parameterNames.hasMoreElements()) {
			resp.getWriter().write("<tr>");
			
			resp.getWriter().write("<td>");
			String nextElement = parameterNames.nextElement();
			resp.getWriter().write(nextElement);
			resp.getWriter().write("</td>");
			String parameter = req.getParameter(nextElement);
			resp.getWriter().write("<td>");
			resp.getWriter().write(parameter);
			resp.getWriter().write("</td>");
			
			resp.getWriter().write("</tr>");
		}
		resp.getWriter().write("</table>");
		
		resp.getWriter().write("</body></html>");
	}
}

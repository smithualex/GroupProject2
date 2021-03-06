package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationRedirect
 */
@WebServlet("/RegistrationRedirect")
public class RegistrationRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationRedirect() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	HttpSession session = request.getSession();
    	session.setAttribute("errortext", "");
    	response.sendRedirect("Registration.jsp");
    }

}

package ServletClassess;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Module.HelperClass;

@WebServlet("/signUp")
public class SignUp extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String mob=req.getParameter("mob");
		String role=(("Admin").equalsIgnoreCase(req.getParameter("role")))?"1":"0";
		String mail=req.getParameter("email");
		String password=req.getParameter("pass");
		
		Boolean result = false;
		try {
			result = HelperClass.createUser(fname, lname, mob, role, mail, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		RequestDispatcher dispatcher=null;
		if(result) {
			dispatcher=req.getRequestDispatcher("Index.jsp");
			dispatcher.forward(req, resp);
		}
			
		else
		{
			out.print("Registration failed");
			dispatcher=req.getRequestDispatcher("Register.jsp");
			dispatcher.include(req, resp);

			
		}

	}

}

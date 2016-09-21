package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class Index extends HttpServlet {

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML5"
		+ "<html>"
		+ "<head><title>Welkom bij mijn webshop!</TITLE></HEAD>"
		+ "<body>"
		+ "Welkom bij mijn webshop. Bekijk hier de producten!"
		+ "<p>"
		+ "<!DOCTYPE HTML>"
		+ "<html>"
		+ "<head>"
		+ "<meta charset=UTF-8>"
		+ "<title>Index</title>"
		+ "</head>"
		+ "<body>"
		+ "<ul>"
		+ "<li><a href=Groentepakket.html>Groentepakket</a></li>"
		+ "<li><a href=Magnums.html>Magnums</a></li>"
		+ "<li><a href=Rollade.html>Rollade</a></li>"
		+ "<li><a href=Witlof.html>Witlof</a></li>"
		+ "</ul>"
		+ "</body>"
		+ "</html>"
		+ "</p"
		+ "</body>"
		+ "</html>");
		out.flush();
		out.close();
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletExercicio3
 */
public class ServletExercicio3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExercicio3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Double base = Double.parseDouble(request.getParameter("base"));
		Double altura  = Double.parseDouble(request.getParameter("altura"));
		
		Double area = (base + base)*altura/2;
		
		PrintWriter saida = response.getWriter();
		saida.println("<html lang=\"pt-br\">"
				+ "<meta charset=\"UTF-8\">"
				+ "<head><title>Área do Trapezio</title></head>"
				+ "<body><h1>A area do Trapezio é: " + area + 
				"</h1></body></html>");
		doGet(request, response);
	}

}

package br.com.unifip.prova2;

import br.com.unifip.prova2.Veiculo;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo
 */
@WebServlet("/addCarro")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	ArrayList<Veiculo> veiculo = new ArrayList<Veiculo>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String marca = request.getParameter("marca");
		Veiculo v1 = new Veiculo(id, nome, marca);
		if (id != null && nome != null && marca != null) {
			veiculo.add(v1);
		}
		System.out.println(veiculo.size());
		request.setAttribute("veiculo", veiculo);
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

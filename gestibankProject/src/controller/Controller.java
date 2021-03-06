package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utilisateur.Administrateur;
import utilisateur.Client;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static final String UTILISATEUR_SESSION = "sessionUtilisateur";;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		execute(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		execute(request, response);
	}

	private void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext ctx = this.getServletContext();
		RequestDispatcher rd = null;
		String page = request.getParameter("page");

		if (page == null){
			page = "rien";
		}
		switch(page){
		case "connexion":
			rd = ctx.getRequestDispatcher("/connexion.jsp");
			rd.forward(request, response);
			break;
			
		case "formulaire":
			rd = ctx.getRequestDispatcher("/formulaire.jsp");
			rd.forward(request, response);
			break;		
		case "compte":
			HttpSession session = request.getSession(false);
			request.setAttribute("client",((Client)session.getAttribute(UTILISATEUR_SESSION)));
			rd = ctx.getRequestDispatcher("/compte.jsp");
			rd.forward(request, response);
			break;	
			
		case "formulaireok":
			rd = ctx.getRequestDispatcher("/CtlFormulaire");
			rd.include(request, response);
			
			rd = ctx.getRequestDispatcher("/accueilClient.jsp");
			rd.forward(request, response);
			break;		
			
		default :
			rd = ctx.getRequestDispatcher("/accueil.jsp");
			rd.forward(request, response);
			break;
		}	
		
	}
	

}

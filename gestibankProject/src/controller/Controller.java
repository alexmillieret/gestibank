package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utilisateur.Administrateur;
import utilisateur.Client;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		Client client1 = new Client();
		client1.setNomUtilisateur("client");
		client1.setPassword("toto");
		Administrateur admin = new Administrateur();
		admin.setNomUtilisateur("admin");
		admin.setPassword("admin");
		System.out.println("Client : nom utilisateur : " + client1.getNomUtilisateur() + " password : " + client1.getPassword());
		System.out.println("Administrateur : nom utilisateur : " + admin.getNomUtilisateur() + " password : " + admin.getPassword());

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

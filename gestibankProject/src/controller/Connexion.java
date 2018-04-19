package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import forms.ConnexionForm;
import utilisateur.Client;
/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String REQUESTCLIENT         = "client";
    public static final String FORM_CONNEXION         = "form";
    public static final String UTILISATEUR_SESSION = "sessionUtilisateur";
    public static final String VUE              = "/espaceclient.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		        /* Affichage de la page de connexion */
		        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
		    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        /* Préparation de l'objet formulaire */
        ConnexionForm form = new ConnexionForm();

        /* Traitement de la requête et récupération du bean en résultant */
        Client client = form.connecterClient( request );

        /* Récupération de la session depuis la requête */
        HttpSession session = request.getSession();

        /**
         * Si aucune erreur de validation n'a eu lieu, alors ajout du bean
         * Client à la session, sinon suppression du bean de la session.
         */
        if ( form.getErreurs().isEmpty() ) {
            session.setAttribute( UTILISATEUR_SESSION, client );
        } else {
            session.setAttribute( UTILISATEUR_SESSION, null );
        }

        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( FORM_CONNEXION, form );
        request.setAttribute( REQUESTCLIENT, client );
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
	}


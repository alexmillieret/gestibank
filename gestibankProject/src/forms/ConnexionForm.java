package forms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import compte.Compte;
import utilisateur.Client;
public class ConnexionForm {
	private static final String CHAMP_NOM = "login";
	private static final String CHAMP_PASS = "password";

	private String resultat;
	private Map<String, String> erreurs = new HashMap<String, String>();

	public String getResultat() {
		return resultat;
	}

	public Map<String, String> getErreurs() {
		return erreurs;
	}

	public Client connecterClient(HttpServletRequest request) {
		/* Récupération des champs du formulaire */
		String login = getValeurChamp(request, CHAMP_NOM);
		String password = getValeurChamp(request, CHAMP_PASS);

		Client client = new Client();
		/* Validation du champ nom */
		try {
			validationNom(login);
		} catch (Exception e) {
			setErreur(CHAMP_NOM, e.getMessage());
		}
		client.setNomUtilisateur(login);

		/* Validation du champ mot de passe. */
		try {
			validationMotDePasse(password);
		} catch (Exception e) {
			setErreur(CHAMP_PASS, e.getMessage());
		}
		client.setPassword(password);
		Compte compte=new Compte();
		compte.setNumeroCompte("1234");
		compte.setSolde(1000);
		Compte compte2=new Compte();
		compte2.setNumeroCompte("6985");
		compte2.setSolde(500);
		ArrayList<Compte> comptes=new ArrayList<Compte>();
		comptes.add(compte);
		comptes.add(compte2);
		client.setComptes(comptes);
				/* Initialisation du résultat global de la validation. */
		if (erreurs.isEmpty()) {
			resultat = "Succès de la connexion.";
		} else {
			resultat = "Échec de la connexion.";
		}

		return client;

	}

	/**
	 * Valide le mot de passe saisi.
	 */
	private void validationMotDePasse(String password) throws Exception {
		if (password != null) {
			if (password.length() < 3) {
				throw new Exception("Le mot de passe doit contenir au moins 3 caractères.");
			}
		} else {
			throw new Exception("Merci de saisir votre mot de passe.");
		}
	}

	private void validationNom(String nom) throws Exception {
		if (nom != null && nom.length() < 3) {
			throw new Exception("Le nom d'utilisateur doit contenir au moins 3 caractères.");
		}
	}

	/*
	 * Ajoute un message correspondant au champ spécifié à la map des erreurs.
	 */
	private void setErreur(String champ, String message) {
		erreurs.put(champ, message);
	}

	/*
	 * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
	 * sinon.
	 */
	private static String getValeurChamp(HttpServletRequest request, String nomChamp) {
		String valeur = request.getParameter(nomChamp);
		if (valeur == null || valeur.trim().length() == 0) {
			return null;
		} else {
			return valeur;
		}
	}
}

package beans;

import java.util.ArrayList;
import java.util.Date;

public class Conseiller extends Utilisateur {
private ArrayList<Client> listeClient;
private Date dateDebutContrat;
private Administrateur admin;

public Conseiller() {
	super();
};

	public Conseiller(String nomUtilisateur, String password, String nom, String prenom, String mail, Adresse adresse,
			String telephone, int nbEnfts) {
		super(nomUtilisateur, password, nom, prenom, mail, adresse, telephone, nbEnfts);
		this.listeClient=new ArrayList<Client>();
		this.dateDebutContrat=new Date();
		this.admin=new Administrateur();
		// TODO Auto-generated constructor stub
	}

}

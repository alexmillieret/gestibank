package beans;

import java.util.ArrayList;

public class Administrateur extends Utilisateur {
private ArrayList<Conseiller> listeConseiller;

	
	public Administrateur(String nomUtilisateur, String password, String nom, String prenom, String mail,
			Adresse adresse, String telephone, int nbEnfts) {
		super(nomUtilisateur, password, nom, prenom, mail, adresse, telephone, nbEnfts);
		this.listeConseiller=new ArrayList<Conseiller>();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Conseiller> getListeConseiller() {
		return listeConseiller;
	}
	public void setListeConseiller(ArrayList<Conseiller> listeConseiller) {
		this.listeConseiller = listeConseiller;
	}


}

package compte;

import java.util.ArrayList;
import java.util.Date;

import mouvement.Mouvement;

public  class Compte {
private String numeroCompte;
private String rib;
private double solde;
private Date dateCreation;
private ArrayList<Mouvement> listeMouvements;



public Compte() {
	// TODO Auto-generated constructor stub
}


public String getNumeroCompte() {
	return numeroCompte;
}


public void setNumeroCompte(String numeroCompte) {
	this.numeroCompte = numeroCompte;
}


@Override
public String toString() {
	return "Numéro de compte : " + numeroCompte + " RIB : " + rib + " Solde : " + solde + " Date de création : "
			+ dateCreation;
}


public String getRib() {
	return rib;
}


public void setRib(String rib) {
	this.rib = rib;
}


public double getSolde() {
	return solde;
}


public void setSolde(double solde) {
	this.solde = solde;
}


public Date getDateCreation() {
	return dateCreation;
}


public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}


public ArrayList<Mouvement> getListeMouvements() {
	return listeMouvements;
}


public void setListeMouvements(ArrayList<Mouvement> listeMouvements) {
	this.listeMouvements = listeMouvements;
}


	
}

package compte;

import java.util.ArrayList;
import java.util.Date;

import mouvement.Mouvement;

public abstract class Compte {
private String numeroCompte;
private String rib;
private double solde;
private Date dateCreation;
private ArrayList<Mouvement> listeMouvements;


public Compte(String numeroCompte, String rib, double solde, Date dateCreation, ArrayList<Mouvement> listeMouvements) {
	super();
	this.numeroCompte = numeroCompte;
	this.rib = rib;
	this.solde = solde;
	this.dateCreation = dateCreation;
	this.listeMouvements = listeMouvements;
}


public String getNumeroCompte() {
	return numeroCompte;
}


public void setNumeroCompte(String numeroCompte) {
	this.numeroCompte = numeroCompte;
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

package utilisateur;

import java.util.ArrayList;
import compte.Compte;
import demande.Demandes;

public class Client extends Utilisateur {
private ArrayList<Compte> comptes;
private Conseiller conseiller;
private ArrayList<Demandes> listeDemande;

public Client(){}

public Client(ArrayList<Compte> comptes, Conseiller conseiller) {
	super();
	this.comptes = comptes;
	this.conseiller = conseiller;
}


@Override
public String getNomUtilisateur() {
	// TODO Auto-generated method stub
	return super.getNomUtilisateur();
}


@Override
public void setNomUtilisateur(String nomUtilisateur) {
	// TODO Auto-generated method stub
	super.setNomUtilisateur(nomUtilisateur);
}


@Override
public String getPassword() {
	// TODO Auto-generated method stub
	return super.getPassword();
}


@Override
public void setPassword(String password) {
	// TODO Auto-generated method stub
	super.setPassword(password);
}


@Override
public String getNom() {
	// TODO Auto-generated method stub
	return super.getNom();
}


@Override
public void setNom(String nom) {
	// TODO Auto-generated method stub
	super.setNom(nom);
}


@Override
public String getPrenom() {
	// TODO Auto-generated method stub
	return super.getPrenom();
}


@Override
public void setPrenom(String prenom) {
	// TODO Auto-generated method stub
	super.setPrenom(prenom);
}


@Override
public String getMail() {
	// TODO Auto-generated method stub
	return super.getMail();
}


@Override
public void setMail(String mail) {
	// TODO Auto-generated method stub
	super.setMail(mail);
}



@Override
public String getTelephone() {
	// TODO Auto-generated method stub
	return super.getTelephone();
}


@Override
public void setTelephone(String telephone) {
	// TODO Auto-generated method stub
	super.setTelephone(telephone);
}


@Override
public String getNbEnfts() {
	// TODO Auto-generated method stub
	return super.getNbEnfts();
}


@Override
public void setNbEnfts(String nbEnfts) {
	// TODO Auto-generated method stub
	super.setNbEnfts(nbEnfts);
}


@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


@Override
public boolean equals(Object arg0) {
	// TODO Auto-generated method stub
	return super.equals(arg0);
}


@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}


@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}




}

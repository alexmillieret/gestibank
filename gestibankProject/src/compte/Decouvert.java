package compte;

import java.util.ArrayList;
import java.util.Date;

import mouvement.Mouvement;

public class Decouvert extends Compte {
private double decouvert;

public Decouvert() {
}

public double getDecouvert() {
	return decouvert;
}

public void setDecouvert(double decouvert) {
	this.decouvert = decouvert;
}

@Override
public String getNumeroCompte() {
	// TODO Auto-generated method stub
	return super.getNumeroCompte();
}

@Override
public void setNumeroCompte(String numeroCompte) {
	// TODO Auto-generated method stub
	super.setNumeroCompte(numeroCompte);
}

@Override
public String getRib() {
	// TODO Auto-generated method stub
	return super.getRib();
}

@Override
public void setRib(String rib) {
	// TODO Auto-generated method stub
	super.setRib(rib);
}

@Override
public double getSolde() {
	// TODO Auto-generated method stub
	return super.getSolde();
}

@Override
public void setSolde(double solde) {
	// TODO Auto-generated method stub
	super.setSolde(solde);
}

@Override
public Date getDateCreation() {
	// TODO Auto-generated method stub
	return super.getDateCreation();
}

@Override
public void setDateCreation(Date dateCreation) {
	// TODO Auto-generated method stub
	super.setDateCreation(dateCreation);
}

@Override
public ArrayList<Mouvement> getListeMouvements() {
	// TODO Auto-generated method stub
	return super.getListeMouvements();
}

@Override
public void setListeMouvements(ArrayList<Mouvement> listeMouvements) {
	// TODO Auto-generated method stub
	super.setListeMouvements(listeMouvements);
}

}

package demande;

import java.util.Date;

public abstract class Demandes {
private int numeroDemande;
private Date dateCreation;
private Date dateReponse;
public Demandes(int numeroDemande, Date dateCreation) {
	super();
	this.numeroDemande = numeroDemande;
	this.dateCreation = dateCreation;
}
public int getNumeroDemande() {
	return numeroDemande;
}
public void setNumeroDemande(int numeroDemande) {
	this.numeroDemande = numeroDemande;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public Date getDateReponse() {
	return dateReponse;
}
public void setDateReponse(Date dateReponse) {
	this.dateReponse = dateReponse;
}


}

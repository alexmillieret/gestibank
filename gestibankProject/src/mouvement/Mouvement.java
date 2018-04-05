package mouvement;

import java.util.Date;

public abstract class Mouvement {
private double montant;
private Date dateMouvement;
public Mouvement(double montant, Date dateMouvement) {
	super();
	this.montant = montant;
	this.dateMouvement = dateMouvement;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
public Date getDateMouvement() {
	return dateMouvement;
}
public void setDateMouvement(Date dateMouvement) {
	this.dateMouvement = dateMouvement;
}

	

}

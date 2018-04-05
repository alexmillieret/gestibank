package mouvement;

import java.util.Date;

public class Depot extends Mouvement {

	public Depot(double montant, Date dateMouvement) {
		super(montant, dateMouvement);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMontant() {
		// TODO Auto-generated method stub
		return super.getMontant();
	}

	@Override
	public void setMontant(double montant) {
		// TODO Auto-generated method stub
		super.setMontant(montant);
	}

	@Override
	public Date getDateMouvement() {
		// TODO Auto-generated method stub
		return super.getDateMouvement();
	}

	@Override
	public void setDateMouvement(Date dateMouvement) {
		// TODO Auto-generated method stub
		super.setDateMouvement(dateMouvement);
	}

}

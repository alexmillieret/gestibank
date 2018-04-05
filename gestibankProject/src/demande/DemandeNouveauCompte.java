package demande;

import java.util.Date;

public class DemandeNouveauCompte extends Demandes {

	public DemandeNouveauCompte(int numeroDemande, Date dateCreation) {
		super(numeroDemande, dateCreation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getNumeroDemande() {
		// TODO Auto-generated method stub
		return super.getNumeroDemande();
	}

	@Override
	public void setNumeroDemande(int numeroDemande) {
		// TODO Auto-generated method stub
		super.setNumeroDemande(numeroDemande);
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
	public Date getDateReponse() {
		// TODO Auto-generated method stub
		return super.getDateReponse();
	}

	@Override
	public void setDateReponse(Date dateReponse) {
		// TODO Auto-generated method stub
		super.setDateReponse(dateReponse);
	}

}

package utilisateur;

import java.util.ArrayList;
import java.util.Date;

public class Conseiller extends Utilisateur {
private ArrayList<Client> listeClient;
private Date dateDebutContrat;


	public Conseiller(ArrayList<Client> listeClient, Date dateDebutContrat) {
		super();
		this.listeClient = listeClient;
		this.dateDebutContrat = dateDebutContrat;
		this.setRole("Manager");
		
	}


	public ArrayList<Client> getListeClient() {
		return listeClient;
	}


	public void setListeClient(ArrayList<Client> listeClient) {
		this.listeClient = listeClient;
	}


	public Date getDateDebutContrat() {
		return dateDebutContrat;
	}


	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
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
	public Adresse getAdresse() {
		// TODO Auto-generated method stub
		return super.getAdresse();
	}


	@Override
	public void setAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		super.setAdresse(adresse);
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
	public int getNbEnfts() {
		// TODO Auto-generated method stub
		return super.getNbEnfts();
	}


	@Override
	public void setNbEnfts(int nbEnfts) {
		// TODO Auto-generated method stub
		super.setNbEnfts(nbEnfts);
	}


	

}

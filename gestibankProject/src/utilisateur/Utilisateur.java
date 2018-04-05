package utilisateur;

import java.io.Serializable;

public abstract class Utilisateur implements Serializable{

	private String nomUtilisateur;
	private String password;
	private String nom;
	private String prenom;
	private String mail;
	private Adresse adresse;
	private String telephone;
	private int nbEnfts;
	
	public Utilisateur(){}

	public Utilisateur(String nomUtilisateur, String password, String nom, String prenom, String mail, Adresse adresse,
			String telephone, int nbEnfts) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.nbEnfts = nbEnfts;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getNbEnfts() {
		return nbEnfts;
	}

	public void setNbEnfts(int nbEnfts) {
		this.nbEnfts = nbEnfts;
	}
	
	
}

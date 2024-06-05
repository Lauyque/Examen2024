package poo;

import java.util.Date;

public class Etudiant extends Individu{
	private Date dateInscription;
	private String niveauEtude;
	
	public Etudiant(String nom, String prenom, int identifiant, Date dateInscription, String niveauEtude){
		super(nom, prenom, identifiant);
		this.dateInscription = dateInscription;
		this.niveauEtude = niveauEtude;
	}
	
	// GETTERS
	public Date getDateInscription() {
		return dateInscription;
	}
	public String getNiveauEtude() {
		return niveauEtude;
	}
	
	// SETTERS
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}
}

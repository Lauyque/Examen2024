package poo;

public class Etudiant extends Individu{
	private String dateInscription;
	private String niveauEtude;
	
	public Etudiant(String nom, String prenom, int identifiant, String dateInscription, String niveauEtude){
		super(nom, prenom, identifiant);
		this.dateInscription = dateInscription;
		this.niveauEtude = niveauEtude;
	}
}

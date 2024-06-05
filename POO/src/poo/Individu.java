package poo;

public abstract class Individu {
	private String nom;
	private String prenom;
	private int identifiant;
	

	public Individu(String nom, String prenom,int identifiant ) {
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
	}
	
	
	// GETTERS
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	
	// SETTERS
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	
	public void montrerDetails() {
		System.out.println("Nom :" + this.nom);
		System.out.println("Prenom :" + this.prenom);
		System.out.println("Identifiant :" + this.identifiant);
	}
}

package poo;

public class Cours {
	protected String titre;
	protected String formateur;
	protected int duree;
	protected int placeRestantes;
	
	public Cours (String titre, String formateur, int duree, int placeRestantes) {
		this.titre = titre;
		this.formateur = formateur;
		this.duree = duree;
		this.placeRestantes = placeRestantes;
	}
	
	// GETTERS
	public String getTitre() {
		return this.titre;
	}
	public String getFormateur() {
		return this.formateur;
	}
	public int getDuree() {
		return this.duree;
	}
	public int getPlaceRestantes() {
		return this.placeRestantes;
	}
	
	// SETTERS
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public void setPlaceRestantes(int placeRestantes) {
		this.placeRestantes = placeRestantes;
	}
	
	public void montrerDetails() {
		System.out.println("Titre :" + this.titre);
		System.out.println("Formateur :" + this.formateur);
		System.out.println("Duree (en heure(s)) :" + this.duree);
		System.out.println("Place Restantes :" + this.placeRestantes);
	}
}

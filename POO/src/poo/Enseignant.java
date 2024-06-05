package poo;

public class Enseignant extends Individu{
	protected String specialisation;
	protected double salaireMensuel;
	
	public Enseignant(String nom, String prenom,int identifiant, String specialisation, double salaireMensuel) {
		super(nom, prenom, identifiant);
		this.specialisation = specialisation;
		this.salaireMensuel = salaireMensuel;
	}
	
	// GETTERS
	public String getSpecialisation() {
		return this.specialisation;
	}
	public double getSalaireMensuel() {
		return this.salaireMensuel;
	}
	
	//SETTER
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	
	public void montrerDetails() {
		System.out.println("Nom :" + this.nom);
		System.out.println("Prenom :" + this.prenom);
		System.out.println("Identifiant :" + this.identifiant);
		System.out.println("Spécialisation :" + this.specialisation);
		System.out.println("Salaire Mensuel :" + this.salaireMensuel);
	}
}

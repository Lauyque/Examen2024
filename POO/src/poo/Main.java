package poo;

public class Main {

	public static void main(String[] args) {
		Individu loic = new Etudiant("le doher", "loic",1, "05/06/2024", "bac+2");
		loic.montrerDetails();
		System.out.println(loic.getIdentifiant());
		loic.setIdentifiant(5);
		System.out.println(loic.getIdentifiant());

	}

}

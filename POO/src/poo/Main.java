package poo;

public class Main {

	public static void main(String[] args) {
		Individu loic = new Etudiant("LE DOHER", "loïc",1, "05/06/2024", "bac+2");
		
		loic.montrerDetails();
		// Test pour les getters et les setters
		//System.out.println(loic.getIdentifiant());
		//loic.setIdentifiant(5);
		//System.out.println(loic.getIdentifiant());

		System.out.println();
		Cours paradigme = new Cours("Paradigme de programmation", "FLEURY", 7,0);
		
		paradigme.montrerDetails();
		// Test pour les getters et les setters
		//System.out.println(paradigme.getPlaceRestantes());
		//paradigme.setPlaceRestantes(5);
		//System.out.println(paradigme.getPlaceRestantes());
		
	}

}

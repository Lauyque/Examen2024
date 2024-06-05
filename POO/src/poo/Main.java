package poo;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Date d = new Date("01/09/2023");
		Individu loic = new Etudiant("LE DOHER", "loïc",1, d, "bac+2");
		
		loic.montrerDetails();
		// Test pour les getters et les setters
		System.out.println(loic.getIdentifiant());
		loic.setIdentifiant(5);
		System.out.println(loic.getIdentifiant());

		System.out.println();
		Cours paradigme = new Cours("Paradigme de programmation", "FLEURY", 7,0);
		
		paradigme.montrerDetails();
		// Test pour les getters et les setters
		System.out.println(paradigme.getPlaceRestantes());
		paradigme.setPlaceRestantes(5);
		System.out.println(paradigme.getPlaceRestantes());
		
		Individu prof = new Enseignant("nom1", "prenom1", 2, "Programmation",2000);
		prof.montrerDetails();
		
	}

}

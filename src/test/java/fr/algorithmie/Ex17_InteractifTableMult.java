package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifTableMult")
public class Ex17_InteractifTableMult {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Veuillez saisir un nombre : ");
		// TODO Tant que le nombre saisi par l'utilisateur n'est pas compris
		// entre 1 et 10 l'application continue à demander un nombre à l'utilisateur.
		int nombre = scanner.nextInt();
		while((nombre < 1) || (nombre > 10)) {
	 
			System.out.println("Veuillez saisir un nombre entre 1 et 10 inclus : ");
			nombre = scanner.nextInt();
			
		}
		for (int i=1; i<=10; i++) {
		Resultat.log(nombre +"*"+ i + "=" + nombre * i );
		}
		// Si ce nombre est compris entre 1 et 10, l'application affiche la table de multiplication
		// de ce nombre sous la forme : 3*1=3, 3*2=6, etc... jusqu'à 3*2=10
		
		scanner.close();
	}

}

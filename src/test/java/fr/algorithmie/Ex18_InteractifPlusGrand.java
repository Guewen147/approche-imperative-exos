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
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		int[] plusGrand = new int[10];
		int maxVal = Integer.MIN_VALUE;
		
		
		Scanner scanner = new Scanner(System.in) ;
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		// TODO Affichez chaque nombre saisi avec Resultat.log
		// TODO Enfin affichez avec Resultat.log le max des 10 nombres
	
		for (int i=0; i<=9; i++) {
			System.out.println("Veuillez saisir un nombre : ");
			int nombre = scanner.nextInt();
			Resultat.log(nombre);
			plusGrand[i] = nombre ;
			}
		for(int i = 0; i < plusGrand.length; i++){
	         if(plusGrand[i] > maxVal)
	           maxVal = plusGrand[i];
		}
		System.out.println("Voici le nombre le plus grand saisie1: ");
		Resultat.log(maxVal);
		
		scanner.close();
	}

}

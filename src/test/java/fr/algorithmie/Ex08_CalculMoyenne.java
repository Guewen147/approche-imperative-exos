package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="CalculMoyenne")
public class Ex08_CalculMoyenne {
	
	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	int somme = 0;
	int positif= 0;
	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero=1)
	public void calculMoyenne() {
		
		//TODO Calculez et LOGUEZ la moyenne des valeurs du tableau (la moyenne doit être une valeur décimale).
	      for(int i = 0; i < array.length; i++){
	         somme += array[i];
	      }
	      double moyenne = (double) somme / array.length;
	 
	      System.out.print("Moyenne : ");
	      Resultat.log(moyenne);
	   

	}
	
	@Test
	@Question(numero=2)
	public void calculMoyenneValeursPositives() {
		for(int i = 0; i < array.length; i++){
			if ((array[i]) >= 0) {
			 positif++ ;
	         somme += array[i];
			}
	      }
	      double moyenne = (double) somme / positif;
	 
	      System.out.print("Moyenne : ");
	      Resultat.log(moyenne);
		//TODO Calculez et LOGUEZ la moyenne des valeurs POSITIVES du tableau
	}

}

/*
 * TP1 exo 4
 * Flavio De Gennaro 
*/
package tp1_statistiques_degennaro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author flavi
 */
public class TP1_Statistiques_DEGENNARO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] resultats = new int[6]; // Création tableau avec que des 0

 

        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de lancers de dé voulez-vous effectuer ?");

        int m = sc.nextInt();

 

        Random generateurAleat = new Random();

        for (int i = 0; i < m; i++) {

            int lance = generateurAleat.nextInt(6);

            resultats[lance]++; // On met le nombre aléatoire dans la case correspondante au lancer

        }

 

        System.out.println("Résultats des lancers :");

        for (int i = 0; i < resultats.length; i++) {

            System.out.println("Face " + (i + 1) + " : " + resultats[i] + " fois");

        }

 

       

        System.out.println("\nRésultats des lancers en pourcentages :");

        for (int i = 0; i < resultats.length; i++) {

            double pourcentage = (double) resultats[i] * 100 / m; // Calcul du pourcentage

            System.out.println("Face " + (i + 1) + " : " + pourcentage + " %");

        }

    }

   

}
        // TODO code application logic here
  

/*
 *TP0 Exercice 1
 *Flavio De Gennaro
 *23 septembre 2024
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author flavi
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Declaration des variables
 int nb; // nombre dentiers a additionner
 int result; // resultat
 int ind; //indice

 result=0;
 // Addition des nb premiers entiers
 ind=1;
 nb=10;
 while (ind <= nb) {
 result=result+ind;
 ind+=1;
 }
 // Affichage du resultat
 System.out.println();
 System.out.println("La somme des "+ nb + "entiers est: "+result);
 
 Scanner sc = new Scanner(System.in);
 System.out.println("\n Entrer le nombre :");
 nb=sc.nextInt();
        // TODO code application logic here
}
    
}

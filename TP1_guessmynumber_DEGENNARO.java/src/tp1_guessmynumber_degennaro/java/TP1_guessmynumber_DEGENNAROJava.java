/*
 * TP1 exo 3
 * Flavio De Gennaro 
 */
package tp1_guessmynumber_degennaro.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author flavi
 */
public class TP1_guessmynumber_DEGENNAROJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat= new Random();
        //for (int i=1; i<=5; i++){
            //int n = generateurAleat.nextInt(100);
            //System.out.println(n);
        int n = generateurAleat.nextInt(100);
        
        int valeur;
        int cpt;
        Scanner sc= new Scanner(System.in);
        valeur=sc.nextInt();
        cpt=1;
        
        if (n==valeur){
            System.out.println("Gagné !");
        }
        while (n!=valeur){
        
        
        if (n>valeur){
            System.out.println("Trop grand");
        }
        if (n<valeur){
            System.out.println("Trop petit");
        }
        System.out.println("Saisissez une valeure entre 0 et 100");  
        valeur=sc.nextInt();
        cpt+=1;
        
        }
        
        // TODO code application logic here
    }
     
    
}

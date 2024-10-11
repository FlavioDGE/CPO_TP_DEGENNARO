/*
 * Flavio De Gennaro
 * TP2 exo 1
 */
package tp2_degennaro;

/**
 *
 * @author flavi
 */
public class TP2_DeGennaro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "Cuvée des trolls"; 
        uneBiere.degreAlcool = (float) 7.0 ; 
        uneBiere.brasserie="Dubuisson";
        uneBiere.ouverte= false ;
        uneBiere.lireEtiquette();
        
        
        uneBiere.nom = "leffe"; 
        uneBiere.degreAlcool = (float) 6.6 ; 
        uneBiere.brasserie="Abbaye de leffe";
        uneBiere.ouverte= false ;
        uneBiere.lireEtiquette();
        
        
        
        // TODO code application logic here
    }
    
}

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
        BouteilleBiere uneBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ; 
        uneBiere.lireEtiquette();
        BouteilleBiere deuxBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        deuxBiere.lireEtiquette();
        BouteilleBiere troisBiere = new BouteilleBiere("Heineken", 5.0 ,"Abbaye de Heineken") ;
        troisBiere.lireEtiquette();
        BouteilleBiere quatreBiere = new BouteilleBiere("Chouffe", 5.5 ,"Abbaye de Chouffe") ;
        quatreBiere.lireEtiquette();
        
        
        uneBiere.Décapsuler();
        System.out.println(uneBiere);
        System.out.println(deuxBiere);
        System.out.println(troisBiere);
        System.out.println(quatreBiere);
        
        
        // TODO code application logic here
    }
    
}

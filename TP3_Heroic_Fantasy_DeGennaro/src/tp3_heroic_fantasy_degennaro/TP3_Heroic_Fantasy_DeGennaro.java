/*
 * TP2 
 * Flavio De Gennaro
 * 1.1
 */
package tp3_heroic_fantasy_degennaro;

import java.util.ArrayList;

/**
 *
 * @author flavi
 */
public class TP3_Heroic_Fantasy_DeGennaro {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        épée épée1= new épée("Excalibur", 7, 5);
        épée épée2= new épée("Durandal", 4, 7);
        baton baton1= new baton("Chêne", 4, 5);
        baton baton2= new baton("Charme", 5, 6);
        
        ArrayList<arme> armes= new ArrayList<arme>();
        armes.add(épée1);
        armes.add(épée2);
        armes.add(baton1);
        armes.add(baton2);
        int tailleDeArme= armes.size(); 
        for (int i=0; i<armes.size(); i++){
            
        }
        
        // TODO code application logic here
    }
    
}

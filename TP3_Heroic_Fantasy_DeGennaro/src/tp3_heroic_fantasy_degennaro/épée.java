/*
 * Flavio De Gennaro
 */
package tp3_heroic_fantasy_degennaro;

/**
 *
 * @author flavi
 */
public class épée extends arme {
    private int finesse;

    public épée(String nom, int finesse, int nivattaque) {
        super(nom, nivattaque);
        this.finesse = finesse;
        if (finesse>=100){
            finesse=100;
        }
        else if (finesse<0){
            finesse=0;
        }
    }
    
}

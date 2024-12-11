/*
 * Flavio De Gennaro
 */
package Armes;
import Armes.Arme;
/**
*
* @author flavi 
*/
public class Epee extends Arme {
    private int finesse;
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        this.finesse = Math.min(finesse, 100);
    }
    public int getFinesse() {
        return finesse;
    }
    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }
}   

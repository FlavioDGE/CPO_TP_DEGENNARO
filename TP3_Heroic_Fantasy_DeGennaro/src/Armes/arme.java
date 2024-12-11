package Armes;

/*
 * Flavio De Gennaro
 */

/**
 *
 * @author flavi
 */
package Armes;
/**
* @author flavi
*/
public abstract class Arme {
    private String nom;
    private int niveauAttaque;
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = Math.min(niveauAttaque, 100);
    }
    public String getNom() {
        return nom;
    }
    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    @Override
    public String toString() {
        return "Arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}
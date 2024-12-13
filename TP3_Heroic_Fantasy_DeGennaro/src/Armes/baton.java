/*
 * Flavio De Gennaro
 */
package Armes;
import Armes.arme;
/**
*
* @author flavi
*/
public class baton extends arme {
    private int age;
    public baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        this.age = Math.min(age, 100);
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return super.toString() + ", Âge: " + age;
    }
}
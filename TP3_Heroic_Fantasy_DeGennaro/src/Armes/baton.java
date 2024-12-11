/*
 * Flavio De Gennaro
 */
package Armes;
import Armes.Arme;
/**
*
* @author flavi
*/
public class Baton extends Arme {
    private int age;
    public Baton(String nom, int niveauAttaque, int age) {
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
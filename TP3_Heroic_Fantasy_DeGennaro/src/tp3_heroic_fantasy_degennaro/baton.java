/*
 * Flavio De Gennaro
 */
package tp3_heroic_fantasy_degennaro;

/**
 *
 * @author flavi
 */
public class baton extends arme{
    private int age;

    public baton(String nom, int age, int nivattaque) {
        super(nom, nivattaque);
        this.age = age;
        if (age>= 100){
            age=100;
            
        }
        else if (age<0){
            age=0;
        }
       
    }

    
    
}

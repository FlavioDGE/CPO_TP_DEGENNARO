package tp3_heroic_fantasy_degennaro;

/*
 * Flavio De Gennaro
 */

/**
 *
 * @author flavi
 */
public abstract class arme {
    String nom;
    int nivattaque;
    
    public arme(String nom, int nivattaque){
        this.nom=nom;
        this.nivattaque=nivattaque;
    }
    @Override

    public String toString () {
        return "Nom : "+ nom+"\n" + "Niveau d'attaque : "+nivattaque+"\n"; 

    }
    
}

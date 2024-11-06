/*
 *  TP2 
 * Flavio De Gennaro 
 */
package tp2_relation_1_degennaro;

/**
 *
 * @author flavi
 */
public class Voiture {
    String Modele;

    String Marque;

    int PuissanceCV;

    Personne Proprietaire;

   

    public Voiture(String modele, String marque, int puissanceCV){

        Modele=modele;

        Marque=marque;

        PuissanceCV=puissanceCV;

        Proprietaire=null;

       

    }

   

    @Override

    public String toString () {

        return "Modele : "+ Modele+"\n" + "Marque : "+Marque+"\n" +"Puissance : "+ PuissanceCV;

    }
}

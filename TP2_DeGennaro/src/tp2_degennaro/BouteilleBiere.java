package tp2_degennaro;

/*
 * TP2 exo 1
 * Flavio De Gennaro
/*

/**
 *
 * @author flavi
 */
public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie){
        nom = unNom; 
        degreAlcool = unDegre; 
        brasserie = uneBrasserie; 
        ouverte = false; 
    }
    
    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; 
} 
    
    
}

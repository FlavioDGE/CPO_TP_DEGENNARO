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
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    @Override 
    public String toString(){ 
    String chaine_a_retourner; 
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";   
    if (ouverte == true )chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ; 
    return chaine_a_retourner ;  
}
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){
        nom = unNom; 
        degreAlcool = unDegre; 
        brasserie = uneBrasserie; 
        ouverte = false; 
    }
    
    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; 
} 
    public boolean Décapsuler(){
        if (ouverte==false){
            ouverte=true;
        }else{
            System.out.println(" erreur : biere déjà ouverte");
        }
        return false;
    }
    
    
}

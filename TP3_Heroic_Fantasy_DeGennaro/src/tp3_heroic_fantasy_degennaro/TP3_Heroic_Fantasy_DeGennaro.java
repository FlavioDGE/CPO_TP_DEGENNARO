/*
 * TP2 
 * Flavio De Gennaro
 * 1.1
 */
package tp3_heroic_fantasy_degennaro;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;
import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
/**
 *
 * @author flavi
 */
public class TP3_Heroic_Fantasy_DeGennaro {

    /**
     * @param args the command line arguments
     */
public class Main {
    public static void main(String[] args){
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Guerrier conan = new Guerrier("Conan", 78, false);
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(charme);
        gandalf.ajouterArme(excalibur);
        conan.ajouterArme(excalibur);
        conan.ajouterArme(durandal);
        gandalf.equiperArme("Chêne");
        conan.equiperArme("Excalibur");
        gandalf.attaquer(conan);
        conan.attaquer(gandalf);
        System.out.println(gandalf);
        System.out.println(conan);
        System.out.println("Nombre de personnages créés: " + Personnage.getNbPersonnages());
    }
}
}
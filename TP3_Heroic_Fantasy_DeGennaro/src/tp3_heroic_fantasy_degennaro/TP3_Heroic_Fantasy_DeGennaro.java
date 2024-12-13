/*
 * TP2 
 * Flavio De Gennaro
 * 1.1
 */
package tp3_heroic_fantasy_degennaro;
import Armes.Epee;
import Armes.baton;
import Armes.arme;
import java.util.ArrayList;
import Personnages.magicien;
import Personnages.guerrier;
import Personnages.Personnage;
import Personnages.guerrier;
import Personnages.magicien;
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
        baton chene = new baton("Chêne", 4, 5);
        baton charme = new baton("Charme", 5, 6);
        magicien gandalf = new magicien("Gandalf", 65, true);
        guerrier conan = new guerrier("Conan", 78, false);
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
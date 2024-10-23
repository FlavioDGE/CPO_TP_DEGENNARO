/*
 * TP2 exo 2
 * Flavio De Gennaro
 */
package tp2_convertisseurobjet_degannro;

/**
 *
 * @author flavi
 */
public class TP2_convertisseurObjet_DeGannro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Convertisseur convertisseur = new Convertisseur();

        convertisseur.CelciusVersKelvin(25);

        convertisseur.KelvinVersCelcius(30);


        Convertisseur convertisseur2 = new Convertisseur();
        convertisseur.FarenheitVersCelcius(25);
        convertisseur.CelciusVersFarenheit(25);
        System.out.println(convertisseur);
        System.out.println(convertisseur2);

    }

   

}
    
}

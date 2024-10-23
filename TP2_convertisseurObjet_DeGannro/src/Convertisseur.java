/*
 * TP2 exo 2
 * Flavio De Gennaro
 */

/**
 *
 * @author flavi
 */
public class Convertisseur {

    int nbConversions;

   

    public Convertisseur () {

        nbConversions = 0 ;

    }

    public double CelciusVersKelvin (double tCelcius) {

        nbConversions +=1 ;

        return tCelcius+273;

    }

    public double KelvinVersCelcius (double tKelvin) {

        nbConversions +=1 ;

        return tKelvin-273;

    }

    public double FarenheitVersCelcius (double tFarenheit) {

        nbConversions +=1 ;

        return tFarenheit-32;

    }

    public double CelciusVersFarenheit (double tCelcius) {

        nbConversions +=1 ;

        return tCelcius+32;

    }

    public double KelvinVersFarenheit (double tKelvin) {

        nbConversions +=1 ;

        return tKelvin-459.67;

    }

    public double FarenheitVersKelvin (double tFarenheit) {

        nbConversions +=1 ;

        return tFarenheit+459.67;

    }

    @Override

    public String toString () {

        return "nb de conversions"+ nbConversions;

    }

}

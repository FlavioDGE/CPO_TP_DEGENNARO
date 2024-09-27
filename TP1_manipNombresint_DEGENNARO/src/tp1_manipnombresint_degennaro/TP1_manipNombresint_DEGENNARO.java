/*
 * TP1 exo1
 * Flavio De Gennaro
 */
package tp1_manipnombresint_degennaro;

import java.util.Scanner;

/**
 *
 * @author flavio
 */
public class TP1_manipNombresint_DEGENNARO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1;
        int var2;
        System.out.println("Saisissez deux valeurs entières");
        Scanner sc = new Scanner(System.in);
        var1=sc.nextInt();
        var2=sc.nextInt();
        System.out.println("Le résultat de la somme de vos deux nombres est :" +(var1+var2));
        int prod;
        prod=var1*var2;
        System.out.println("Le résultat du produit de vos deux nombres est :" +prod);
        int dif;
        dif=var1-var2;
        System.out.println("Le résultat de la division de vos deux nombres est :" +dif);
        int div;
        div=var1/var2;
        System.out.println("Le résultat de la division de vos de nombres est :" +div);
        double quot;
        quot=var1%var2;
        System.out.println("Le résultat de la division entière de vos nombres est :" +quot);
    
    }
}     
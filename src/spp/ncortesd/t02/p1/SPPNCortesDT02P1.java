//Nohely Monserrat Cortés del Ángel
//A01410768
//IMT
package spp.ncortesd.t02.p1;
import java.util.Scanner;
/**
 *
 * @author Nohely
 */
public class SPPNCortesDT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double sue, pago;
        int cate, he;
        
        System.out.println("Bienvenido al cálculo de sueldos");
        System.out.println("Introduce tu salario");
        sue = kb.nextDouble();
        System.out.println("Introduce las horas extras");
        he = kb.nextInt();
        System.out.println("Introduce la categoría (1-8)");
        cate = kb.nextInt();
        
        if (cate <= 8 || cate > 0); {
            switch (cate) {
            case 1: 
                pago = (30 * he) + sue;
                System.out.println("Su sueldo total es de: " + pago);
                break;
            case 2:
                pago = (38 * he) + sue;
                System.out.println("Su sueldo total es de: " + pago);
                break;
            case 3:
                pago = (50 * he) + sue;
                System.out.println("Su sueldo total es de: " + pago);
                break;
            case 4:
                pago = (70 * he) + sue;
                System.out.println("Su sueldo total es de: " + pago);
                break;
            case 5:
                pago = (100 * he) + sue;
                System.out.println("Su sueldo total es de: " + pago);
                break;
            }
    }
    }
}

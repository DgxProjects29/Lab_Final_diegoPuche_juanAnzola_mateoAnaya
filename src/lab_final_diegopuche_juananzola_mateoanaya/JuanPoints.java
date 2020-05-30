
package lab_final_diegopuche_juananzola_mateoanaya;
import java.util.Scanner; 

public class JuanPoints {
    
    public static void point4(){
    
      Scanner l = new Scanner(System.in);
        int num, cont, d, sum = 0, result;

        System.out.println("\n----------------------------");
        System.out.println("    Clave de un número     ");
        System.out.println("-----------------------------");

        System.out.println("Digite el número a hallar la clave");
        num = l.nextInt();

        if (num < 0) {
            System.out.println("La clave del numero es: -1 ");
        }
        if (num == 0) {
            System.out.println("La clave del numero es: 0 ");
        }
        cont = 2;
        while (num > 0) {

            d = num % 10;
            sum = sum + d * cont;
            cont++;
            num /= 10;

        }
        result = sum % 10;
        System.out.println("El resultado es: " + result);
    }
    
    public static void dudas(){
    
        //Escribe aqui tu codigo de pruebas
    }
    
}


package lab_final_diegopuche_juananzola_mateoanaya;

import java.util.Scanner;


public class MateoPoints {
    
    public static void point3(){
    
        double x, n, p11 = -1, p12 = 1, i, x2, i2, p21, p22 = 1, i3, f = 1, op = 0, sum = 0, x3, p31, i4, f2 = 1, p32 = 1, op2 = 0, sum2 = 0, i5, i6, tan, csc, sec, cot;
        Scanner entrada = new Scanner(System.in);
        System.out.println("_________________________________");
        System.out.println("        Series de taylor         ");
        System.out.println("_________________________________");
        System.out.print("Escriba el valor de x:");
        x = entrada.nextInt();
        x3 = x * (2 * Math.PI / 360);
        x2 = x3;

        for (n = 0; n <= x3; n++) {
            //esto es el exponenete de x para seno
            p21 = (2 * n) + 1;
            //esto es el exponenete de x para coseno
            p31 = 2 * n;
            
            //Calculo del numerador -1 ala n
            for (i = 1; i <= n; i++) {
                p12 = p12 * p11;
            }
            
            //Calculo potencia seno
            for (i2 = 1; i2 <= p21; i2++) {
                p22 = p22 * x2;

            }
            
            //Calculo Factorial seno
            for (i3 = 1; i3 <= p21; i3++) {

                f = f * i3;
            }
            
            //Calculo potencia coseno
            for (i5 = 1; i5 <= p31; i5++) {
                p32 = p32 * x2;

            }
            
            //Calculo factorial coseno
            for (i6 = 1; i6 <= p31; i6++) {

                f2 = f2 * i6;
            }

            op = (p12 / f) * p22;
            op2 = (p12 / f2) * p32;
            sum = sum + op;
            sum2 = sum2 + op2;
            p21 = 1;
            p12 = 1;
            p22 = 1;
            f = 1;
            p31 = 1;
            f2 = 1;

        }
        tan = op / op2;
        csc = 1 / op;
        sec = 1 / op2;
        cot = op2 / op;
        System.out.println("El seno  de x usando la serie de taylor es: " + sum);
        System.out.println("El coseno  dex usando la serie de taylor es: " + sum2);
        System.out.println("La tangente de x usando la serie de taylor es: " + tan);
        System.out.println("La cosecante de x usando la serie de taylor es: " + csc);
        System.out.println("La secante de x usando la serie de taylor es: " + sec);
        System.out.println("La cotangente de x usando la serie de taylor es: " + cot);
    }
    
    public static void dudas(){
    
        //Escribe aqui tu codigo de pruebas
    }
}

package lab_final_diegopuche_juananzola_mateoanaya;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MateoPoints {

    public static void point3() {
        
        String inputValue;

        double x, xDegrees;

        //Variables de operaciones
        double sign = -1;
        double numSine = 1, numCosine = 1;
        double demSine = 1, demCosine = 1;

        //Variables de resultados
        double sine = 0, cosine = 0, tangent, cosecant,
                secant, cotangent;
        String messageToDisplay;

        System.out.println("\n----------------------------");
        System.out.println("       Series de Taylor     ");
        System.out.println("-----------------------------");

        //Preguntar por el angulo
        do {

            inputValue = JOptionPane.showInputDialog("Por favor,"
                    + " ingrese el angulo en grados");

            if (inputValue != null) {

                if (!inputValue.equals("")) {

                    x = Double.parseDouble(inputValue);
                    if (x < 0 || x > 359) {
                        inputValue = "AngleError";
                        JOptionPane.showMessageDialog(null,
                                "Angulos validos se encuentran en este "
                                + "intervalo [0,360)", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Debes ingresar algun valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    //System.out.println("[Error] Debes ingresar algun valor");
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Debes ingresar algun valor", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (inputValue == null || inputValue.equals("") || inputValue.equals("AngleError"));

        x = Double.parseDouble(inputValue);
        xDegrees = x;
        x = x * (2 * Math.PI / 360);
        System.out.println("[Debug]  " + x);

        //Una aproximacion hasta 10
        for (int n = 0; n <= 10; n++) {

            //Calculo del signo para el termino atual
            sign = sign * -1;

            //Calculo potencia del seno x^(2n + 1)
            for (int i2 = 1; i2 <= 2 * n + 1; i2++) {
                numSine = numSine * x;
            }

            //Calculo Factorial del seno (2n + 1)!
            for (int i3 = 1; i3 <= 2 * n + 1; i3++) {
                demSine = demSine * i3;
            }

            //Calculo potencia coseno x^(2n)
            for (int i4 = 1; i4 <= 2 * n; i4++) {
                numCosine = numCosine * x;
            }

            //Calculo factorial coseno (2n)!
            for (int i5 = 1; i5 <= 2 * n; i5++) {
                demCosine = demCosine * i5;
            }

            sine += sign * numSine / demSine;
            cosine += sign * numCosine / demCosine;

            //Reseto de variables
            numSine = 1;
            demSine = 1;
            numCosine = 1;
            demCosine = 1;

        }

        if (xDegrees == 0 || xDegrees == 180) {
            tangent = sine / cosine;
            secant = 1 / cosine;
            messageToDisplay = "Identidades trigonometricas para el angulo " + xDegrees + "\n"
                    + "El seno es: " + sine + "\n"
                    + "El coseno es: " + cosine + "\n"
                    + "La tangente es: " + tangent + "\n"
                    + "La secante es: " + secant + "\n"
                    + "La cosecante no esta definida" + "\n"
                    + "La cotagente no esta definida";
        } else if (xDegrees == 90 || xDegrees == 270) {
            cosecant = 1 / sine;
            cotangent = cosine / sine;
            messageToDisplay = "Identidades trigonometricas para el angulo " + xDegrees + "\n"
                    + "El seno es: " + sine + "\n"
                    + "El coseno es: " + cosine + "\n"
                    + "La tangente no esta definida" + "\n"
                    + "La secante no esta definida" + "\n"
                    + "La cosecante es: " + cosecant + "\n"
                    + "La cotangente es: " + cotangent;
        } else {
            tangent = sine / cosine;
            cosecant = 1 / sine;
            secant = 1 / cosine;
            cotangent = cosine / sine;
            messageToDisplay = "Identidades trigonometricas para el angulo " + xDegrees + "\n"
                    + "El seno es: " + sine + "\n"
                    + "El coseno es: " + cosine + "\n"
                    + "La tangente es: " + tangent + "\n"
                    + "La secante es: " + secant + "\n"
                    + "La cosecante es: " + cosecant + "\n"
                    + "La cotangente es: " + cotangent;
        }

        JOptionPane.showMessageDialog(null, messageToDisplay,
                "Resultados", JOptionPane.INFORMATION_MESSAGE);

    }
    
    

    public static void dudas() {

        //Escribe aqui tu codigo de pruebas
    }
}

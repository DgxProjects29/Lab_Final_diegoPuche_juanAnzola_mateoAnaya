package lab_final_diegopuche_juananzola_mateoanaya;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JuanPoints {

    public static void point4() {

        Scanner l = new Scanner(System.in);
        int number, multip = 2, d, sum = 0, result;
        String inputValue;
        System.out.println("\n----------------------------");
        System.out.println("    Clave de un número     ");
        System.out.println("-----------------------------");

        do {

            inputValue = JOptionPane.showInputDialog("Por favor, ingrese el número a hallar clave");

            if (inputValue != null) {

                if (!inputValue.equals("")) {

                    number = Integer.parseInt(inputValue);
                    if (number < 0) {
                        JOptionPane.showMessageDialog(null, "La clave del número " +number+ " Es: -1"); 
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Debes ingresar algun valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Debes ingresar algun valor", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (inputValue == null || inputValue.equals(""));

        number = Integer.parseInt(inputValue);
        while (number > 0) {
            // Nos permite dividir el número por digitos
            d = number % 10;
            sum = sum + d * multip;         // Acá sumamos la multiplicación de cada digito por 2,3,4,5... n dígitos 
            multip++;
            number /= 10;

        }
       
            result = sum % 10;
            JOptionPane.showMessageDialog(null, "La clave de " + number + " Es: " + result);
        }

    

    public static void point5() {

        String inputValue;

        int multiplicador,
                multiplicando,
                result = 0;

        System.out.println("\n----------------------------");
        System.out.println("    Multiplicacion Rusa     ");
        System.out.println("-----------------------------");

        //Preguntar por el multiplicador
        do {

            inputValue = JOptionPane.showInputDialog("Por favor, ingrese el multiplicador");

            if (inputValue != null) {

                if (!inputValue.equals("")) {

                    multiplicador = Integer.parseInt(inputValue);
                    if (multiplicador <= 0) {
                        JOptionPane.showMessageDialog(null,
                                "Solo tabajamos con numeros naturales", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        inputValue = "NoNatural";
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Debes ingresar algun valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Debes ingresar algun valor", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (inputValue == null || inputValue.equals("") || inputValue.equals("NoNatural"));

        multiplicador = Integer.parseInt(inputValue);

        //Preguntar por el multiplicando
        do {

            inputValue = JOptionPane.showInputDialog("Por favor, ingrese el multiplicando");

            if (inputValue != null) {

                if (!inputValue.equals("")) {

                    multiplicando = Integer.parseInt(inputValue);
                    if (multiplicando <= 0) {
                        JOptionPane.showMessageDialog(null,
                                "Solo tabajamos con numeros naturales", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        inputValue = "NoNatural";
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Debes ingresar algun valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Debes ingresar algun valor", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (inputValue == null || inputValue.equals("") || inputValue.equals("NoNatural"));

        multiplicando = Integer.parseInt(inputValue);

        while (multiplicador != 1) {

            if (multiplicador % 2 != 0) {
                result = result + multiplicando;
            }

            System.out.println("Multiplicador: " + multiplicador + "   "
                    + "Multiplicando: " + multiplicando);

            multiplicador = multiplicador / 2;
            multiplicando = multiplicando * 2;
        }

        System.out.println("Multiplicador: " + multiplicador + " "
                + "Multiplicando: " + multiplicando);

        //Uno siempre es impar
        result += multiplicando;

        System.out.println("El resultado es: " + result);

    }

    public static void dudas() {

        //Escribe aqui tu codigo de pruebas
    }

}

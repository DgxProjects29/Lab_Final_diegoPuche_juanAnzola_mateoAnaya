package lab_final_diegopuche_juananzola_mateoanaya;

import javax.swing.JOptionPane;

public class JuanPoints {

    public static void point4() {
        
        String inputValue;

        int number, numberKey, numberText;
        int d, multip = 2, sum = 0;
        
        JOptionPane.showMessageDialog(null,
                "Clave de un número", "Clave de un número",
                JOptionPane.INFORMATION_MESSAGE);

        do {

            inputValue = JOptionPane.showInputDialog("Por favor, ingrese "
                    + "el número para hallar su clave:  ");

            if (inputValue != null) {

                if (!inputValue.equals("")) {

                    number = Integer.parseInt(inputValue);
                    if (number < 0) {
                        JOptionPane.showMessageDialog(null, "La clave del número " +number+ " Es: -1  "); 
                    }
                    
                    if(number == 0){
                        JOptionPane.showMessageDialog(null, "La clave del número " +number+ " Es: 0  "); 
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, ingrese algún valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Por favor, ingrese algún valor", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (inputValue == null || inputValue.equals(""));

        number = Integer.parseInt(inputValue);
        numberText = number;
        
        if(number > 0){
            
            // Nos permite dividir el número por dígitos ej 123 -> 3, 2 , 1
            while (number > 0) {
                d = number % 10;
                sum = sum + d * multip;
                multip++;
                number /= 10;
            }
            
            numberKey = sum % 10;
            JOptionPane.showMessageDialog(null, "La clave de " + numberText + " es: " + numberKey,
                    "Los resultados son", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    
    public static void point5() {

        String inputValue;

        int multiplicador, multiplicando, result = 0;

        JOptionPane.showMessageDialog(null,
                "Multiplicación Rusa", "Multiplicación Rusa",
                JOptionPane.INFORMATION_MESSAGE);

        //Preguntar por el multiplicador
        do {

            inputValue = JOptionPane.showInputDialog("Por favor, ingrese el multiplicador");

            if (inputValue != null) {

                if (!inputValue.equals("")) {

                    multiplicador = Integer.parseInt(inputValue);
                    if (multiplicador <= 0) {
                        JOptionPane.showMessageDialog(null,
                                "Solo trabajamos con números naturales", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        inputValue = "NoNatural";
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, ingrese algún valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Por favor, ingrese algún valor", "Error",
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
                                "Solo trabajamos con números naturales", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        inputValue = "NoNatural";
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, ingrese algún valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Por favor, ingrese algún valor", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (inputValue == null || inputValue.equals("") || inputValue.equals("NoNatural"));

        multiplicando = Integer.parseInt(inputValue);

        while (multiplicador != 1) {

            if (multiplicador % 2 != 0) {
                result = result + multiplicando;
            }

            multiplicador = multiplicador / 2;
            multiplicando = multiplicando * 2;
        }
        
        //Uno siempre es impar
        result += multiplicando;

        JOptionPane.showMessageDialog(null, "El resultado es: " + result,
                    "Los resultados son", JOptionPane.INFORMATION_MESSAGE);

    }

}

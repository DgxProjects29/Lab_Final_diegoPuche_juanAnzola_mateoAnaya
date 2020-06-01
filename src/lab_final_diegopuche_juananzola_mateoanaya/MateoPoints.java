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
                            "Por favor, ingrese algun valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    //System.out.println("[Error] Debes ingresar algun valor");
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Por favor, ingrese algun valor "
                        + "para", "Error",
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
                    + " >El seno de " + xDegrees + " es: " + sine + "\n"
                    + " >El coseno de " + xDegrees + " es: " + cosine + "\n"
                    + " >La tangente de " + xDegrees + " es: " + tangent + "\n"
                    + " >La secante de " + xDegrees + " es: " + secant + "\n"
                    + " >La cosecante no esta definida" + "\n"
                    + " >La cotagente no esta definida";
        } else if (xDegrees == 90 || xDegrees == 270) {
            cosecant = 1 / sine;
            cotangent = cosine / sine;
            messageToDisplay = "Identidades trigonometricas para el angulo " + xDegrees + "\n"
                    + " >El seno de " + xDegrees + " es: " + sine + "\n"
                    + " >El coseno de " + xDegrees + " es: " + cosine + "\n"
                    + " >La tangente no esta definida " + "\n"
                    + " >La secante no esta definida " + "\n"
                    + " >La cosecante de " + xDegrees + " es: " + cosecant + "\n"
                    + " >La cotangente de " + xDegrees + " es: " + cotangent;
        } else {
            tangent = sine / cosine;
            cosecant = 1 / sine;
            secant = 1 / cosine;
            cotangent = cosine / sine;
            messageToDisplay = "Identidades trigonometricas para el angulo " + xDegrees + "\n"
                    + " >El seno de " + xDegrees + " es: " + sine + "\n"
                    + " >El coseno de " + xDegrees + " es: " + cosine + "\n"
                    + " >La tangente de " + xDegrees + " es: " + tangent + "\n"
                    + " >La secante de " + xDegrees + " es: " + secant + "\n"
                    + " >La cosecante de " + xDegrees + " es: " + cosecant + "\n"
                    + " >La cotangente de " + xDegrees + " es: " + cotangent;
        }

        JOptionPane.showMessageDialog(null, messageToDisplay,
                "Resultados", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void punto_y_fama2() {

        String inputValue;

        //Introduccion
        JOptionPane.showMessageDialog(null,
                "Bienvenido al juego punto y fama\n1. El Jugador 1 tiene que ingresar un numero de 4 digitos que no tenga digitos repetidos\n"
                + "2. El jugador 2 tiene que adivinar el numero que ingreso el jugador 1\n"
                + "3. Fama: Digitos repetidos en la misma posicion\n"
                + "4.Puntos: Digitos repetidos en el numero original pero no en la misma posicion ", "Punto y Fama",
                JOptionPane.INFORMATION_MESSAGE);

        //Mateo haz las instrucciones del juego para el usuario, 
        //recuerda que puedes usar \n para hacer saltos de lineas
        int numberToGuess, tempNumGuess;
        boolean isNumberGuessed = false;

        do {

            inputValue = JOptionPane.showInputDialog("Jugador 1\n"
                    + "Por favor, ingrese el numero a avidinar");

            if (inputValue != null) {

                if (!inputValue.equals("")) {

                    //Validar numero para que sea de 4 cifras 
                    numberToGuess = Integer.parseInt(inputValue);
                    if (numberToGuess < 999 || numberToGuess > 9999) {
                        JOptionPane.showMessageDialog(null,
                                "El número debe ser de 4 cifras", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        inputValue = "NoFourDigits";
                    }

                    if (!inputValue.equals("NoFourDigits")) {

                        //Descomponemos el numero de 4 cifras 1234 D1Temp = 1
                        int d1Temp = numberToGuess / 1000;
                        int d2Temp = numberToGuess / 100 % 10;
                        int d3Temp = numberToGuess / 10 % 10;
                        int d4Temp = numberToGuess % 10;

                        int currentDigit, counter = 0;

                        //Comparar digitos
                        tempNumGuess = numberToGuess;

                        while (tempNumGuess != 0 && !inputValue.equals("RepeatedDigits")) {

                            currentDigit = tempNumGuess % 10;

                            if (d1Temp == currentDigit) {
                                counter++;
                            }
                            if (d2Temp == currentDigit) {
                                counter++;
                            }
                            if (d3Temp == currentDigit) {
                                counter++;
                            }
                            if (d4Temp == currentDigit) {
                                counter++;
                            }

                            //Si hay mas de un digito igual, hay repetidos
                            if (counter > 1) {
                                JOptionPane.showMessageDialog(null,
                                        "El número no debe tener digitos repetidos  ", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                inputValue = "RepeatedDigits";
                            }

                            //Resetear el counter
                            counter = 0;
                            tempNumGuess /= 10;
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Por favor,ingrese algun valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Por favor,ingrese  algun valor", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (inputValue == null || inputValue.equals("") || inputValue.equals("NoFourDigits")
                || inputValue.equals("RepeatedDigits"));

        numberToGuess = Integer.parseInt(inputValue);
        //Descomponen el numero en sus digitos, puedes usar d1Temp, pero deberas,
        //Volverlas globales

        //Variables del juego, number is the number of "jugador 2"
        int countFamas, countPoints, number, num, num2, d, d21, num3, num4;

        while (!isNumberGuessed) {

            countFamas = 0;
            countPoints = 0;

            do {

                inputValue = JOptionPane.showInputDialog("Jugador 2\n"
                        + "Por favor, trate de adivinar el número");

                if (inputValue != null) {

                    if (!inputValue.equals("")) {

                        //Validar numero para que sea de 4 cifras 
                        number = Integer.parseInt(inputValue);
                        if (number < 999 || number > 9999) {
                            JOptionPane.showMessageDialog(null,
                                    "El número debe ser de 4 cifras", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            inputValue = "NoFourDigits";
                        }

                        if (!inputValue.equals("NoFourDigits")) {

                            //Descomponemos el numero de 4 cifras 1234 D1Temp = 1
                            int d1Temp = number / 1000;
                            int d2Temp = number / 100 % 10;
                            int d3Temp = number / 10 % 10;
                            int d4Temp = number % 10;

                            int currentDigit, counter = 0;

                            //Comparar digitos
                            tempNumGuess = number;

                            while (tempNumGuess != 0 && !inputValue.equals("RepeatedDigits")) {

                                currentDigit = tempNumGuess % 10;

                                if (d1Temp == currentDigit) {
                                    counter++;
                                }
                                if (d2Temp == currentDigit) {
                                    counter++;
                                }
                                if (d3Temp == currentDigit) {
                                    counter++;
                                }
                                if (d4Temp == currentDigit) {
                                    counter++;
                                }

                                //Si hay mas de un digito igual, hay repetidos
                                if (counter > 1) {
                                    JOptionPane.showMessageDialog(null,
                                            "El número no debe tener digitos repetidos  ", "Error",
                                            JOptionPane.ERROR_MESSAGE);
                                    inputValue = "RepeatedDigits";
                                }

                                //Resetear el counter
                                counter = 0;
                                tempNumGuess /= 10;
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Por favor, ingrese algun valor", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, ingrese algun valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } while (inputValue == null || inputValue.equals("") || inputValue.equals("NoFourDigits") || inputValue.equals("RepeatedDigits"));

            //Do stuff famas y puntos
            number = Integer.parseInt(inputValue);

            //usar while para recorrer sus digitos, ej 8792, 1 iteracion -> 2,
            //2 iteracion -> 9...
            num = numberToGuess;
            num2 = number;
            num3 = numberToGuess;
            num4 = number;
            while (num != 0 && num2 != 0) {
                d = num % 10;
                d21 = num2 % 10;
                if (d == d21) {
                    countFamas++;

                }
                num = num / 10;
                num2 = num2 / 10;

            }

            if (countFamas == 4) {
                countPoints = 0;

            } else {
                while (num3 != 0) {
                    d = num3 % 10;
                    while (num4 != 0) {
                        d21 = num4 % 10;
                        if (d == d21) {
                            countPoints++;

                        }
                        num4 = num4 / 10;

                    }
                    num3 = num3 / 10;

                }
            }
            JOptionPane.showMessageDialog(null, "Jugador 2 tienes " + countFamas + " famas  y " + countPoints + " puntos", "Fama y Puntos", JOptionPane.INFORMATION_MESSAGE);

            //Jugador 2 adivina el numero si el numero de famas es 4
            isNumberGuessed = countFamas == 4;
        }
    }
}

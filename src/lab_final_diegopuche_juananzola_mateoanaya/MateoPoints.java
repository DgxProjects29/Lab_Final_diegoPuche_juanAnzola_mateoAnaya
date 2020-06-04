package lab_final_diegopuche_juananzola_mateoanaya;

import javax.swing.JOptionPane;
import java.util.Random;

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

        //Preguntar por el ángulo en grados
        do {

            inputValue = JOptionPane.showInputDialog("Por favor,"
                    + " ingrese el ángulo en grados");

            if (inputValue != null) {

                if (!inputValue.equals("")) {

                    x = Double.parseDouble(inputValue);
                    if (x < 0 || x > 359) {
                        inputValue = "AngleError";
                        JOptionPane.showMessageDialog(null,
                                "Ángulos válidos se encuentran en este "
                                + "íntervalo [0,360)", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, ingrese algún valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Por favor, ingrese algún valor ", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (inputValue == null || inputValue.equals("") || inputValue.equals("AngleError"));

        x = Double.parseDouble(inputValue);
        xDegrees = x;
        x = x * (2 * Math.PI / 360);
        
        //Una aproximación hasta 10
        for (int n = 0; n <= 10; n++) {

            //Cálculo del signo para el termino atual
            sign = sign * -1;

            //Cálculo potencia del seno x^(2n + 1)
            for (int i2 = 1; i2 <= 2 * n + 1; i2++) {
                numSine = numSine * x;
            }

            //Cálculo Factorial del seno (2n + 1)!
            for (int i3 = 1; i3 <= 2 * n + 1; i3++) {
                demSine = demSine * i3;
            }

            //Cálculo potencia coseno x^(2n)
            for (int i4 = 1; i4 <= 2 * n; i4++) {
                numCosine = numCosine * x;
            }

            //Cálculo factorial coseno (2n)!
            for (int i5 = 1; i5 <= 2 * n; i5++) {
                demCosine = demCosine * i5;
            }

            sine += sign * numSine / demSine;
            cosine += sign * numCosine / demCosine;

            //Reseteo de variables
            numSine = 1;
            demSine = 1;
            numCosine = 1;
            demCosine = 1;

        }

        if (xDegrees == 0 || xDegrees == 180) {
            tangent = sine / cosine;
            secant = 1 / cosine;
            messageToDisplay = "Identidades trigonométricas para el ángulo " + xDegrees + "\n"
                    + " >El seno de " + xDegrees + " es: " + sine + "\n"
                    + " >El coseno de " + xDegrees + " es: " + cosine + "\n"
                    + " >La tangente de " + xDegrees + " es: " + tangent + "\n"
                    + " >La secante de " + xDegrees + " es: " + secant + "\n"
                    + " >La cosecante no está definida" + "\n"
                    + " >La cotagente no está definida";
        } else if (xDegrees == 90 || xDegrees == 270) {
            cosecant = 1 / sine;
            cotangent = cosine / sine;
            messageToDisplay = "Identidades trigonométricas para el ángulo " + xDegrees + "\n"
                    + " >El seno de " + xDegrees + " es: " + sine + "\n"
                    + " >El coseno de " + xDegrees + " es: " + cosine + "\n"
                    + " >La tangente no está definida " + "\n"
                    + " >La secante no está definida " + "\n"
                    + " >La cosecante de " + xDegrees + " es: " + cosecant + "\n"
                    + " >La cotangente de " + xDegrees + " es: " + cotangent;
        } else {
            tangent = sine / cosine;
            cosecant = 1 / sine;
            secant = 1 / cosine;
            cotangent = cosine / sine;
            messageToDisplay = "Identidades trigonométricas para el ángulo " + xDegrees + "\n"
                    + " >El seno de " + xDegrees + " es: " + sine + "\n"
                    + " >El coseno de " + xDegrees + " es: " + cosine + "\n"
                    + " >La tangente de " + xDegrees + " es: " + tangent + "\n"
                    + " >La secante de " + xDegrees + " es: " + secant + "\n"
                    + " >La cosecante de " + xDegrees + " es: " + cosecant + "\n"
                    + " >La cotangente de " + xDegrees + " es: " + cotangent;
        }

        JOptionPane.showMessageDialog(null, messageToDisplay,
                "Los resultados son", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void point2() {

        String inputValue;

        //Introducción
        JOptionPane.showMessageDialog(null,
                "Bienvenido al juego punto y fama\n\n"
                + "1. El PC generará un número aleatorio de 4 cifras sin dígitos repetidos\n"
                + "2. El Jugador 2 tiene que ingresar un número de 4 dígitos\n"
                + "que no tenga dígitos repetidos para adivinar el número del PC\n"
                + "3. Fama: Dígitos repetidos en la misma posición\n"
                + "4. Puntos: Dígitos repetidos en el número original pero no en la misma posición ", "Punto y Fama",
                JOptionPane.INFORMATION_MESSAGE);

        int numberToGuess, tempNumGuess;
        boolean isNumberGuessed = false;
        Random rd = new Random();
        
        //Descomposicion del número en 4 cifras
        int d1Temp, d2Temp, d3Temp, d4Temp;

        do {
            
            inputValue = "NoError";

            numberToGuess = rd.nextInt(8999) + 1000;

            if (!inputValue.equals("NoFourDigits")) {

                //Descomponemos el numero de 4 cifras 1234 D1Temp = 1
                d1Temp = numberToGuess / 1000;
                d2Temp = numberToGuess / 100 % 10;
                d3Temp = numberToGuess / 10 % 10;
                d4Temp = numberToGuess % 10;

                int currentDigit, counter = 0;

                //Comparar dígitos
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

                    //Si hay más de un dígito igual, hay repetidos
                    if (counter > 1) {
                        inputValue = "RepeatedDigits";
                    }

                    //Resetear el counter
                    counter = 0;
                    tempNumGuess /= 10;
                }
            }

        } while (inputValue.equals("NoFourDigits") || inputValue.equals("RepeatedDigits"));

        //Variables del juego, number is the number of "jugador 2"
        int countFamas, countPoints, attempts = 0;
        int number, num, num2, d1, d2, posNum, posNum2;
        
        //Mientras el número no sea adivinado el juego continuará
        while (!isNumberGuessed) {

            countFamas = 0;
            countPoints = 0;

            do {

                inputValue = JOptionPane.showInputDialog("Jugador 2\n"
                        + "Por favor, trate de adivinar el número");

                if (inputValue != null) {

                    if (!inputValue.equals("")) {

                        //Validar número para que sea de 4 cifras 
                        number = Integer.parseInt(inputValue);
                        if (number < 999 || number > 9999) {
                            JOptionPane.showMessageDialog(null,
                                    "El número debe ser de 4 cifras y positivo", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            inputValue = "NoFourDigits";
                        }

                        if (!inputValue.equals("NoFourDigits")) {

                            //Descomponemos el número de 4 cifras 1234 D1Temp = 1
                            d1Temp = number / 1000;
                            d2Temp = number / 100 % 10;
                            d3Temp = number / 10 % 10;
                            d4Temp = number % 10;

                            int currentDigit, counter = 0;

                            //Comparar dígitos
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

                                //Si hay más de un dígito igual, hay repetidos
                                if (counter > 1) {
                                    JOptionPane.showMessageDialog(null,
                                            "El número no debe tener dígitos repetidos  ", "Error",
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
                                "Por favor, ingrese algún valor", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, ingrese algún valor", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } while (inputValue == null || inputValue.equals("") || 
                    inputValue.equals("NoFourDigits") ||
                    inputValue.equals("RepeatedDigits"));

            number = Integer.parseInt(inputValue);
            
            //Almacenadores temporales num -> J1, num2 -> J2
            num = numberToGuess;
            num2 = number;
            posNum2 = 0;
            posNum = 0;
                        
            //Cálculo de puntos y famas
            while (num2 != 0) {
                posNum2 ++;
                d2 = num2 % 10;
                while(num != 0){
                    posNum++; 
                    d1 = num % 10;
                    //System.out.println("[Debug]:  "+"Pos2: "+posNum2+"  Pos: "+posNum+" -- "+d2+ " - "+d1);
                    if(d2 == d1 && posNum2 == posNum){
                        countFamas++;
                    }else if(d2 == d1){
                        countPoints++;
                    }
                    num /= 10;
                }
                
                num2 /= 10;
                num = numberToGuess;
                posNum = 0;
            }
            
            JOptionPane.showMessageDialog(null, "Jugador 2 tienes:  " + "\n" +
                    "Famas:   "+countFamas + "\n" +
                    "Puntos:   "+countPoints + "\n", "Fama y Puntos", 
                    JOptionPane.INFORMATION_MESSAGE);

            //Jugador 2 adivina el número si el número de famas es 4
            isNumberGuessed = countFamas == 4;
            attempts++;
        }
        
        JOptionPane.showMessageDialog(null, "Número de intentos:" + attempts,
                    "Resultados  ", JOptionPane.INFORMATION_MESSAGE);
    }
}
    
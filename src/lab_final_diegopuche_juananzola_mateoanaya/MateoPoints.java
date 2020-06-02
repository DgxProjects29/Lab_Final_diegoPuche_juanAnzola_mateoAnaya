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

        //Preguntar por el angulo en grados
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
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Por favor, ingrese algun valor ", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (inputValue == null || inputValue.equals("") || inputValue.equals("AngleError"));

        x = Double.parseDouble(inputValue);
        xDegrees = x;
        x = x * (2 * Math.PI / 360);
        
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

    public static void point2() {

        String inputValue;

        //Introduccion
        JOptionPane.showMessageDialog(null,
                "Bienvenido al juego punto y fama\n\n"
                + "1. El PC generara un número aleatorio de 4 cifras sin digitos repetidos\n"
                + "2. El Jugador 2 tiene que ingresar un numero de 4 digitos\n"
                + "que no tenga digitos repetidos para adivinar el numero del PC\n"
                + "3. Fama: Digitos repetidos en la misma posicion\n"
                + "4. Puntos: Digitos repetidos en el numero original pero no en la misma posicion ", "Punto y Fama",
                JOptionPane.INFORMATION_MESSAGE);

        int numberToGuess, tempNumGuess;
        boolean isNumberGuessed = false;
        Random rd = new Random();
        
        //Descompocision del numero en 4 cifras
        int d1Temp, d2Temp, d3Temp, d4Temp;

        do {
            
            inputValue = "NoError";

            numberToGuess = rd.nextInt(999) + 1000;
            System.out.println(numberToGuess);

            if (!inputValue.equals("NoFourDigits")) {

                //Descomponemos el numero de 4 cifras 1234 D1Temp = 1
                d1Temp = numberToGuess / 1000;
                d2Temp = numberToGuess / 100 % 10;
                d3Temp = numberToGuess / 10 % 10;
                d4Temp = numberToGuess % 10;

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
        
        //Mientras el número no se adivinado el juego continuara
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
                            d1Temp = number / 1000;
                            d2Temp = number / 100 % 10;
                            d3Temp = number / 10 % 10;
                            d4Temp = number % 10;

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

            } while (inputValue == null || inputValue.equals("") || 
                    inputValue.equals("NoFourDigits") ||
                    inputValue.equals("RepeatedDigits"));

            number = Integer.parseInt(inputValue);
            
            //Almacenadores temporal num -> J1, num2 -> J2
            num = numberToGuess;
            num2 = number;
            posNum2 = 0;
            posNum = 0;
            
            //System.out.println(number);
            
            //Calculo total
            while (num2 != 0) {
                posNum2 ++;
                d2 = num2 % 10;
                while(num != 0){
                    posNum++; 
                    d1 = num % 10;
                    //System.out.println("Debug:  "+"Pos2: "+posNum2+"  Pos: "+posNum+" -- "+d2+ " - "+d1);
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
                    "Famas: "+countFamas + "\n" +
                    "Puntos: "+countPoints + "\n", "Fama y Puntos", 
                    JOptionPane.INFORMATION_MESSAGE);

            //Jugador 2 adivina el numero si el numero de famas es 4
            isNumberGuessed = countFamas == 4;
            attempts++;
        }
        
        JOptionPane.showMessageDialog(null, "Numero de intentos:" + attempts,
                    "Resultados  ", JOptionPane.INFORMATION_MESSAGE);
    }
}
    
package lab_final_diegopuche_juananzola_mateoanaya;

import javax.swing.JOptionPane;

public class Lab_Final_diegoPuche_juanAnzola_mateoAnaya {

    public static void main(String[] args) {

        String option;

        do {

            Object[] possibleValues = {"Triqui", "Punto y fama",
                "Funciones trigonométricas con series de Taylor",
                "Clave de un número", "Multiplicación Rusa", "Salir"};
            Object optionFromPane = JOptionPane.showInputDialog(null,
                    "Escoge una opcion", "Menu:",
                    JOptionPane.QUESTION_MESSAGE, null,
                    possibleValues, possibleValues[0]);

            //Si cancelas o cierras el JPaneOption, se acaba el programa
            if (optionFromPane == null) {
                option = "";
            } else {
                option = (String) optionFromPane;
            }

            switch (option) {
                
                case "Triqui":
                    
                    //Instrucciones y bienvenida  
                    JOptionPane.showMessageDialog(null,
                        "Bienvenido al conocido juego triqui  ", "Triqui",
                        JOptionPane.INFORMATION_MESSAGE);
                    
                    String ExampleTriquiTable = "Las posiciones del tablero son:\n" + 
                                  "| 1 | 2 | 3 |\n" +
                                  "| 4 | 5 | 6 |\n" +
                                  "| 7 | 8 | 9 |\n";
                    JOptionPane.showMessageDialog(null,
                        ExampleTriquiTable, "Triqui",
                        JOptionPane.INFORMATION_MESSAGE);
                    
                    //Variables del tablero de triqui
                    int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0,
                            a7 = 0, a8 = 0, a9 = 0;
                    String triquiTable;
                                     
                    //Variables del juego
                    Object positionFromPane;
                    String jugadorName = "";
                    boolean isCellFull;
                    boolean isGameOver = false;
                    boolean thereIsWinner = false;
                    int gameTurn = 0;
                    
                    Object[] positions = {"1", "2", "3", "4", "5", "6", "7",
                        "8", "9"};
                    
                    /*
                    //Primer renderizaje
                    triquiTable = "| -- | -- | -- |\n" +
                                  "| -- | -- | -- |\n" +
                                  "| -- | -- | -- |\n";
                    
                    JOptionPane.showMessageDialog(null,
                        triquiTable, "Triqui",
                        JOptionPane.INFORMATION_MESSAGE);
                    */
                    
                    while(!thereIsWinner && !isGameOver){
                        
                        gameTurn++;
                        
                        //Solicitud de ubicacion para jugar en el tablero
                        do{
                            isCellFull = false;
                            
                            if(gameTurn % 2 == 0){
                                jugadorName = "Jugador Cruz";
                            }else{
                                jugadorName = "Jugador Circulo";
                            }
                            
                            positionFromPane = JOptionPane.showInputDialog(null,
                            "Por favor, Escoge una posición", jugadorName,
                            JOptionPane.QUESTION_MESSAGE, null,
                            positions, positions[0]);
                            
                            if(positionFromPane != null){
                                
                                String position = (String) positionFromPane;

                                switch (position){
                                    
                                    case "1":
                                        
                                        if(a1 == 0){
                                            if(gameTurn % 2 == 0){
                                                a1 = 2;
                                            }else{
                                                a1 = 1;
                                            }
                                        }else{
                                            isCellFull = true;
                                        }
                                        
                                        break;
                                    
                                    case "2":
                                        
                                        if(a2 == 0){
                                            if(gameTurn % 2 == 0){
                                                a2 = 2;
                                            }else{
                                                a2 = 1;
                                            }
                                        }else{
                                            isCellFull = true;
                                        }
                                        
                                        break;
                                    
                                    case "3":
                                        
                                        if(a3 == 0){
                                            if(gameTurn % 2 == 0){
                                                a3 = 2;
                                            }else{
                                                a3 = 1;
                                            }
                                        }else{
                                            isCellFull = true;
                                        }
                                        
                                        break;
                                    
                                    case "4":
                                        
                                        if(a4 == 0){
                                            if(gameTurn % 2 == 0){
                                                a4 = 2;
                                            }else{
                                                a4 = 1;
                                            }
                                        }else{
                                            isCellFull = true;
                                        }
                                        
                                        break;
                                    
                                    case "5":
                                        
                                        if(a5 == 0){
                                            if(gameTurn % 2 == 0){
                                                a5 = 2;
                                            }else{
                                                a5 = 1;
                                            }
                                        }else{
                                            isCellFull = true;
                                        }
                                        
                                        break;
                                    
                                    case "6":
                                        
                                        if(a6 == 0){
                                            if(gameTurn % 2 == 0){
                                                a6 = 2;
                                            }else{
                                                a6 = 1;
                                            }
                                        }else{
                                            isCellFull = true;
                                        }
                                        
                                        break;
                                    
                                    case "7":
                                        
                                        if(a7 == 0){
                                            if(gameTurn % 2 == 0){
                                                a7 = 2;
                                            }else{
                                                a7 = 1;
                                            }
                                        }else{
                                            isCellFull = true;
                                        }
                                        
                                        break;
                                    
                                    case "8":
                                        
                                        if(a8 == 0){
                                            if(gameTurn % 2 == 0){
                                                a8 = 2;
                                            }else{
                                                a8 = 1;
                                            }
                                        }else{
                                            isCellFull = true;
                                        }
                                        
                                        break;
                                        
                                    case "9":
                                        
                                        if(a9 == 0){
                                            if(gameTurn % 2 == 0){
                                                a9 = 2;
                                            }else{
                                                a9 = 1;
                                            }
                                        }else{
                                            isCellFull = true;
                                        }
                                        
                                        break;
                                }
                                
                                if(isCellFull){
                                    
                                    JOptionPane.showMessageDialog(null,
                                        "Celda llena, por favor escoja una posición " +
                                        "diferente  ", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                }
                                
                            }else{
                                JOptionPane.showMessageDialog(null,
                                    "No puedes cerrar la ventada\n" +
                                    "Por favor escoja una posición", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            }
                        
                        }while(positionFromPane == null || isCellFull);
                        
                        //Hay ocho formas de ganar
                        
                        //Horizontales
                        boolean way1 = a1 == a2 && a2 == a3 && (a1 == 1 || a1 == 2);
                        boolean way2 = a4 == a5 && a5 == a6 && (a4 == 1 || a4 == 2);
                        boolean way3 = a7 == a8 && a8 == a9 && (a7 == 1 || a7 == 2);

                        //Verticales
                        boolean way4 = a1 == a4 && a4 == a7 && (a1 == 1 || a1 == 2);
                        boolean way5 = a2 == a5 && a5 == a8 && (a2 == 1 || a2 == 2);
                        boolean way6 = a3 == a6 && a6 == a9 && (a3 == 1 || a3 == 2);

                        //Diagonales
                        boolean way7 = a1 == a5 && a5 == a9 && (a1 == 1 || a1 == 2);
                        boolean way8 = a3 == a5 && a5 == a7 && (a3 == 1 || a3 == 2);

                        thereIsWinner = way1 || way2 || way3 ||
                                way4 || way5 ||way6 ||
                                way7 || way8;
                        
                        if(gameTurn == 9){
                            isGameOver = true;
                        }
                        
                        //Renderizar el tablero, duele no tener vectores
                        triquiTable = "";
                        
                        switch (a1) {
                            case 1:
                                triquiTable += "| O ";
                                break;
                            case 2:
                                triquiTable += "| X ";
                                break;
                            default:
                                triquiTable += "| -- ";
                                break;
                            }
                        
                        switch (a2) {
                            case 1:
                                triquiTable += "| O ";
                                break;
                            case 2:
                                triquiTable += "| X ";
                                break;
                            default:
                                triquiTable += "| -- ";
                                break;
                            }
                        
                        switch (a3) {
                            case 1:
                                triquiTable += "| O |"+"\n";
                                break;
                            case 2:
                                triquiTable += "| X |"+"\n";
                                break;
                            default:
                                triquiTable += "| -- |"+"\n";
                                break;
                            }
                        
                        switch (a4) {
                            case 1:
                                triquiTable += "| O ";
                                break;
                            case 2:
                                triquiTable += "| X ";
                                break;
                            default:
                                triquiTable += "| -- ";
                                break;
                            }
                        
                        switch (a5) {
                            case 1:
                                triquiTable += "| O ";
                                break;
                            case 2:
                                triquiTable += "| X ";
                                break;
                            default:
                                triquiTable += "| -- ";
                                break;
                            }
                        
                        switch (a6) {
                            case 1:
                                triquiTable += "| O |"+"\n";
                                break;
                            case 2:
                                triquiTable += "| X |"+"\n";
                                break;
                            default:
                                triquiTable += "| -- |"+"\n";
                                break;
                            }
                        
                        switch (a7) {
                            case 1:
                                triquiTable += "| O ";
                                break;
                            case 2:
                                triquiTable += "| X ";
                                break;
                            default:
                                triquiTable += "| -- ";
                                break;
                            }
                        
                        switch (a8) {
                            case 1:
                                triquiTable += "| O ";
                                break;
                            case 2:
                                triquiTable += "| X ";
                                break;
                            default:
                                triquiTable += "| -- ";
                                break;
                            }
                        
                        switch (a9) {
                            case 1:
                                triquiTable += "| O |"+"\n";
                                break;
                            case 2:
                                triquiTable += "| X |"+"\n";
                                break;
                            default:
                                triquiTable += "| -- |"+"\n";
                                break;
                            }
                        
                        JOptionPane.showMessageDialog(null,
                        triquiTable, "Turno:  "+gameTurn,
                        JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    //Fin de la partida
                    if(gameTurn == 9){
                        jugadorName = "Nadie gano, juego empatado";
                    }
                    
                    String resultMessage = "Turnos utilizados: "+gameTurn + "\n" +
                            "Ganador: "+jugadorName + "\n\n" +
                            "Gracias por jugar!";
                    
                    JOptionPane.showMessageDialog(null,
                        resultMessage, "Resultados: ",
                        JOptionPane.INFORMATION_MESSAGE);

                    break;
                
                case "Punto y fama":
                    
                    MateoPoints.point2();
                    
                    break;
                   
                case "Funciones trigonométricas con series de Taylor":

                    MateoPoints.point3();
                    
                    break;
                    
                case "Clave de un número":
                    
                    JuanPoints.point4();
                    
                    break;

                case "Multiplicación Rusa":

                    JuanPoints.point5();

                    break;

            }

        } while (!option.equals(""));
    }

}

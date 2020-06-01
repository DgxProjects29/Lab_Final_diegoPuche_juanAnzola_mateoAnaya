package lab_final_diegopuche_juananzola_mateoanaya;

import javax.swing.JOptionPane;

public class Lab_Final_diegoPuche_juanAnzola_mateoAnaya {

    public static void main(String[] args) {

        String option;

        do {
            System.out.println("\n---------------------- Menú -------------------------");
            System.out.println("[1]. Triqui ");
            System.out.println("[2]. Punto y fama ");
            System.out.println("[3]. Funciones trigonométricas con series de Taylor ");
            System.out.println("[4]. Clave de un número ");
            System.out.println("[5]. Multiplicación Rusa");
            System.out.println("[6]. Salir");
            System.out.println("-------------------------------------------------------");

            Object[] possibleValues = {"Triqui", "Punto y fama",
                "Funciones trigonométricas con series de Taylor",
                "Clave de un número", "Multiplicación Rusa", "Salir"};
            Object optionFromPane = JOptionPane.showInputDialog(null,
                    "Escoge una opcion", "Menu:",
                    JOptionPane.QUESTION_MESSAGE, null,
                    possibleValues, possibleValues[0]);

            //Si cacelas o cierras el JPaneOption, se acaba el programa
            if (optionFromPane == null) {
                option = "";
            } else {
                option = (String) optionFromPane;
            }

            switch (option) {

                case "Triqui":

                    System.out.println("\n---------------");
                    System.out.println("     Triqui     ");
                    System.out.println("-----------------");

                    //Variables del tablero de triqui
                    int a1 = 0,
                     a2 = 0,
                     a3 = 0,
                     a4 = 0,
                     a5 = 0,
                     a6 = 0,
                     a7 = 0,
                     a8 = 0,
                     a9 = 0;
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

                    //Primer renderizaje
                    triquiTable = "|   |   |   |\n"
                            + "|   |   |   |\n"
                            + "|   |   |   |\n";
                    System.out.println(triquiTable);

                    while (!thereIsWinner && !isGameOver) {

                        gameTurn++;
                        System.out.println("Turno: " + gameTurn);

                        //Solicitud de ubicacion para jugar en el tablero
                        do {
                            isCellFull = false;

                            if (gameTurn % 2 == 0) {
                                jugadorName = "Jugador Cruz";
                            } else {
                                jugadorName = "Jugador Circulo";
                            }

                            positionFromPane = JOptionPane.showInputDialog(null,
                                    "Por favor, Escoge una posición", jugadorName,
                                    JOptionPane.QUESTION_MESSAGE, null,
                                    positions, positions[0]);

                            if (positionFromPane != null) {

                                String position = (String) positionFromPane;

                                switch (position) {

                                    case "1":

                                        if (a1 == 0) {
                                            if (gameTurn % 2 == 0) {
                                                a1 = 2;
                                            } else {
                                                a1 = 1;
                                            }
                                        } else {
                                            isCellFull = true;
                                        }

                                        break;

                                    case "2":

                                        if (a2 == 0) {
                                            if (gameTurn % 2 == 0) {
                                                a2 = 2;
                                            } else {
                                                a2 = 1;
                                            }
                                        } else {
                                            isCellFull = true;
                                        }

                                        break;

                                    case "3":

                                        if (a3 == 0) {
                                            if (gameTurn % 2 == 0) {
                                                a3 = 2;
                                            } else {
                                                a3 = 1;
                                            }
                                        } else {
                                            isCellFull = true;
                                        }

                                        break;

                                    case "4":

                                        if (a4 == 0) {
                                            if (gameTurn % 2 == 0) {
                                                a4 = 2;
                                            } else {
                                                a4 = 1;
                                            }
                                        } else {
                                            isCellFull = true;
                                        }

                                        break;

                                    case "5":

                                        if (a5 == 0) {
                                            if (gameTurn % 2 == 0) {
                                                a5 = 2;
                                            } else {
                                                a5 = 1;
                                            }
                                        } else {
                                            isCellFull = true;
                                        }

                                        break;

                                    case "6":

                                        if (a6 == 0) {
                                            if (gameTurn % 2 == 0) {
                                                a6 = 2;
                                            } else {
                                                a6 = 1;
                                            }
                                        } else {
                                            isCellFull = true;
                                        }

                                        break;

                                    case "7":

                                        if (a7 == 0) {
                                            if (gameTurn % 2 == 0) {
                                                a7 = 2;
                                            } else {
                                                a7 = 1;
                                            }
                                        } else {
                                            isCellFull = true;
                                        }

                                        break;

                                    case "8":

                                        if (a8 == 0) {
                                            if (gameTurn % 2 == 0) {
                                                a8 = 2;
                                            } else {
                                                a8 = 1;
                                            }
                                        } else {
                                            isCellFull = true;
                                        }

                                        break;

                                    case "9":

                                        if (a9 == 0) {
                                            if (gameTurn % 2 == 0) {
                                                a9 = 2;
                                            } else {
                                                a9 = 1;
                                            }
                                        } else {
                                            isCellFull = true;
                                        }

                                        break;
                                }

                                if (isCellFull) {
                                    System.out.println("[Error] Celda llena, "
                                            + "por favor escoja una diferente "
                                            + "posición");
                                }

                            } else {
                                System.out.println("[Error] No puedes cerrar la "
                                        + "ventada, por favor escoja una posición");
                            }

                        } while (positionFromPane == null || isCellFull);

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

                        thereIsWinner = way1 || way2 || way3
                                || way4 || way5 || way6
                                || way7 || way8;

                        if (gameTurn == 9) {
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
                                triquiTable += "|   ";
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
                                triquiTable += "|   ";
                                break;
                        }

                        switch (a3) {
                            case 1:
                                triquiTable += "| O |" + "\n";
                                break;
                            case 2:
                                triquiTable += "| X |" + "\n";
                                break;
                            default:
                                triquiTable += "|   |" + "\n";
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
                                triquiTable += "|   ";
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
                                triquiTable += "|   ";
                                break;
                        }

                        switch (a6) {
                            case 1:
                                triquiTable += "| O |" + "\n";
                                break;
                            case 2:
                                triquiTable += "| X |" + "\n";
                                break;
                            default:
                                triquiTable += "|   |" + "\n";
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
                                triquiTable += "|   ";
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
                                triquiTable += "|   ";
                                break;
                        }

                        switch (a9) {
                            case 1:
                                triquiTable += "| O |" + "\n";
                                break;
                            case 2:
                                triquiTable += "| X |" + "\n";
                                break;
                            default:
                                triquiTable += "|   |" + "\n";
                                break;
                        }

                        System.out.println(triquiTable);
                    }

                    System.out.println("\n----------------------------");
                    System.out.println("      Fin de la partida     ");
                    System.out.println("-----------------------------");

                    System.out.println("[Info] Resultados:");

                    if (gameTurn != 9) {
                        System.out.println("-> El ganador es: " + jugadorName);
                    } else {
                        System.out.println("-> El juego quedo en empate!");
                    }

                    break;

                case "Punto y fama":

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

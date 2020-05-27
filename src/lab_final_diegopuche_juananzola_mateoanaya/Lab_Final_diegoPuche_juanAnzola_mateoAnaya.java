
package lab_final_diegopuche_juananzola_mateoanaya;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lab_Final_diegoPuche_juanAnzola_mateoAnaya {

    
    public static void main(String[] args) {
       
        Object op;
        int finalop; 
        Object selectedValue;
  
        do {
            System.out.println("\n---------------------- Menú -------------------------");
            System.out.println("[1]. Triqui ");
            System.out.println("[2]. Punto y fama: ");
            System.out.println("[3]. Funciones trigonométricas con series de Taylor ");
            System.out.println("[4]. Clave de un número ");
            System.out.println("[5]. Multiplicación Rusa");
            System.out.println("[6]. Salir");
            System.out.println("-------------------------------------------------------");
            
            Object[] possibleValues = {1, 2, 3, 4, 5, 6};
            selectedValue = JOptionPane.showInputDialog(null,
            "Escoge una opcion", "Ingrese:",
            JOptionPane.QUESTION_MESSAGE, null,
            possibleValues, possibleValues[0]);
            op = selectedValue;
           
            while (op == null) {
                
                System.out.println("\n----------------------------------");
                System.out.println("   No debes cancelar el dialogo  ");
                System.out.println("------------------------------------");
             
                selectedValue = JOptionPane.showInputDialog(null,
                "Escoge una opcion", "Menu:",
                JOptionPane.QUESTION_MESSAGE, null,
                possibleValues, possibleValues[0]);
                op = selectedValue;

            }
            
            finalop = (int)op;
            
            switch (finalop) {

                case 5:
                    
                    //Depsues se agrega el joptionpane
                    
                    System.out.println("\n----------------------------");
                    System.out.println("    Multiplicacion Rusa     ");
                    System.out.println("-----------------------------");
                    
                    Scanner l = new Scanner(System.in);
                    int multiplicador, multiplicando, result = 0;

                    System.out.print("Por favor digite el multiplicador:  ");
                    multiplicador = l.nextInt();
                    
                    while (multiplicador <= 0) {
                        System.out.println("[Error] Solo tabajamos con numeros naturales");
                        System.out.print("Por favor digite el multiplicador:  ");
                        multiplicador = l.nextInt();
                    }
                    
                    System.out.print("Por favor digite el multiplicando:  ");
                    multiplicando = l.nextInt();
                    
                    while (multiplicando <= 0) {
                        System.out.println("[Error] Solo tabajamos con numeros naturales");
                        System.out.print("Por favor digite el multiplicando:  ");
                        multiplicando = l.nextInt();
                    }

                    do {
                       if (multiplicador % 2 != 0) {
                            result = result + multiplicando;
                        }
                        
                        System.out.println("Multiplicador: " + multiplicador + " "
                                + "Multiplicando: "+multiplicando);
                        multiplicador = multiplicador / 2;
                        multiplicando = multiplicando * 2;
                    } while (multiplicador != 1);
                    
                    System.out.println("Multiplicador: " + multiplicador + " "
                                + "Multiplicando: "+multiplicando);
                    //Uno siempre es impar
                    result += multiplicando;
                    
                    System.out.println("El resultado es: " + result);
                    
                    break;
                    
            }
 
        }while (finalop != 6);
    }
    
}

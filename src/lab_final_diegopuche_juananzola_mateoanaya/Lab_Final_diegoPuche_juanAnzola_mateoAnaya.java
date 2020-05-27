
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
            if(optionFromPane == null){
                option = "";
            }else{
                option = (String)optionFromPane;
            }
            
            switch (option) {

                case "Multiplicación Rusa":
                    
                    String inputValue;
                    int multiplicador, multiplicando, result = 0;
               
                    System.out.println("\n----------------------------");
                    System.out.println("    Multiplicacion Rusa     ");
                    System.out.println("-----------------------------");
                    
                    //Preguntar por el multiplicador
                    
                    inputValue = JOptionPane.showInputDialog("Por favor, ingrese el multiplicador");

                    while (inputValue == null || inputValue.equals("") || inputValue.equals("NoNatural")) {
    
                        inputValue = JOptionPane.showInputDialog("Por favor, ingrese el multiplicador");
                        
                        if(inputValue != null){
                            
                            if(!inputValue.equals("")){
                                
                                multiplicador = Integer.parseInt(inputValue);
                                if(multiplicador <= 0){
                                    System.out.println("[Error] Solo tabajamos con numeros naturales");
                                    inputValue = "NoNatural";
                                }
                                
                            }else{
                                System.out.println("[Error] Debes ingresar algun valor");
                            }
 
                        }else{
                            System.out.println("[Error] Debes ingresar algun valor");
                        }
                    }
                    
                    multiplicador = Integer.parseInt(inputValue);

                    //Preguntar por el multiplicando
                    
                    inputValue = JOptionPane.showInputDialog("Por favor, ingrese el multiplicando");

                    while (inputValue == null || inputValue.equals("") || inputValue.equals("NoNatural")) {
    
                        inputValue = JOptionPane.showInputDialog("Por favor, ingrese el multiplicando");
                        
                        if(inputValue != null){
                            
                            if(!inputValue.equals("")){
                                
                                multiplicando = Integer.parseInt(inputValue);
                                if(multiplicador <= 0){
                                    System.out.println("[Error] Solo tabajamos con numeros naturales");
                                    inputValue = "NoNatural";
                                }
                                
                            }else{
                                System.out.println("[Error] Debes ingresar algun valor");
                            }
 
                        }else{
                            System.out.println("[Error] Debes ingresar algun valor");
                        }
                    }
                    
                    multiplicando = Integer.parseInt(inputValue);
                    
                    while(multiplicador != 1){
                        
                        if (multiplicador % 2 != 0) {
                            result = result + multiplicando;
                        }
                        
                        System.out.println("Multiplicador: " + multiplicador + " "
                                + "Multiplicando: "+multiplicando);
                        
                        multiplicador = multiplicador / 2;
                        multiplicando = multiplicando * 2;
                    }
                    
                    System.out.println("Multiplicador: " + multiplicador + " "
                                + "Multiplicando: "+multiplicando);
                    
                    //Uno siempre es impar
                    result += multiplicando;
                    
                    System.out.println("El resultado es: " + result);
                    
                    break;
                    
            }
 
        }while (!option.equals(""));
    }
    
}

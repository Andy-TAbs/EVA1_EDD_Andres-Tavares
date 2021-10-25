/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author mague
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here7
       Scanner input = new Scanner(System.in);
       int ival = input.nextInt();
       boolean esPrimo = true;
        for (int i = 0; i< ival; i++){ //MENOR --> NUNCA DEBE SER IGUAL O MAYOR
        //Division iVal/i
        //MODULO -->CALCULA EL RESIDUO DE LA DIVISION
        //EL MODULO EN JAVA ES % --> NUM1 % NUM2%
        //7 % 5 = 2
        int iMod =  ival % i;
       if (iMod ==0){//El modulo es igual a 0, no es primo, hay que terminar
           esPrimo = false;
       }
//continue; //Detiene la iteracion actual
           // break; //Detiene permanentemente el for
          
        //Si la division es exacta --> terminamos y no es primo
        //Si terminamos el for sin dividir exactamente es primo
    }
         if (esPrimo) 
            System.out.println("El numero es Primo");
        else
                System.out.println("EL numero no es Primo");
    }  
        }
       
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author mague
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PREGUNTAR EL TAMAÑO DEL GRUPO:
        Scanner input = new Scanner(System.in);
        System.out.println("Indica el tamaño del grupo: ");
        int iTama = input.nextInt();
        int[] aiEdades = new int[iTama]; //Declarar un arreglo, tamaño iTama
        for (int i = 0; i < aiEdades.length; i++) { //desde el primer elemento (CERO) al ultimo (N-1)
            System.out.println("Edad: ");
            aiEdades[i] = input.nextInt();
            
        }
        
        //ACUMULADOR
        int iAcum =0;
        for (int i = 0; i < aiEdades.length; i++) { //desde el primer elemento (CERO) al ultimo (N-1) 
            System.out.println("[" + aiEdades[i] + "]");
            iAcum =  iAcum +aiEdades[i];
    }
    double dProm = (double)iAcum/(double)iTama;  //aiEdades.length;
        System.out.println("Promedio: " + dProm);
}
}
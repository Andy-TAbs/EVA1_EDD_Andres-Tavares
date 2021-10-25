/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_arreglos;

/**
 *
 * @author mague
 */
public class EVA1_12_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int[3]; //12 bytes --> 3 enteros x 4 bytes
        System.out.println("Direccion del arreglo = " + iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
       // iArreglo[3] = 3; error ArrayIndexOutOfBound --> Nos pasamos de los limites del Arreglo
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("Cuenta " + i + " = $" + iArreglo[i]);
        }
        iArreglo = new int[2];
        System.out.println("Direccion del Arreglo modificado = " + iArreglo);
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA MODIFICADA " + i + " = $" + iArreglo[i]);
        }
        
    }
    
}

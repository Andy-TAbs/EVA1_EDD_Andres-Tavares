/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_arreglos_de_arreglos;

/**
 *
 * @author mague
 */
public class EVA1_16_ARREGLOS_DE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR UN ARREGLO DE DOS DIMENSIONES
        int[][] iMatriz = new int [3][3];
        System.out.println("Direccion de la matriz: " + iMatriz);
        System.out.println("Tamaño de la primer direccion (filas): " + iMatriz.length);
        for (int i =0; i<iMatriz.length;i++){ //FILAS
            System.out.println("iMatriz ["+i+"]=  " +iMatriz[i]);
        }
    }
    
}

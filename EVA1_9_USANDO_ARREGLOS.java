/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_usando_arreglos;

/**
 *
 * @author mague
 */
public class EVA1_9_USANDO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.- UN ARREGLO DE ENTEROS
        int[] aiDatos = new int[10];
        //2.- LLENAR CON VALORES
        //Areglos: estructura de acceso aleatorio
        //indice
        //Primer elemento del arreglo: posicion 0
        //Ultimo elemento del arreglo: N - 1 (N es el tamaño del arreglo)
   for(int i =0; i<10; i++){
       //casting--> convertimos doubles a int
       aiDatos[i] =(int)(Math.random() * 100);//Random --> valores entre 0.0 y 1.0 x 100 (valores entre 0 y 100)
       
   }
        /*        aiDatos[0] = 50;
    *      aiDatos[1] = 200;
    *     aiDatos[2] = 100;
    *    System.out.println(aiDatos[0]);
    */
        //3.- IMPRIMIR LOS VALORES
        for(int i =0; i<10; i++){
            System.out.print("[" + aiDatos[i] + "]");
      
   }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_tipos_datos_promitivos;

/**
 *
 * @author mague
 */
public class EVA1_1_TIPOS_DATOS_PROMITIVOS {

    public static void main(String[] args) {
        // TODO code application logic here
        int iVal = Integer.MAX_VALUE; //DEMOSTRACION DE TAMAÑO iNT (32 BITS - 64 BITS)
        System.out.println("Valor mas grande: " + iVal);
        iVal += 1; //overflow --> stackoverflow //DESBORDAMIENTO
         System.out.println("Valor mas grande: " + iVal);
         iVal = Integer.MIN_VALUE;
          System.out.println("Valor mas pequeño: " + iVal);
          
          for (int i =0; i<10;i++){
              String mensaje = "Hola mundo";
              System.out.println(mensaje + i);
          }
         System.out.println(mensaje + i); //Demostracion del alcance de las variables
         
    
    
}

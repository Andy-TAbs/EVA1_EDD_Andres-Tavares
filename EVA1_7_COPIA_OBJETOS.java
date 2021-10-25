/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_copia_objetos;

/**
 *
 * @author mague
 */
public class EVA1_7_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba Obj1 = new Prueba();
        System.out.println(Obj1);
        Prueba Obj2 = Obj1;
        System.out.println(Obj2);
        System.out.println("Valor de la x = " + Obj1.x);
        Obj2.x++;
        System.out.println("Valor de la x = " + Obj1.x);
    }
    
}
class Prueba{
    int x = 10;
}

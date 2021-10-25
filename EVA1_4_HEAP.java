/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_heap;

/**
 *
 * @author mague
 */
public class EVA1_4_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj = new MiClase();
        System.out.println(obj.getMensaje());
        System.out.println(obj);//IMPRIMIMOS LA REFERENCIA AL OBJETO EN EL HEAP
        MiClase obj2 = new MiClase();
        System.out.println(obj2);//IMPRIMIMOS LA REFERENCIA AL OBJETO EN EL HEAP
        EVA1_4_HEAP objHeap = new EVA1_4_HEAP();
        System.out.println(objHeap);//IMPRIMIMOS LA REFERENCIA AL OBJETO EN EL HEAP
    }
    
    }
class MiClase{//NUEVO TIPO DE DATO ---> TIPOS DE DATOS ABSTRACTOS
        private String mensaje;//ATRIBUTOS -> COMPORTAMIENTO
        public MiClase(){//METODOS -> COMPORTAMIENTO
            mensaje = "Hola Mundo";
        }
        public String getMensaje(){
            return mensaje;
        }
        public void setMensaje(String mensaje){
            this.mensaje = mensaje;
        }
}

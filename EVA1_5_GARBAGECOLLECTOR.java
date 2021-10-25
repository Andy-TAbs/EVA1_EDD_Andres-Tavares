/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_garbage.collector;

/**
 *
 * @author mague
 */
public class EVA1_5_GARBAGECOLLECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      MiClase obj = new MiClase();
        System.out.println(obj);//IMPRIMIMOS LA REFERENCIA AL OBJETO EN EL HEAP
        //ELIMINAMOS EL OBJETO
        obj = null;
        System.out.println(obj);
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

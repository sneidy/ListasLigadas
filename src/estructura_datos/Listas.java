/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

/**
 *
 * @author Esneidy
 */
public class Listas {
     public static void main(String[]args){
     Listasligadas<Integer> lista=new Listasligadas<>();
     lista.mostrarLista();
     lista.InsertaInicio(3);
     lista.InsertaInicio(6);
     lista.InsertaInicio(9);
     lista.InsertaInicio(2);
     lista.InsertarDespuesDe(3,3);
     lista.InsertarFinal(4);
    }
}

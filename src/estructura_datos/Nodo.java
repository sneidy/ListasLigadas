/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

/**
 *
 * @author Esneidy
 */
public class Nodo <T>{
     private T valor;

    private Nodo liga;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
}
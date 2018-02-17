/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4samuel_crysthel;

/**
 *
 * @author Samuel
 */
public class Nodo {
     Nodo nodo;
     Object dato;

    public Nodo() {
    }

    public Nodo(Object dato) {
        this.nodo = null;
        this.dato = dato;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "nodo=" + nodo + ", dato=" + dato + '}';
    }
    
    
    
    
    
}

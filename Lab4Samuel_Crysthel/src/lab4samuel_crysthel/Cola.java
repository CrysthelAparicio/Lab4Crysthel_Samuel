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
public class Cola {
    public Nodo inicio;
    public int size;

    public Cola() {
    }

    public Cola(Nodo inicio, int size) {
        this.inicio = inicio;
        this.size = size;
    }
    
    
    
    public Object ob(int pos){
        int cont=0;
        Nodo temp = inicio;
        while(cont<pos){
            temp= temp.getNodo();
            cont++;
        }
        return temp.getDato();
    }

    
    public void Queue(Object obj){
        if(inicio==null){
            inicio = new Nodo(obj);
        }else{
            Nodo temporal = inicio;
            Nodo nueva = new Nodo(obj);
            nueva.setDato(temporal);
            inicio=nueva;
        }
        size++;
        
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "lista{" + "inicio=" + inicio + ", size=" + size + '}';
    }
    
    
}

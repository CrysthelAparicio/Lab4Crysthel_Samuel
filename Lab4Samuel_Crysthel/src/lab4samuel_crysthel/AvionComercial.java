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
public class AvionComercial extends AeroNormal {
    private int numdepasajeros;
    private boolean funciona;

    public AvionComercial() {
        super();
    }

    public AvionComercial(int numdepasajeros, boolean funciona, String gasolina, String paisdepartida, String paisdellegada, int indicador, int distancia, int altitud) {
        super(gasolina, paisdepartida, paisdellegada, indicador, distancia, altitud);
        this.numdepasajeros = numdepasajeros;
        this.funciona = funciona;
    }


    public int getNumdepasajeros() {
        return numdepasajeros;
    }

    public void setNumdepasajeros(int numdepasajeros) {
        this.numdepasajeros = numdepasajeros;
    }

    public boolean isFunciona() {
        return funciona;
    }

    public void setFunciona(boolean funciona) {
        this.funciona = funciona;
    }

    @Override
    public String toString() {
        return "AvionComercial{" + "numdepasajeros=" + numdepasajeros + ", funciona=" + funciona + '}';
    }

    
    
    
}

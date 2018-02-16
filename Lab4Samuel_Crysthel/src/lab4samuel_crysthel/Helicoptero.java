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
public class Helicoptero extends AeroNormal {
    private int numdehelices;
    private int numdepatas;

    public Helicoptero() {
        super();
    }

    public Helicoptero(int numdehelices, int numdepatas, String gasolina, String paisdepartida, String paisdellegada, int indicador, int distancia, int altitud) {
        super(gasolina, paisdepartida, paisdellegada, indicador, distancia, altitud);
        this.numdehelices = numdehelices;
        this.numdepatas = numdepatas;
    }

    public int getNumdehelices() {
        return numdehelices;
    }

    public void setNumdehelices(int numdehelices) {
        this.numdehelices = numdehelices;
    }

    public int getNumdepatas() {
        return numdepatas;
    }

    public void setNumdepatas(int numdepatas) {
        this.numdepatas = numdepatas;
    }

    @Override
    public String toString() {
        return "Helicoptero{" + "numdehelices=" + numdehelices + ", numdepatas=" + numdepatas + '}';
    }
    
    
    
    
}

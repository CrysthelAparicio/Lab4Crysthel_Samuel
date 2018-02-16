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
public class NovaEspacial extends Espacial{
    private int numerodepropulsores;

    public NovaEspacial() {
        super();
    }

    public NovaEspacial(int numerodepropulsores, String combustible, String planetadellegada, String planetadepartida, int indicador, int distancia, int altitud) {
        super(combustible, planetadellegada, planetadepartida, indicador, distancia, altitud);
        this.numerodepropulsores = numerodepropulsores;
    }

    public int getNumerodepropulsores() {
        return numerodepropulsores;
    }

    public void setNumerodepropulsores(int numerodepropulsores) {
        this.numerodepropulsores = numerodepropulsores;
    }

    @Override
    public String toString() {
        return "NovaEspacial{" + "numerodepropulsores=" + numerodepropulsores + '}';
    }
    
    
    
}

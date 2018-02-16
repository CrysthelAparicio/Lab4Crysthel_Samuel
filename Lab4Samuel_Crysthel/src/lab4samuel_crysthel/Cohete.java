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
public class Cohete  extends Espacial{
    private int numerodeseparaciones;

    public Cohete() {
        super();
    }

    public Cohete(int numerodeseparaciones, String combustible, String planetadellegada, String planetadepartida, int indicador, int distancia, int altitud) {
        super(combustible, planetadellegada, planetadepartida, indicador, distancia, altitud);
        this.numerodeseparaciones = numerodeseparaciones;
    }

    public int getNumerodeseparaciones() {
        return numerodeseparaciones;
    }

    public void setNumerodeseparaciones(int numerodeseparaciones) {
        this.numerodeseparaciones = numerodeseparaciones;
    }

    @Override
    public String toString() {
        return "Cohete{" + "numerodeseparaciones=" + numerodeseparaciones + '}';
    }
    
    
}

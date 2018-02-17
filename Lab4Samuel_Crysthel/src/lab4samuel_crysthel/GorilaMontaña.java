/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4samuel_crysthel;

/**
 *
 * @author COPECO -13
 */
public class GorilaMontaña extends Primates {

    private int iq;

    public GorilaMontaña() {
        super();
    }

    public GorilaMontaña(int iq, String areaAsignada, int comida, String planetaAsignado, String lugarNacimiento, String nombre, String grupo, String sexo, String altura, String peso) {
        super(areaAsignada, comida, planetaAsignado, lugarNacimiento, nombre, grupo, sexo, altura, peso);
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "GorilaMonta\u00f1a{" + "iq=" + iq + '}';
    }
    @Override
     public int llenarcomida(){
        return 100;
    }

}

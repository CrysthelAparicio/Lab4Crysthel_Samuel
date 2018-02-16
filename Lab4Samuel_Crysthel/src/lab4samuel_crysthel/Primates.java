/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4samuel_crysthel;

import javax.swing.JOptionPane;

/**
 *
 * @author COPECO -13
 */
public class Primates extends SeresVivos {

    private String areaAsignada;
    private int comida;
    private String planetaAsignado;
    private String lugarNacimiento;

    public Primates() {
        super();
    }

    public Primates(String areaAsignada, int comida, String planetaAsignado, String lugarNacimiento, String nombre, String grupo, String sexo, String altura, String peso) {
        super(nombre, grupo, sexo, altura, peso);
        setAreaAsignada(areaAsignada);
        this.comida = comida;
        this.planetaAsignado = planetaAsignado;
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getAreaAsignada() {
        return areaAsignada;
    }

    public void setAreaAsignada(String areaAsignada) {
        String area = JOptionPane.showInputDialog("Que area desea entrar?+"
                + "a.Area Espacial"
                + "b.Area Normal ");
        switch(area){
            case "a":
                this.areaAsignada = areaAsignada;
                break;
            case "b":
                this.areaAsignada = areaAsignada;
                break;
        }
        
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public String getPlanetaAsignado() {
        return planetaAsignado;
    }

    public void setPlanetaAsignado(String planetaAsignado) {
        this.planetaAsignado = planetaAsignado;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String toString() {
        return "Primates{" + "areaAsignada=" + areaAsignada + ", comida=" + comida + ", planetaAsignado=" + planetaAsignado + ", lugarNacimiento=" + lugarNacimiento + '}';
    }

    @Override
    public float llenarComida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

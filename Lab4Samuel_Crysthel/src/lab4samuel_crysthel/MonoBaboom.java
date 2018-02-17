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
public class MonoBaboom extends Primates {

    private String colorPelo;

    public MonoBaboom() {
        super();
    }

    public MonoBaboom(String colorPelo, String areaAsignada, int comida, String planetaAsignado, String lugarNacimiento, String nombre, String grupo, String sexo, String altura, String peso) {
        super(areaAsignada, comida, planetaAsignado, lugarNacimiento, nombre, grupo, sexo, altura, peso);
        this.colorPelo = colorPelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    @Override
    public String toString() {
        return "MonoBaboom{" + "colorPelo=" + colorPelo + '}';
    }
    @Override
     public int llenarcomida(){
        return 100;
    }
    

}

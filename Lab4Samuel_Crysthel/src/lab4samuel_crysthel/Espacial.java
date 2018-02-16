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
public class Espacial extends MedioTransporte{
    private String combustible;
    private String planetadellegada;
    private String planetadepartida;

    public Espacial() {
        super();
    }

    public Espacial(String combustible, String planetadellegada, String planetadepartida, int indicador, int distancia, int altitud) {
        super(indicador, distancia, altitud);
        this.combustible = combustible;
        this.planetadellegada = planetadellegada;
        this.planetadepartida = planetadepartida;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getPlanetadellegada() {
        return planetadellegada;
    }

    public void setPlanetadellegada(String planetadellegada) {
        this.planetadellegada = planetadellegada;
    }

    public String getPlanetadepartida() {
        return planetadepartida;
    }

    public void setPlanetadepartida(String planetadepartida) {
        this.planetadepartida = planetadepartida;
    }

    @Override
    public String toString() {
        return "Espacial{" + "combustible=" + combustible + ", planetadellegada=" + planetadellegada + ", planetadepartida=" + planetadepartida + '}';
    }
    
    
    
    
}

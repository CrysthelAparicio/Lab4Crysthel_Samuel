/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4samuel_crysthel;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class AeroNormal extends MedioTransporte {
    private String gasolina;
    private String paisdepartida;
    private String paisdellegada;

    public AeroNormal() {
        super();
    }

    public AeroNormal(String gasolina, String paisdepartida, String paisdellegada, int indicador, int distancia, int altitud) {
        super(indicador, distancia, altitud);
        setGasolina(gasolina);
        this.paisdepartida = paisdepartida;
        this.paisdellegada = paisdellegada;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        String gaso = JOptionPane.showInputDialog("Que gaso desea?"
                + "a.Super"
                + "b.Regular"
                + "c.Diesel");
        switch (gaso) {
            case "a":
                this.gasolina = gasolina;
                break;
            case "b":
                this.gasolina = gasolina;
                break;
            case "c":
                this.gasolina = gasolina;
                break;
        }
        

    }

    public String getPaisdepartida() {
        return paisdepartida;
    }

    public void setPaisdepartida(String paisdepartida) {
        this.paisdepartida = paisdepartida;
    }

    public String getPaisdellegada() {
        return paisdellegada;
    }

    public void setPaisdellegada(String paisdellegada) {
        this.paisdellegada = paisdellegada;
    }

    @Override
    public String toString() {
        return "AeroNormal{" + "gasolina=" + gasolina + ", paisdepartida=" + paisdepartida + ", paisdellegada=" + paisdellegada + '}';
    }

    @Override
    public float llenarTanque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}

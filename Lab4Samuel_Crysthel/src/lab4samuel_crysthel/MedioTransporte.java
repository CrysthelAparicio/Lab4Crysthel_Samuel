package lab4samuel_crysthel;

import java.util.ArrayList;

public abstract class MedioTransporte {
    private int indicador;
    private int distancia;
    private int altitud;
    private ArrayList<Primates> pr = new ArrayList();

    public MedioTransporte() {
    }

    public MedioTransporte(int indicador, int distancia, int altitud) {
        this.indicador = indicador;
        this.distancia = distancia;
        this.altitud = altitud;
    }

    public int getIndicador() {
        return indicador;
    }

    public void setIndicador(int indicador) {
        this.indicador = indicador;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public ArrayList<Primates> getPr() {
        return pr;
    }

    public void setPr(ArrayList<Primates> pr) {
        this.pr = pr;
    }

    @Override
    public String toString() {
        return "MedioTransporte{" + "indicador=" + indicador + ", distancia=" + distancia + ", altitud=" + altitud + ", pr=" + pr + '}';
    }
    
   public abstract float llenarTanque();

    
}

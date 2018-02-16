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
public class SeresVivos {

    protected String nombre;
    protected String grupo;
    protected String sexo;
    protected String altura;
    protected String peso;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, String grupo, String sexo, String altura, String peso) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "nombre=" + nombre + ", grupo=" + grupo + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }

}

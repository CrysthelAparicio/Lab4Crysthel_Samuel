/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4samuel_crysthel;

import java.util.ArrayList;

/**
 *
 * @author COPECO -13
 */
public class Ingenieros extends SeresVivos {

    private String correo;
    private String nombreUsuario;
    private String idioma; //*
    private String password;
    private int cantidadCafe;
    private String fechaNacimiento;

    public Ingenieros() {
        super();
    }

    public Ingenieros(String correo, String nombreUsuario, String idioma, String password, int cantidadCafe, String fechaNacimiento, String nombre, String grupo, String sexo, String altura, String peso) {
        super(nombre, grupo, sexo, altura, peso);
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.idioma = idioma;
        this.password = password;
        this.cantidadCafe = cantidadCafe;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Ingenieros{" + "correo=" + correo + ", nombreUsuario=" + nombreUsuario + ", idioma=" + idioma + ", password=" + password + ", cantidadCafe=" + cantidadCafe + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}

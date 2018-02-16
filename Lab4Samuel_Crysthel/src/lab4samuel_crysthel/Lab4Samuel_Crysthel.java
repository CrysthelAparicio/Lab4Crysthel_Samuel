/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4samuel_crysthel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author COPECO -13
 */
public class Lab4Samuel_Crysthel {
    static ArrayList<Ingenieros> ing = new ArrayList();
    static ArrayList<SeresVivos> seres  = new ArrayList();
    static ArrayList<MedioTransporte> medio = new ArrayList();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    String op ="";
        while (!op.equalsIgnoreCase("e")) {
            op = JOptionPane.showInputDialog("Menu\n"
                    + "a) Agregar\n"
                    + "b) Modificar\n"
                    + "c) Login\n"
                    + "d) Eliminar\n"
                    + "e) Salir");
            switch (op) {
                case "a":
                    break;
                case "b":
                    break;
                case "c":
                    LogIn();
                    break;
                case "d":
                    break;
            }
        }

    }

    public static void LogIn() {
        String correo = JOptionPane.showInputDialog("Ingrese el usuario: ");
        String contrasena = JOptionPane.showInputDialog("Ingrese la contrasena: ");
        for (int i = 0; i < ing.size(); i++) {
            if((ing.get(i).getCorreo().equals(correo))&&(ing.get(i).getPassword().equals(contrasena))){
                int pos=i;
                LogInInge(pos);
                break;
                
            }
        }

    }
    public static void LogInInge(int pos){
        
        
        
    }


    
    

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void agregarSeresVivos() {
        String op = "";
        op = JOptionPane.showInputDialog("Que desea agregar? "
                + "a) Seres Vivos"
                +"b)Salir");
        switch (op) {
            case "a":
                String nombre = JOptionPane.showInputDialog("Escriba el nombre: ");
                String grupo = JOptionPane.showInputDialog("Escriba el grupo sanguineo: ");
                String sexo = JOptionPane.showInputDialog("Escriba su genero: ");
                String altura = JOptionPane.showInputDialog("Escriba su altura: ");
                String peso = JOptionPane.showInputDialog("Escriba su peso: ");
                seres.add(new SeresVivos(nombre,grupo,sexo,altura,peso));
                agregarIngenieros(nombre,grupo,sexo,altura,peso);
                agregarPrimates(nombre,grupo,sexo,altura,peso);
                break;
            case "b":
                System.exit(0);
                break;
        }
    }
    
    public static void agregarIngenieros(String nombre, String grupo, String sexo, String altura, String peso){
        String correo = JOptionPane.showInputDialog("Escriba el correo: ");
        String nombreUsuario = JOptionPane.showInputDialog("Escriba el nombre del Usuario: ");
        String idioma = JOptionPane.showInputDialog("Escriba su idioma: ");
        String password = JOptionPane.showInputDialog("Escriba su password: ");
        int cantidadCafe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cafe: "));
        String fechaNacimiento = JOptionPane.showInputDialog("Escriba su fecha Nacimiento: ");
        seres.add(new Ingenieros(correo, nombreUsuario, idioma, password, cantidadCafe, fechaNacimiento, nombre, grupo, sexo, altura, peso));
    }
    
    public static void agregarPrimates(String nombre, String grupo, String sexo, String altura, String peso){
        String areaAsignada = JOptionPane.showInputDialog("Escriba la area asginada: ");
        int comida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de comida: "));
        String planetaAsignado = JOptionPane.showInputDialog("Escriba el planeta asignado: ");
        String lugarNacimiento = JOptionPane.showInputDialog("Escriba su lugar de nacimiento: ");
        seres.add(new Primates(areaAsignada, comida, planetaAsignado, lugarNacimiento, nombre, grupo, sexo, altura, peso));
    }
    
    public static void agregagarMedioTransporte(){
        int indicador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indicador: "));
        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia: "));
        int altitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altitud: "));
        medio.add(new MedioTransporte(indicador, distancia, altitud));
        agregarAereoNormal(indicador, distancia, altitud);
    }
    
    public static void agregarAereoNormal(int indicador, int distancia, int altitud){
        String gasolina = JOptionPane.showInputDialog("Escriba la gasolina: ");
        String paisdepartida = JOptionPane.showInputDialog("Escriba el Pais de Partida: ");
        String paisdellegada = JOptionPane.showInputDialog("Escriba el Pais de llegada: ");
        medio.add(new AeroNormal( gasolina,  paisdepartida,  paisdellegada, indicador,  distancia, altitud));
        agregarHelicopeto( gasolina,  paisdepartida, paisdellegada, indicador, distancia,  altitud);
        agregarAvionComercial(gasolina,  paisdepartida, paisdellegada, indicador, distancia,  altitud);
    }
    
    public static void agregarHelicopeto(String gasolina, String paisdepartida, String paisdellegada, int indicador, int distancia, int altitud){
        int numdehelices = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de helices: "));
        int numdepatas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Patas: "));
        medio.add(new Helicoptero(numdehelices, numdepatas, gasolina, paisdepartida, paisdellegada, indicador, distancia, altitud));
        agregarAereoNormal(indicador, distancia, altitud);
    }
    
    public static void agregarAvionComercial(String gasolina, String paisdepartida, String paisdellegada, int indicador, int distancia, int altitud){
        int numdepasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Pasajeros: "));
        boolean funciona = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese la funcion: "));
        medio.add(new AvionComercial(numdepasajeros,funciona, gasolina, paisdepartida, paisdellegada, indicador, distancia, altitud));
        agregarAereoNormal(indicador, distancia, altitud);
    }
    
    public static void agregarEspacial(String gasolina, String paisdepartida, String paisdellegada, int indicador, int distancia, int altitud){
        String combustible = JOptionPane.showInputDialog("Escriba el combustible: ");
        String planetadellegada = JOptionPane.showInputDialog("Escriba el Planeta de Llegada: ");
        String planetadepartida = JOptionPane.showInputDialog("Escriba el Planeta de Partida: ");
        medio.add(new Espacial(combustible, planetadellegada,  planetadepartida, indicador, distancia, altitud));
        agregarNaveEspacial(combustible, planetadellegada, planetadepartida,  indicador,  distancia,  altitud);
        agregarCohete(combustible, planetadellegada, planetadepartida,  indicador,  distancia,  altitud);
    }
    
    public static void agregarNaveEspacial( String combustible, String planetadellegada, String planetadepartida, int indicador, int distancia, int altitud){
        int numerodepropulsores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de propulsares: "));
        medio.add(new NovaEspacial(numerodepropulsores, combustible, planetadellegada, planetadepartida, indicador, distancia, altitud));
    }
    
    public static void agregarCohete( String combustible, String planetadellegada, String planetadepartida, int indicador, int distancia, int altitud){
         int numerodeseparaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de separaciones: "));
         medio.add(new Cohete(numerodeseparaciones, combustible, planetadellegada, planetadepartida,indicador,distancia,altitud));
    }
    
    ////////////////////
    
    public static void eliminarSeresVivos(){
         int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Posicion a ser vivo de eliminar: "));
                seres.remove(p);
    }
    
    private String listarSeresVivos() {
        String out = "";
        for (int i = 0; i < seres.size(); i++)
            out += i + " - " + seres.get(i) + "\n";
        return out;
    }
    
    public static void eliminarIngenieros(){
        int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Posicion a Ingeniero a eliminar: "));
                seres.remove(p);
    }

}


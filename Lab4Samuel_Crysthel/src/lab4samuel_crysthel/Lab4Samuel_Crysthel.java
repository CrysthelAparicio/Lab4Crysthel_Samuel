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
    static Cola cola = new Cola();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    String op ="";
     String nombre="",  grupo="",  sexo="",  altura="",  peso="";
        while (!op.equalsIgnoreCase("c")) {
            op = JOptionPane.showInputDialog("Menu\n"
                    + "a) Crear Ingenieros\n"
                    + "b) LogIn\n"
                    + "c) Salir ");
            switch (op) {
                case "a":
                    agregarIngenieros();
                    break;
                case "b":
                    LogIn();
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
                ing.get(i).setCantidadCafe(0);
                break;
                
            }
        }

    }
    public static void LogInInge(int pos){
        String op = JOptionPane.showInputDialog("a)Transportes\n"
                + "b)Ingenieros\n"
                + "c)Primates\n"
                + "d)Viajes");
        switch (op) {
            case "a":
                String op2 = JOptionPane.showInputDialog("a)AGREGAR TRANSPORTE\n"
                        + "b)MODIFICAR TRANSPORTES\n"
                        + "c)ELIMINAR TRANSPORTES");
                switch (op2) {
                    case "a":
                        int indicador=0,distancia=0,altitud=0;
                        String gasolina="",paisdepartida="",paisdellegada="",combustible="", planetadellegada="", planetadepartida="";
                        agregagarMedioTransporte();
                        agregarAereoNormal( indicador,  distancia,  altitud);
                        agregarHelicopeto(gasolina, paisdepartida, paisdellegada, indicador, distancia, altitud);
                        agregarAvionComercial(gasolina, paisdepartida, paisdellegada, indicador, distancia, altitud);
                        agregarEspacial( gasolina,  paisdepartida,  paisdellegada,  indicador,  distancia,  altitud);
                        agregarNaveEspacial(combustible, planetadellegada, planetadepartida,  indicador,  distancia,  altitud);
                        agregarCohete(combustible, planetadellegada, planetadepartida,  indicador,  distancia,  altitud);
                        break;
                    case "b":
                        modificartransporte();
                        break;
                    case "c":
                        eliminarMedioTransporte();
                        break;
                }
                break;
            case "b":
                String op3 = JOptionPane.showInputDialog(
                          "a)MODIFICAR INGENIEROS\n"
                        + "b)ELIMINAR INGENIEROS\n"
                                  + "c)LLENAR CAFE");
                switch (op3) {
                    case "a":
                        modificarIngeniero();
                        break;
                    case "b":
                        eliminarIngenieros();
                        break;
                }
                break;
            case "c":
                String op4 = JOptionPane.showInputDialog("a)AGREGAR PRIMATES\n"
                        + "b)MODIFICAR PRIMATES\n"
                        + "c)ELIMINAR PRIMATES");
                switch (op4) {
                    case "a":
                        String nombre="",  grupo="",  sexo="",  altura="",  peso="";
                        agregarPrimates(nombre,  grupo,  sexo,  altura,  peso);
                        break;
                    case "b":
                        modificarprimates();
                        break;
                    case "c":
                        eliminarPrimates();
                        break;
                }

                break;
            case "d":
                String agregar = JOptionPane.showInputDialog("Ingrese que es lo que desea agregar: ");
                cola.Queue(agregar);
                break;
        }

    }

    public static void modificarIngeniero() {
        String pos1 = JOptionPane.showInputDialog("Ingrese la posicion que desea modificar: ");
        int pos = Integer.parseInt(pos1);
        String op = JOptionPane.showInputDialog("a)nombre\n"
                + "b)grupo\n"
                + "c)sexo\n"
                + "d)altura\n"
                + "e)peso\n"
                + "f)correo\n"
                + "g)nombre de usuario\n"
                + "h)idioma\n"
                + "i)contrasena\n"
                + "j)cantidad de cafe\n"
                + "k)Fecha de nacimiento"
                + "Ingrese lo que desea modificar: ");
        switch (op) {
            case "a":
                String nombre = JOptionPane.showInputDialog("Escriba el nombre: ");
                ing.get(pos).setNombre(nombre);
                break;
            case "b":
                String grupo = JOptionPane.showInputDialog("Escriba el grupo sanguineo: ");
                 ing.get(pos).setGrupo(grupo);
                break;
            case "c":
                String sexo = JOptionPane.showInputDialog("Escriba su sexp: ");
                 ing.get(pos).setSexo(sexo);
                break;
            case "d":
                String altura = JOptionPane.showInputDialog("Escriba su altura: ");
                 ing.get(pos).setAltura(altura);
                break;
            case "e":
                String peso = JOptionPane.showInputDialog("Escriba su peso: ");
                 ing.get(pos).setPeso(peso);
                break;
            case "f":
                String correo = JOptionPane.showInputDialog("Ingrese el correo: ");
                 ing.get(pos).setCorreo(correo);
                break;
            case "g":
                String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
                 ing.get(pos).setNombreUsuario(nombreUsuario);
                break;
            case "h":
                String idioma = JOptionPane.showInputDialog("Ingrese el idioma: ");
                 ing.get(pos).setIdioma(idioma);
                break;
            case "i":
                String password = JOptionPane.showInputDialog("Ingrese la contrasena: ");
                 ing.get(pos).setPassword(password);
                break;
            case "j":
                String cantidaddecafe = JOptionPane.showInputDialog("Ingrese la cantidad del cafe: ");
                int cantidadCafe = Integer.parseInt(cantidaddecafe);
                 ing.get(pos).setCantidadCafe(cantidadCafe);
                break;
            case "k":

                String fechaNacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento: ");
                 ing.get(pos).setFechaNacimiento(fechaNacimiento);
                break;

        }
        
    }
    public static void modificarprimates(){
        String pos1 = JOptionPane.showInputDialog("Ingrese la posicion que desea modificar: ");
        int pos = Integer.parseInt(pos1);
        String op = JOptionPane.showInputDialog("a)area asignada\n"
                + "b)cantidad de comida\n"
                + "c)planeta asignado\n"
                + "d)lugar de nacimiento\n"
                + "e)Mono Baboon\n"
                + "f)Gorila Montana");
        switch(op){
            case "a":
                String areaasignada = JOptionPane.showInputDialog("Ingrese el area asignada: ");
                ((Primates)seres.get(pos)).setAreaAsignada(areaasignada);
                break;
            case "b":
                String cantidaddecomida = JOptionPane.showInputDialog("Ingrese la cantidad de comida: ");
                int cantidadecomida=Integer.parseInt(cantidaddecomida);
                ((Primates)seres.get(pos)).setComida(cantidadecomida);
                
                break;
            case "c":
                String planetaasignado =JOptionPane.showInputDialog("Ingrese el planeta asignado: ");
                ((Primates)seres.get(pos)).setPlanetaAsignado(planetaasignado);
                break;
            case "d":
                String lugardenacimiento =JOptionPane.showInputDialog("Ingrese el lugar de nacimiento: ");
                ((Primates)seres.get(pos)).setLugarNacimiento(lugardenacimiento);
                break;
            case "e":
                String colordepelo = JOptionPane.showInputDialog("Ingrese el color de pelo: ");
                ((MonoBaboom) seres.get(pos)).setAreaAsignada(colordepelo);
                break;

            case "f":
                String i = JOptionPane.showInputDialog("Ingrese el IQ: ");
                int iq = Integer.parseInt(i);
                ((GorilaMontaña) seres.get(pos)).setIq(iq);
                break;
        }
        
    }
    public static void modificartransporte(){
         String pos1 = JOptionPane.showInputDialog("Ingrese la posicion que desea modificar: ");
        int pos = Integer.parseInt(pos1);
        String op = JOptionPane.showInputDialog("a)Indicador tanque lleno\n"
                + "b)altitud \n"
                + "c)Aereo Nacional\n"
                + "d)distancia \n"
                + "e)Espacial");
        switch(op){
            case "a":
                String indicadordetanque= JOptionPane.showInputDialog("Ingrese el indicador de tanque: ");
                int indicador = Integer.parseInt(indicadordetanque);
                medio.get(pos).setIndicador(indicador);
                break;
            case "b":
                String altitu= JOptionPane.showInputDialog("Ingrese la altitud: ");
                int altitud = Integer.parseInt(altitu);
                medio.get(pos).setAltitud(altitud);
                break;
            case "c":
                String op2=JOptionPane.showInputDialog("a) Gasolina\n"
                        + "b)pais de llegada\n"
                        + "c)pais de partida\n"
                        + "d)Helicoptero\n");
                switch(op2){
                    case "a":
                        String gasolina = JOptionPane.showInputDialog("Ingrese la gasolina: ");
                        ((AeroNormal)medio.get(pos)).setGasolina(gasolina);
                        break;
                    case "b":
                        String paisdellegada = JOptionPane.showInputDialog("Ingrese el pais de llegada: ");
                        ((AeroNormal)medio.get(pos)).setPaisdellegada(paisdellegada);
                        break;
                    case "c":
                        String paisdepartida = JOptionPane.showInputDialog("Ingrese el pais de partida: ");
                        ((AeroNormal)medio.get(pos)).setPaisdepartida(paisdepartida);
                        break;
                    case "d":
                        String op4 = JOptionPane.showInputDialog("a)PATAS\n"
                        + "b)numero de helices");
                        switch(op4){
                            case "a":
                                String numpat= JOptionPane.showInputDialog("Ingrese el numero de patas: ");
                                int numpatas=Integer.parseInt(numpat);
                                ((Helicoptero)medio.get(pos)).setNumdepatas(numpatas);
                                break;
                            case "b":
                                String numhel= JOptionPane.showInputDialog("Ingrese el numero de helices: ");
                                int numheli=Integer.parseInt(numhel);
                                ((Helicoptero)medio.get(pos)).setNumdehelices(numheli);
                                break;
                        }
                        break;
                }
                break;
            case "d":
                String distanci = JOptionPane.showInputDialog("Ingrese la distancia: ");
                int distancia=Integer.parseInt(distanci);
                medio.get(pos).setDistancia(distancia);
                
                break;
            case "e":
                String op5=JOptionPane.showInputDialog("a)combustible\n"
                        + "b)planeta partida\n"
                        + "c) partida llegada\n"
                        + "d)Nave Espacial\n"
                        + "e) Cohete");
                switch(op5){
                    case "a":
                        String combustible = JOptionPane.showInputDialog("Ingrese el combustible: ");
                        ((Espacial)medio.get(pos)).setCombustible(combustible);
                        break;
                    case "b":
                        String planetadellegada=JOptionPane.showInputDialog("Ingrese el planeta de llegada: ");
                        ((Espacial)medio.get(pos)).setPlanetadellegada(planetadellegada);
                        
                        break;
                    case"c":
                        String planetadepartida=JOptionPane.showInputDialog("Ingrese el planeta de partida: ");
                        ((Espacial)medio.get(pos)).setPlanetadepartida(planetadepartida);
                        
                        break;
                    case "d":
                        String numepropul=JOptionPane.showInputDialog("Ingrese el numero de propulsores: ");
                        int numpropul=Integer.parseInt(numepropul);
                        ((NovaEspacial)medio.get(pos)).setNumerodepropulsores(numpropul);
                        break;
                    case "e":
                        String cohe=JOptionPane.showInputDialog("Ingrese el numero de separaciones: ");
                        int numdesepara=Integer.parseInt(cohe);
                        ((Cohete)medio.get(pos)).setNumerodeseparaciones(numdesepara);
                        break;
                    
                }
                break;
            
        }
        
    }



    
    

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    public static void agregarseresVivos() {
        String nombre = JOptionPane.showInputDialog("Escriba el nombre: ");
        String grupo = JOptionPane.showInputDialog("Escriba el grupo sanguineo: ");
        String sexo = JOptionPane.showInputDialog("Escriba su genero: ");
        String altura = JOptionPane.showInputDialog("Escriba su altura: ");
        String peso = JOptionPane.showInputDialog("Escriba su peso: ");
        seres.add(new SeresVivos(nombre, grupo, sexo, altura, peso));
        agregarPrimates(nombre, grupo, sexo, altura, peso);

    }
    
    public static void agregarIngenieros(){
        String nombre = JOptionPane.showInputDialog("Escriba el nombre: ");
        String grupo = JOptionPane.showInputDialog("Escriba el grupo sanguineo: ");
        String sexo = JOptionPane.showInputDialog("Escriba su genero: ");
        String altura = JOptionPane.showInputDialog("Escriba su altura: ");
        String peso = JOptionPane.showInputDialog("Escriba su peso: ");
        String correo = JOptionPane.showInputDialog("Escriba el correo: ");
        String nombreUsuario = JOptionPane.showInputDialog("Escriba el nombre del Usuario: ");
        String idioma = JOptionPane.showInputDialog("Escriba su idioma: ");
        String password = JOptionPane.showInputDialog("Escriba su password: ");
        int cantidadCafe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cafe: "));
        String fechaNacimiento = JOptionPane.showInputDialog("Escriba su fecha Nacimiento: ");
        ing.add(new Ingenieros(correo, nombreUsuario, idioma, password, cantidadCafe, fechaNacimiento, nombre, grupo, sexo, altura, peso)) ;
        
    }
    
    public static void agregarPrimates(String nombre, String grupo, String sexo, String altura, String peso){
        String areaAsignada = JOptionPane.showInputDialog("Escriba la area asginada: ");
        int comida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de comida: "));
        String planetaAsignado = JOptionPane.showInputDialog("Escriba el planeta asignado: ");
        String lugarNacimiento = JOptionPane.showInputDialog("Escriba su lugar de nacimiento: ");
        seres.add(new Primates(areaAsignada, comida, planetaAsignado, lugarNacimiento, nombre, grupo, sexo, altura, peso));
        
        
        
        
        String op = JOptionPane.showInputDialog("a)Mono baboon+n"
                + "b)Gorila Montana");
        switch(op){
            case "a":
                String colordepelo=JOptionPane.showInputDialog("Ingrese el color de pelo: ");
                seres.add(new MonoBaboom(colordepelo,areaAsignada,  comida,  planetaAsignado, lugarNacimiento,  nombre, grupo, sexo, altura,  peso));
                break;
            case "b":
                String i=JOptionPane.showInputDialog("Ingrese el IQ: ");
                int iq=Integer.parseInt(i);
                seres.add(new GorilaMontaña( iq,  areaAsignada,  comida,  planetaAsignado, lugarNacimiento,  nombre, grupo, sexo, altura,  peso));
                break;
        }
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
                        JOptionPane.showInputDialog("Ingrese la posicion de los seres vivos que desea eliminar\n" + listarSeresVivos()));
                seres.remove(p);
    }
    
    private static String listarSeresVivos() {
        String out = "";
        for (int i = 0; i < seres.size(); i++)
            out += i + " - " + seres.get(i) + "\n";
        return out;
    }
    
    public static void eliminarIngenieros() {
        int p = Integer.parseInt(

                        JOptionPane.showInputDialog("Ingrese la posicion del ingeniero que desea eliminar\n" + listarIngenieros()));
                ing.remove(p);
    }
    
    private static String listarIngenieros() {
        String out = "";
        for (int i = 0; i < ing.size(); i++)
            out += i + " - " + ing.get(i) + "\n";
        return out;
    }
    
       public static void eliminarPrimates(){
        int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la posicion de primates que desea eliminar\n" + listarPrimates()));
                seres.remove(p);

    }
    
    private static String listarPrimates() {
        String out = "";
        for (int i = 0; i < seres.size(); i++)
            out += i + " - " + seres.get(i) + "\n";
        return out;
    }
    
     public static void eliminarMedioTransporte(){
        int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la posicion del medio que desea eliminar\n" + listarMedioTransporte()));
                medio.remove(p);
    }
    
    private static String listarMedioTransporte() {
        String out = "";
        for (int i = 0; i < medio.size(); i++)
            out += i + " - " + medio.get(i) + "\n";
        return out;
    }
    
    public static void eliminarAereoNormal(){
        int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la posicion del aereo que desea eliminar\n" + listarAereoNormal()));
                medio.remove(p);
    }
    
    private static String listarAereoNormal() {
        String out = "";
        for (int i = 0; i < medio.size(); i++)
            out += i + " - " + medio.get(i) + "\n";
        return out;
    }
    
    public static void eliminarHelicoptero(){
        int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la posicion del helicoptero que desea eliminar\n" + listarHelicoptero()));
                medio.remove(p);
    }
    
    private static String listarHelicoptero() {
        String out = "";
        for (int i = 0; i < medio.size(); i++)
            out += i + " - " + medio.get(i) + "\n";
        return out;
    }
    
    public static void eliminarAvionComercial(){
        int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la posicion del avion comercial que desea eliminar\n" + listarAvionComercial()));
                medio.remove(p);
    }
    
    private static String listarAvionComercial() {
        String out = "";
        for (int i = 0; i < medio.size(); i++)
            out += i + " - " + medio.get(i) + "\n";
        return out;
    }
    
    public static void eliminarEspacial(){
        int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la posicion de la espacial que desea eliminar\n" + listarEspacial()));
                medio.remove(p);
    }
    
    private static String listarEspacial() {
        String out = "";
        for (int i = 0; i < medio.size(); i++)
            out += i + " - " + medio.get(i) + "\n";
        return out;
    }
    
    public static void eliminarNaveEspacial(){
        int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la posicion de la nave que desea eliminar\n" + listarNaveEspacial()));
                medio.remove(p);
    }
    
    private static String listarNaveEspacial() {
        String out = "";
        for (int i = 0; i < medio.size(); i++)
            out += i + " - " + medio.get(i) + "\n";
        return out;
    }
    
    public static void eliminarCohete(){
        int p;
        p = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la posicion del Cohete que desea eliminar\n" + listarCohete()));
                medio.remove(p);
    }
    
    private static String listarCohete() {
        String out = "";
        for (int i = 0; i < medio.size(); i++)
            out += i + " - " + medio.get(i) + "\n";
        return out;
    }
    
    public static void eliminarMono(){
        int p;
        p = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la posicion del mono que desea eliminar\n" + listarMono()));
                medio.remove(p);
    }
    
    private static String listarMono() {
        String out = "";
        for (int i = 0; i < seres.size(); i++)
            out += i + " - " + seres.get(i) + "\n";
        return out;
    }
    
       public static void eliminarGorila(){
        int p;
        p = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la posicion del gorila que desea eliminar\n" + listarGorila()));
                medio.remove(p);
    }
    
    private static String listarGorila() {
        String out = "";
        for (int i = 0; i < seres.size(); i++)
            out += i + " - " + seres.get(i) + "\n";
        return out;
    }
    
}


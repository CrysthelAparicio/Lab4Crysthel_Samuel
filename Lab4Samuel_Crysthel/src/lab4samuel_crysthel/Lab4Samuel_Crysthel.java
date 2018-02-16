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
public class Lab4Samuel_Crysthel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public Lab4Samuel_Crysthel(){
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("MENU:\n"
                    + "1) Agregar\n"
                    + "2) Modificar\n"
                    + "3) Eliminar\n"
                    + "4) Permiso lanzar viaje\n"
                    + "s) Salir");
            switch (opcion) {
                case "1":
                {
                    String tipoGuerrero = JOptionPane.showInputDialog("Que tipo de guerrero desea crear?\n"
                            + "(mago, elfo, dragon, arquero, bruja): ");
                    switch (tipoGuerrero) {
                        case "mago":
                            baseGuerreros.add(new Mago());
                            break;
                        case "elfo":
                            baseGuerreros.add(new Elfo());
                            break;
                        case "dragon":
                            baseGuerreros.add(new Dragon());
                            break;
                        case "arquero":
                            baseGuerreros.add(new Arquero());
                            break;
                        case "bruja":
                            baseGuerreros.add(new Bruja());
                            break;
                        case "s":
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida! cancelando...");
                            break;
                    }
                }
                    break;
    }
    
}

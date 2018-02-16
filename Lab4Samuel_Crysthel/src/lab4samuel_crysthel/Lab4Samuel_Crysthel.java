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

}
    
    
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void agregar() {
        String op = "";
        String op2 = "";
        String op3 ="";
        op = JOptionPane.showInputDialog("Que desea agregar? "
                + "a) Seres Vivos"
                + "b) Medios de Transporte");
        switch (op) {
            case "a":
                op = JOptionPane.showInputDialog("Que desea agregar? "
                        + "a) Ingenieros"
                        + "b) Primates");

                switch (op2) {
                    case "a":
                        String nombre = JOptionPane.showInputDialog("Escriba el nombre: ");
                        String grupo = JOptionPane.showInputDialog("Escriba el grupo sanguineo: ");
                        String sexo = JOptionPane.showInputDialog("Escriba su genero: ");
                        String altura = JOptionPane.showInputDialog("Escriba su altura: ");
                        String peso = JOptionPane.showInputDialog("Escriba su peso: ");
                        break;
                    case "b":
                        int indicar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indicador: "));
                        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia: "));
                        int altitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indicador: "));
                        //falta primates
                        break;
                }
                break;

            case "b":
                op = JOptionPane.showInputDialog("Que desea agregar? "
                        + "a) Aereo Normal"
                        + "b) Aereo Espacial");
                switch(op3){
                    case "a":
                        
                }
                break;
        }
    }

}


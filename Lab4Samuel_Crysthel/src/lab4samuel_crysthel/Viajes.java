/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4samuel_crysthel;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class Viajes {
    private ArrayList<MedioTransporte> trans = new ArrayList();

    public Viajes() {
    }

    public ArrayList<MedioTransporte> getTrans() {
        return trans;
    }

    public void setTrans(ArrayList<MedioTransporte> trans) {
        this.trans = trans;
    }

    @Override
    public String toString() {
        return "Viajes{" + "trans=" + trans + '}';
    }
    
    
    
}

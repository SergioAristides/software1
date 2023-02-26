/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author sergi
 */
public class Reina extends Personaje {
    
    public Reina(String TipoPeleaFisica, String codigo, int limitArmas, String nombre, int nivelPoder){
        super(TipoPeleaFisica,codigo,limitArmas,nombre, nivelPoder);
    
        
        
    }
        
    
    @Override
    public void pelear(){
        JOptionPane.showMessageDialog(null, "la"+this.nombre+"esta peleando - "+this.TipoPeleaFisica);
        System.out.println("la Reina con el nombre "+this.nombre+" esta peleando - "+this.TipoPeleaFisica);
    }
    
    @Override
    public void usarArma(){
        JOptionPane.showMessageDialog(null,"la "+this.nombre+" esta usando la arma"+this.listArmas.get(0));
        System.out.println("la Reina "+this.nombre+" esta usando la arma "+this.listArmas.get(0));
    }
    
}

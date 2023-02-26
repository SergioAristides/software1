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
public class Rey extends Personaje {
    
    
      public Rey(String TipoPeleaFisica, String codigo, int limitArmas, String nombre, int nivelPoder){
        super(TipoPeleaFisica,codigo,limitArmas,nombre, nivelPoder);
    
        
        
    }
        
    
    @Override
    public void pelear(){
        JOptionPane.showMessageDialog(null, "el Rey "+this.nombre+" esta peleando - "+this.TipoPeleaFisica);
        System.out.println("el Rey con el nombre "+this.nombre+" esta peleando - "+this.TipoPeleaFisica);
    }
    
    @Override
    public void usarArma(){
        JOptionPane.showMessageDialog(null, "el Rey con el nombre "+this.nombre+" esta usando la arma"+this.listArmas.get(0));
        System.out.println("el Rey "+this.nombre+"esta usando la arma"+this.listArmas.get(0));
    }
    
    
}

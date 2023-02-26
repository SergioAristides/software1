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
public class Caballero extends Personaje {
    
    public Caballero(String TipoPeleaFisica, String codigo, int limitArmas, String nombre, int nivelPoder){
        super(TipoPeleaFisica,codigo,limitArmas,nombre, nivelPoder);
    
        
        
    }
        
    
    @Override
    public void pelear(){
        System.out.println();
        JOptionPane.showMessageDialog(null,"el Caballero "+this.nombre+" esta peleando - "+this.TipoPeleaFisica);
    }
    
    @Override
    public void usarArma(){
        JOptionPane.showMessageDialog(null, "el Caballero "+this.nombre+" esta usando la arma "+this.listArmas.get(0));
    }
    
    
}

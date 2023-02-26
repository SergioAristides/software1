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
public class Trol extends Personaje {
    
    private String tipoMagia;
    private int danoMagia;
    public Trol(String TipoPeleaFisica, String codigo, int limitArmas, String nombre, int nivelPoder,String tipoMagia,int danoMagia){
        super(TipoPeleaFisica,codigo,limitArmas,nombre, nivelPoder);
        this.tipoMagia=tipoMagia;
        this.danoMagia=danoMagia;
        
        
    }
        
    
    @Override
    public void pelear(){
        JOptionPane.showMessageDialog(null,"el"+this.nombre+"esta peleando con "+this.TipoPeleaFisica);
        System.out.println("el Troll con el nombre "+this.nombre+" esta peleando con "+this.TipoPeleaFisica);
    }
    
    @Override
    public void usarArma(){
        JOptionPane.showMessageDialog(null, "el Troll con el nombre "+this.nombre+" esta usando la arma"+this.listArmas.get(0)+" y la magia "+this.tipoMagia);
        System.out.println("el Troll "+this.nombre+"esta usando la arma"+this.listArmas.get(0)+"y la magia"+this.tipoMagia);
    }

    @Override
    public String toString() {
        return         "Personaje{" + "TipoPeleaFisica=" + TipoPeleaFisica + ", codigo=" + codigo + ", limitArmas=" + limitArmas + ", nombre=" + nombre + ", nivelPoder=" + nivelPoder + ", salud=" + salud + ", listArmas=" + listArmas +"tipoMagia=" + tipoMagia + ", danoMagia=" + danoMagia+"}";

    }
}

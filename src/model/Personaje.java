/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;

/**
 *
 * @author sergi
 */
public abstract class Personaje {
    
    protected String TipoPeleaFisica;
    protected String codigo;
    protected int limitArmas;
    protected String nombre;
    protected int nivelPoder;
    protected int salud;
    protected LinkedList<Arma>listArmas;
    
    public abstract void pelear();
    public abstract void usarArma();

    public Personaje(String TipoPeleaFisica, String codigo, int limitArmas, String nombre, int nivelPoder) {
        this.TipoPeleaFisica = TipoPeleaFisica;
        this.codigo = codigo;
        this.limitArmas = limitArmas;
        this.nombre = nombre;
        this.nivelPoder = nivelPoder;
        this.salud = salud;
        this.listArmas= new LinkedList<>();
    }

    public Personaje() {
    }

    public String getTipoPeleaFisica() {
        return TipoPeleaFisica;
    }

    public void setTipoPeleaFisica(String TipoPeleaFisica) {
        this.TipoPeleaFisica = TipoPeleaFisica;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getLimitArmas() {
        return limitArmas;
    }

    public void setLimitArmas(int limitArmas) {
        this.limitArmas = limitArmas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public LinkedList<Arma> getListArmas() {
        return listArmas;
    }

    public void setListArmas(LinkedList<Arma> listArmas) {
        this.listArmas = listArmas;
    }

    @Override
    public String toString() {
        return "Personaje{" + "TipoPeleaFisica=" + TipoPeleaFisica + ", codigo=" + codigo + ", limitArmas=" + limitArmas + ", nombre=" + nombre + ", nivelPoder=" + nivelPoder + ", salud=" + salud + ", listArmas=" + listArmas + '}';
    }
    
    
    
}

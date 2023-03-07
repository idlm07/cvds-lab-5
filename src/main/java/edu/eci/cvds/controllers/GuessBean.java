package edu.eci.cvds.controllers;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "guessBean")
@ApplicationScoped
public class GuessBean {

    private int numero = (int) (Math.random() * 10) + 1;
    private int numeroEscogido = 0;
    private int intentos = 0;
    private String estado = "Sin ganar.";
    private int premio = 100;

    public int getNumero() {
        return numero;
    }
    public int getIntentos() {
        return intentos;
    }
    public int getNumeroEscogido() {
        return numeroEscogido;
    }
    public void setNumeroEscogido(int numeroEscogido) {
        this.numeroEscogido = numeroEscogido;
    }
    public String getEstado() {
        return estado;
    }
    public int getPremio() {
        return premio;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setPremio(int premio) {
        this.premio = premio;
    }

    public void guess(){
        this.intentos++;
        if(this.numero==numeroEscogido){
            this.estado = "Ganó";    
        }else {
            this.premio = this.premio+10;
        }
    }


    public void reset(){
        this.numero = (int) (Math.random() * 10) + 1;
        this.intentos = 0;
        this.estado = "Sin Adivinar";
        this.premio = 0;
    }

    


}

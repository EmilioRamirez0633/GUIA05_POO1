/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author leyes
 */
public class PartidoAux {
     private String Equipos;
    private int Codigos;

    public PartidoAux( int Codigos,String Equipos) {
        this.Equipos = Equipos;
        this.Codigos = Codigos;
    }

    @Override
    public String toString() {
        return this.Equipos;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }

    public int getCodigos() {
        return Codigos;
    }

    public void setCodigos(int Codigos) {
        this.Codigos = Codigos;
    }

}

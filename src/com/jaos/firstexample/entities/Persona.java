/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaos.firstexample.entities;

/**
 *
 * @author oscar
 */
public class Persona {
    //Atributos
    private String nombre;
    private String sexo; //H o M
    private byte   edad;

    //Métodos
    public String obtenerNombre() {
        return this.nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) throws Exception {
        if(edad >= 18) {
            this.edad = edad;
        } else {
            throw new Exception("La edad debe ser mayor o igual a 18");
        }
    }
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.jloadpadronmav.ui;

/**
 *
 * @author fvargas
 */
public abstract class PersonaBE {

    private long numCedula;

    /**
     * Get the value of numCedula
     *
     * @return the value of numCedula
     */
    public long getNumCedula() {
        return numCedula;
    }

    /**
     * Set the value of numCedula
     *
     * @param numCedula new value of numCedula
     */
    public void setNumCedula(long numCedula) {
        this.numCedula = numCedula;
    }

    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String primApellido;

    public String getPrimApellido() {
        return primApellido;
    }

    public void setPrimApellido(String primApellido) {
        this.primApellido = primApellido;
    }

    private String segApellido;

    /**
     * Get the value of segApellido
     *
     * @return the value of segApellido
     */
    public String getSegApellido() {
        return segApellido;
    }

    /**
     * Set the value of segApellido
     *
     * @param segApellido new value of segApellido
     */
    public void setSegApellido(String segApellido) {
        this.segApellido = segApellido;
    }

    private int sexo;

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    public PersonaBE()
    {
   
    }

    public PersonaBE(long numCedula, String nombre, String primApellido, String segApellido, int sexo) {
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.primApellido = primApellido;
        this.segApellido = segApellido;
        this.sexo = sexo;
    }


    
    

}

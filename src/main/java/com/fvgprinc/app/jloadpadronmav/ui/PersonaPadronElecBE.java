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
public class PersonaPadronElecBE extends PersonaBE {

    private int codElectoral;

    public int getCodElectoral() {
        return codElectoral;
    }

    public void setCodElectoral(int codElectoral) {
        this.codElectoral = codElectoral;
    }

    private int fecCaduca;

    public int getFecCaduca() {
        return fecCaduca;
    }

    public void setFecCaduca(int fecCaduca) {
        this.fecCaduca = fecCaduca;
    }

    private int junta;

    public int getJunta() {
        return junta;
    }

    public void setJunta(int junta) {
        this.junta = junta;
    }
    
    private int posicion;

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
    public PersonaPadronElecBE() {

    }

    public PersonaPadronElecBE(long numCedula, String nombre, String primApellido, String segApellido, 
                               int sexo, int codElectoral, int fecCaduca, int junta, int posicion) {
        super(numCedula, nombre, primApellido, segApellido, sexo);
        this.codElectoral = codElectoral;
        this.fecCaduca = fecCaduca;
        this.junta = junta;
        this.posicion = posicion;
    }
    
    
    

}

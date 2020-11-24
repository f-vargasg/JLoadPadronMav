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
public class PersonaNacimientoBE extends PersonaBE {
    
    private int numFolio;

    /**
     * Get the value of numFolio
     *
     * @return the value of numFolio
     */
    public int getNumFolio() {
        return numFolio;
    }

    /**
     * Set the value of numFolio
     *
     * @param numFolio new value of numFolio
     */
    public void setNumFolio(int numFolio) {
        this.numFolio = numFolio;
    }
    
        private long numCedPadre;

    /**
     * Get the value of numCedPadre
     *
     * @return the value of numCedPadre
     */
    public long getNumCedPadre() {
        return numCedPadre;
    }

    /**
     * Set the value of numCedPadre
     *
     * @param numCedPadre new value of numCedPadre
     */
    public void setNumCedPadre(long numCedPadre) {
        this.numCedPadre = numCedPadre;
    }

        private long numCedMadre;

    /**
     * Get the value of numCedMadre
     *
     * @return the value of numCedMadre
     */
    public long getNumCedMadre() {
        return numCedMadre;
    }

    /**
     * Set the value of numCedMadre
     *
     * @param numCedMadre new value of numCedMadre
     */
    public void setNumCedMadre(long numCedMadre) {
        this.numCedMadre = numCedMadre;
    }

    
    private int codHospital;

    public int getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(int codHospital) {
        this.codHospital = codHospital;
    }
    
    
    private int horaSuceso;

    public int getHoraSuceso() {
        return horaSuceso;
    }

    public void setHoraSuceso(int horaSuceso) {
        this.horaSuceso = horaSuceso;
    }
    
            private int fecSuceso;

    public int getFecSuceso() {
        return fecSuceso;
    }

    public void setFecSuceso(int fecSuceso) {
        this.fecSuceso = fecSuceso;
    }
            
            
    private int nacInscrito;

    public int getNacInscrito() {
        return nacInscrito;
    }

    public void setNacInscrito(int nacInscrito) {
        this.nacInscrito = nacInscrito;
    }
    
            private int indDefunc;

    public int getIndDefunc() {
        return indDefunc;
    }

    public void setIndDefunc(int indDefunc) {
        this.indDefunc = indDefunc;
    }
            
    private int paisProcPadre;

    public int getPaisProcPadre() {
        return paisProcPadre;
    }

    public void setPaisProcPadre(int paisProcPadre) {
        this.paisProcPadre = paisProcPadre;
    }
    
    private int paisProcMadre;

    public int getPaisProcMadre() {
        return paisProcMadre;
    }

    public void setPaisProcMadre(int paisProcMadre) {
        this.paisProcMadre = paisProcMadre;
    }
    
    private int campoRelleno;

    public int getCampoRelleno() {
        return campoRelleno;
    }

    public void setCampoRelleno(int campoRelleno) {
        this.campoRelleno = campoRelleno;
    }
    
    private int provCantMadre;

    public int getProvCantMadre() {
        return provCantMadre;
    }

    public void setProvCantMadre(int provCantMadre) {
        this.provCantMadre = provCantMadre;
    }
    
    private int fechaNaturaliz;

    public int getFechaNaturaliz() {
        return fechaNaturaliz;
    }

    public void setFechaNaturaliz(int fechaNaturaliz) {
        this.fechaNaturaliz = fechaNaturaliz;
    }
    
    private String  codCampoRelleno1;

    public String getCodCampoRelleno1() {
        return codCampoRelleno1;
    }

    public void setCodCampoRelleno1(String codCampoRelleno1) {
        this.codCampoRelleno1 = codCampoRelleno1;
    }
    
    private String nomPadre;

    public String getNomPadre() {
        return nomPadre;
    }

    public void setNomPadre(String nomPadre) {
        this.nomPadre = nomPadre;
    }
    
    private String nomMadre;

    public String getNomMadre() {
        return nomMadre;
    }

    public void setNomMadre(String nomMadre) {
        this.nomMadre = nomMadre;
    }
    
    private String lugNacim;

    public String getLugNacim() {
        return lugNacim;
    }

    public void setLugNacim(String lugNacim) {
        this.lugNacim = lugNacim;
    }

    public PersonaNacimientoBE(String nombre, String primApellido, String segApellido, 
                               int sexo, int numFolio, long numCedPadre, long numCedMadre, 
                               int codHospital, int horaSuceso, int fecSuceso, int nacInscrito, 
                               int indDefunc, int paisProcPadre, int paisProcMadre, 
                               int campoRelleno, int provCantMadre, int fechaNaturaliz, 
                               String codCampoRelleno1, String nomPadre, String nomMadre, 
                               String lugNacim, long numCedula) {
        super(numCedula, nombre, primApellido, segApellido, sexo);
        this.numFolio = numFolio;
        this.numCedPadre = numCedPadre;
        this.numCedMadre = numCedMadre;
        this.codHospital = codHospital;
        this.horaSuceso = horaSuceso;
        this.fecSuceso = fecSuceso;
        this.nacInscrito = nacInscrito;
        this.indDefunc = indDefunc;
        this.paisProcPadre = paisProcPadre;
        this.paisProcMadre = paisProcMadre;
        this.campoRelleno = campoRelleno;
        this.provCantMadre = provCantMadre;
        this.fechaNaturaliz = fechaNaturaliz;
        this.codCampoRelleno1 = codCampoRelleno1;
        this.nomPadre = nomPadre;
        this.nomMadre = nomMadre;
        this.lugNacim = lugNacim;
    }
    
}

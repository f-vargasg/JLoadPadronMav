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
public class PersonaDefuncBE extends PersonaBE {

    private String citaDefunc;

    /**
     * Get the value of citaDefunc
     *
     * @return the value of citaDefunc
     */
    public String getCitaDefunc() {
        return citaDefunc;
    }

    /**
     * Set the value of citaDefunc
     *
     * @param citaDefunc new value of citaDefunc
     */
    public void setCitaDefunc(String citaDefunc) {
        this.citaDefunc = citaDefunc;
    }

    private String citaNacim;

    /**
     * Get the value of citaNacim
     *
     * @return the value of citaNacim
     */
    public String getCitaNacim() {
        return citaNacim;
    }

    /**
     * Set the value of citaNacim
     *
     * @param citaNacim new value of citaNacim
     */
    public void setCitaNacim(String citaNacim) {
        this.citaNacim = citaNacim;
    }

    private String nomConociComo;

    /**
     * Get the value of nomConociComo
     *
     * @return the value of nomConociComo
     */
    public String getNomConociComo() {
        return nomConociComo;
    }

    /**
     * Set the value of nomConociComo
     *
     * @param nomConociComo new value of nomConociComo
     */
    public void setNomConociComo(String nomConociComo) {
        this.nomConociComo = nomConociComo;
    }

    private String primApeConociComo;

    /**
     * Get the value of primApeConociComo
     *
     * @return the value of primApeConociComo
     */
    public String getPrimApeConociComo() {
        return primApeConociComo;
    }

    /**
     * Set the value of primApeConociComo
     *
     * @param primApeConociComo new value of primApeConociComo
     */
    public void setPrimApeConociComo(String primApeConociComo) {
        this.primApeConociComo = primApeConociComo;
    }

    private String segApeConociComo;

    /**
     * Get the value of segApeConociComo
     *
     * @return the value of segApeConociComo
     */
    public String getSegApeConociComo() {
        return segApeConociComo;
    }

    /**
     * Set the value of segApeConociComo
     *
     * @param segApeConociComo new value of segApeConociComo
     */
    public void setSegApeConociComo(String segApeConociComo) {
        this.segApeConociComo = segApeConociComo;
    }

    private String sitioDefunc;

    /**
     * Get the value of sitioDefunc
     *
     * @return the value of sitioDefunc
     */
    public String getSitioDefunc() {
        return sitioDefunc;
    }

    /**
     * Set the value of sitioDefunc
     *
     * @param sitioDefunc new value of sitioDefunc
     */
    public void setSitioDefunc(String sitioDefunc) {
        this.sitioDefunc = sitioDefunc;
    }

    private int fecDefunc;

    /**
     * Get the value of fecDefunc
     *
     * @return the value of fecDefunc
     */
    public int getFecDefunc() {
        return fecDefunc;
    }

    /**
     * Set the value of fecDefunc
     *
     * @param fecDefunc new value of fecDefunc
     */
    public void setFecDefunc(int fecDefunc) {
        this.fecDefunc = fecDefunc;
    }

    private String horDefunc;

    /**
     * Get the value of horDefunc
     *
     * @return the value of horDefunc
     */
    public String getHorDefunc() {
        return horDefunc;
    }

    /**
     * Set the value of horDefunc
     *
     * @param horDefunc new value of horDefunc
     */
    public void setHorDefunc(String horDefunc) {
        this.horDefunc = horDefunc;
    }

    private int indExtranjero;

    /**
     * Get the value of indExtranjero
     *
     * @return the value of indExtranjero
     */
    public int getIndExtranjero() {
        return indExtranjero;
    }

    /**
     * Set the value of indExtranjero
     *
     * @param indExtranjero new value of indExtranjero
     */
    public void setIndExtranjero(int indExtranjero) {
        this.indExtranjero = indExtranjero;
    }

    private int indNac;

    /**
     * Get the value of indNac
     *
     * @return the value of indNac
     */
    public int getIndNac() {
        return indNac;
    }

    /**
     * Set the value of indNac
     *
     * @param indNac new value of indNac
     */
    public void setIndNac(int indNac) {
        this.indNac = indNac;
    }

    public PersonaDefuncBE(long numCedula, String nombre, String primApellido,
            String segApellido, int sexo, String citaDefunc,
            String citaNacim, String nomConociComo, String primApeConociComo,
            String segApeConociComo, String sitioDefunc, int fecDefunc,
            String horDefunc, int indExtranjero, int indNac) {
        super(numCedula, nombre, primApellido, segApellido, sexo);
        this.citaDefunc = citaDefunc;
        this.citaNacim = citaNacim;
        this.nomConociComo = nomConociComo;
        this.primApeConociComo = primApeConociComo;
        this.segApeConociComo = segApeConociComo;
        this.sitioDefunc = sitioDefunc;
        this.fecDefunc = fecDefunc;
        this.horDefunc = horDefunc;
        this.indExtranjero = indExtranjero;
        this.indNac = indNac;
    }

}




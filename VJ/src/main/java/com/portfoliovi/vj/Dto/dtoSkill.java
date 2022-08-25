/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliovi.vj.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author lopoj
 */
public class dtoSkill {
    @NotBlank
    private String nombreE;
    @NotBlank
    private int descripcionE;

    public dtoSkill() {
    }

    public dtoSkill(String nombreE, int descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(int descripcionE) {
        this.descripcionE = descripcionE;
    }

    
}

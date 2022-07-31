/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victoriaportfolio.vg.Dto;

// @author victoria

import javax.validation.constraints.NotBlank;

 
public class DtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String descripcion;

    public DtoExperiencia() {
    }

    public DtoExperiencia(String nombreExp, String descripcion) {
        this.nombreExp = nombreExp;
        this.descripcion = descripcion;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}

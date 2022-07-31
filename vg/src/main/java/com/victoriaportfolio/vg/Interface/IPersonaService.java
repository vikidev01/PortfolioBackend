/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.victoriaportfolio.vg.Interface;

//@author victoria

import com.victoriaportfolio.vg.Entity.Persona;
import java.util.List;

 
public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersonas();
    
    //Guardar un obj de tipo persona
    public void savePersona(Persona Persona);
    
    //Eliminar un obj, buscado por ID
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
}

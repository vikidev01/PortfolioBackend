/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victoriaportfolio.vg.Service;

import com.victoriaportfolio.vg.Entity.Educacion;
import com.victoriaportfolio.vg.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@author victoria
 
 
@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    public Optional<Educacion> getByNombreEdu(String nombreEdu){
        return rEducacion.findByNombreEdu(nombreEdu);
    }
    public void save(Educacion edu){
        rEducacion.save(edu);
    }
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    public boolean existsByNombreEdu(String edu){
        return rEducacion.existsByNombreEdu(edu);
    }
}

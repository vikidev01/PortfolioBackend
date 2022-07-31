/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victoriaportfolio.vg.Security.Service;

//@author victoria

import com.victoriaportfolio.vg.Security.Entity.Rol;
import com.victoriaportfolio.vg.Security.Enums.RolNombre;
import com.victoriaportfolio.vg.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepository.findByRolNombre(rolNombre);
    }
    public void save (Rol rol){
        iRolRepository.save(rol);
    }
}

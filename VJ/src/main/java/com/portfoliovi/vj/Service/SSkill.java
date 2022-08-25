/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliovi.vj.Service;

import com.portfoliovi.vj.Repository.RSkill;
import com.portfoliovi.vj.entity.SSokill;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lopoj
 */ 
@Service
@Transactional
public class SSkill {
   @Autowired
   RSkill rSkills;
   
    public List<SSokill> list(){
        return rSkills.findAll();        
    }
    
    public Optional<SSokill> getOne(int id){
        return rSkills.findById(id);
    }
    
    public Optional<SSokill> getByNombreS(String nombreS){
        return rSkills.findByNombreS(nombreS);
    }
    
    public void save(SSokill skill){
        rSkills.save(skill);
    }
    
    public void delete(int id){
        rSkills.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rSkills.existsById(id);
    }    
    
    public boolean existsByNombreS(String nombreS){
        return rSkills.existsByNombreS(nombreS);
    }
}

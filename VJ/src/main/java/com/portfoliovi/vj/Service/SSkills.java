/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliovi.vj.Service;

import com.portfoliovi.vj.entity.Skills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfoliovi.vj.Repository.RSkills;

/**
 *
 * @author lopoj
 */
@Service
@Transactional
public class SSkills {
    @Autowired 
    RSkills rSkill;
    
    public List<Skills> list(){
        return rSkill.findAll();
    }
    public Optional<Skills>getOne(int id){
        return rSkill.findById(id);
    }
    
    public Optional<Skills>getByNombreE(String nombreE){
        return rSkill.findByNombreE(nombreE);
    }
    public void save(Skills skill){
        rSkill.save(skill);
    }
    public void delete(int id){
        rSkill.deleteById(id);
    }
    public boolean existsById(int id){
        return rSkill.existsById(id);
    }
    public boolean existsByNombreE(String nombreE){
        return rSkill.existsByNombreE(nombreE);
    }
}

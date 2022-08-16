/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliovi.vj.Service;

import com.portfoliovi.vj.Repository.RAbout;
import com.portfoliovi.vj.entity.About;
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
public class SAbout {
    @Autowired 
    RAbout rAbout;
    
    public List<About> list(){
        return rAbout.findAll();
    }
    public Optional<About>getOne(int id){
        return rAbout.findById(id);
    }
    
    public Optional<About>getByNombreE(String nombreE){
        return rAbout.findByNombreE(nombreE);
    }
    public void save(About about){
        rAbout.save(about);
    }
    public void delete(int id){
        rAbout.deleteById(id);
    }
    public boolean existsById(int id){
        return rAbout.existsById(id);
    }
    public boolean existsByNombreE(String nombreE){
        return rAbout.existsByNombreE(nombreE);
    }
}

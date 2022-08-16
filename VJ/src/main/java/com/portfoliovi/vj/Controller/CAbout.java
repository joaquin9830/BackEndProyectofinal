/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliovi.vj.Controller;

import com.portfoliovi.vj.Dto.dtoAbout;
import com.portfoliovi.vj.Security.Controller.Mensaje;
import com.portfoliovi.vj.Service.SAbout;
import com.portfoliovi.vj.entity.About;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lopoj
 */
@RestController
@RequestMapping("/about")
@CrossOrigin(origins = "http://localhost:4200")
public class CAbout {
    @Autowired
    SAbout sAbout;
    
    @GetMapping("/lista")
    public ResponseEntity<List<About>>list(){
        List<About> list = sAbout.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
     @GetMapping("/detail/{id}")
    public ResponseEntity<About> getById(@PathVariable("id")int id){
        if(!sAbout.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
       About about = sAbout.getOne(id).get();
        return new ResponseEntity(about, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sAbout.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sAbout.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoAbout dtoabout){
        if(StringUtils.isBlank(dtoabout.getNombreE())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(sAbout.existsByNombreE(dtoabout.getNombreE())){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        About about = new About(
                dtoabout.getNombreE(), dtoabout.getDescripcionE()
            );
        sAbout.save(about);
        return new ResponseEntity(new Mensaje("About me creado"), HttpStatus.OK);
                
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoAbout dtoabout){
        if(!sAbout.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(sAbout.existsByNombreE(dtoabout.getNombreE()) && sAbout.getByNombreE(dtoabout.getNombreE()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoabout.getNombreE())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        
        About about = sAbout.getOne(id).get();
        
        about.setNombreE(dtoabout.getNombreE());
        about.setDescripcionE(dtoabout.getDescripcionE());
        
        sAbout.save(about);
        
        return new ResponseEntity(new Mensaje("About me actualizado"), HttpStatus.OK);
    }
}


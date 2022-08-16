/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfoliovi.vj.Repository;

import com.portfoliovi.vj.entity.About;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lopoj
 */
@Repository
public interface RAbout extends JpaRepository<About, Integer>{
    public Optional<About> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}

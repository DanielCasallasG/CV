/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Modelo.Skate;
/**
 *
 * @author USUARIO
 */
public interface SkateInterface extends CrudRepository<Skate, Integer> {
    
}

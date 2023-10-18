/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author aleja
 */
@Controller
public class controllerTest {
    @GetMapping("/")
    public String pagina(){
        return "pagina";
    }
    @GetMapping("/tabla")
    public String tabla(){
        return "tabla";
    }
    
}

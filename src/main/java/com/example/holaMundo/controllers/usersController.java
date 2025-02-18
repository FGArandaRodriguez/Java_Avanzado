package com.example.holaMundo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class usersController {

    /*Este método que me retorna un string, sirve para acceder a la url clase1, 
    manda a setear una variable llamada mensaje la cual tiene un contenido que 
    se mostrará en el template .html*/

    @GetMapping("/clase_1")
    public String home (Model model){
        model.addAttribute("mensaje", "Hola Mundo en la WEB");
        model.addAttribute("mensaje1", "Prueba de GIT");
        model.addAttribute("mensaje2", "Hola Mundo para Actividad 4 Java");
        return "index"; //retorna el nombre de la vista en este caso index.html
    }



}
package com.portfolio.portfolioSpring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import repositorios.ContactoRepositorio;
import repositorios.EducacionRepositorio;

@Controller
@RequestMapping(path="/contacto")
public class Controlador {
    private ContactoRepositorio ContactoRepositorio;

    @GetMapping(path="/all")
    public String getAllUsers(Model modelo){
        modelo.addAttribute("contacto", ContactoRepositorio.findAll());
        modelo.addAttribute("titulo","Listado de usuarios");
        return "hola";
    }
    @GetMapping(path="/registro")
    public String registerView(Model modelo){

        return "registroUser";
    }

    @GetMapping(path="/name")
    public @ResponseBody Iterable<Contacto> getUsersByName(@RequestParam String name){
        return ContactoRepositorio.findByNombre(name);
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        Contacto u1 = new Contacto();
        u1.setNombre(name);
        u1.setEmail(email);
        ContactoRepositorio.save(u1);

        return "Usuario guardado";
    }
    private EducacionRepositorio EducaiconRepositorio;


}

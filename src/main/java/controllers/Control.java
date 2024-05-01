package controllers;

import dominio.modelos.ClienteModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import persistencia.ClienteRepJpa;
import persistencia.JPARep.ClienteJpa_itfRep;

import java.util.List;

@RestController
public class Control {




    @GetMapping("")
    @CrossOrigin(origins = "*")
    public String welcomeMessage(){
        return("Bem vindo as lojas ACME");
    }

    @GetMapping("/produtosDisponiveis")
    @CrossOrigin(origins = "*")
    public List<ClienteModel> todos(){
        ClienteRepJpa clienteModel= null;
        return clienteModel.todos();
    }



}

package controllers;

import dominio.modelos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import persistencia.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private ClienteRepJpa clienteRepJpa;
    @Autowired
    private AplicativoRepJpa aplicativoRepJpa;
    @Autowired
    private AssinaturaRepJpa assinaturaRepJpa;
    @Autowired
    private UsuarioRepJpa usuarioRepJpa;
    @Autowired
    private PagamentoRepJpa pagamentoRepJpa;

    public Controller(ClienteRepJpa clienteRepJpa,
                      AplicativoRepJpa aplicativoRepJpa,
                      AssinaturaRepJpa assinaturaRepJpa,
                      UsuarioRepJpa usuarioRepJpa,
                      PagamentoRepJpa pagamentoRepJpa) {
        this.clienteRepJpa = clienteRepJpa;
        this.aplicativoRepJpa = aplicativoRepJpa;
        this.assinaturaRepJpa = assinaturaRepJpa;
        this.usuarioRepJpa = usuarioRepJpa;
        this.pagamentoRepJpa = pagamentoRepJpa;
    }


    //Lista com todos os clientes cadastrados
    @GetMapping("/clientes")
    public List<ClienteModel> todosClientes() {
        return clienteRepJpa.todos();
    }

    //Lista com todos os clientes Aplicativos
    @GetMapping("/aplicativos")
    public List<AplicativoModel> todosAplicativos() {
        return aplicativoRepJpa.todos();
    }


  /*  //POST / servcad/assinatura
    @GetMapping("/assinaturas/{codigodocliente}/{codigodoaplicativo}")
    public AssinaturaModel CriaAssinatura() {
        AssinaturaModel assinaturaModel = new AssinaturaModel();


    }*/

    @GetMapping("/pagamentos")
    public List<PagamentoModel> todosPagamentos() {
        return pagamentoRepJpa.todos();
    }

    @GetMapping("/usuarios")
    public List<UsuarioModel> todosUsuarios() {
        return usuarioRepJpa.todos();
    }



















    @GetMapping("/controller")
    public String controllerEndpoint() {
        return "Este é o endpoint do Controller!";
    }

    @GetMapping("")
    @CrossOrigin(origins = "*")
    public String welcomeMessage(){
        return "Bem vindo as lojas ACME";
    }

    @GetMapping("/test")
    public String testEndpoint() {
        return "This is a test endpoint!";
    }
}

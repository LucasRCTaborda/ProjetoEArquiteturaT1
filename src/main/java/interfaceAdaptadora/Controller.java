package interfaceAdaptadora;

import dominio.modelos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import persistencia.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class Controller {
    @Autowired
    private final ClienteRepJpa clienteRepJpa;
    @Autowired
    private final AplicativoRepJpa aplicativoRepJpa;
    @Autowired
    private final AssinaturaRepJpa assinaturaRepJpa;
    @Autowired
    private final UsuarioRepJpa usuarioRepJpa;
    @Autowired
    private final PagamentoRepJpa pagamentoRepJpa;

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

    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public String welcomeMessage() {
        return "Bem-vindo às lojas ACME";
    }

    @GetMapping("/test")
    public String testEndpoint() {
        return "This is a test endpoint!";
    }

    @GetMapping("/clientes")
    public List<ClienteModel> todosClientes() {
        return clienteRepJpa.todos();
    }

    @GetMapping("/aplicativos")
    public List<AplicativoModel> todosAplicativos() {
        return aplicativoRepJpa.todos();
    }

    @GetMapping("/assinaturas")
    public List<AssinaturaModel> todasAssinaturas() {
        return assinaturaRepJpa.todosAssinatura();
    }

    @GetMapping("/pagamentos")
    public List<PagamentoModel> todosPagamentos() {
        return pagamentoRepJpa.todos();
    }

    @GetMapping("/usuarios")
    public List<UsuarioModel> todosUsuarios() {
        return usuarioRepJpa.todos();
    }
}

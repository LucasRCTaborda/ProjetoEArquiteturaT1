import dominio.modelos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import persistencia.*;

import java.util.List;

@RestController
public class Controller {
    private final ClienteRepJpa clientesJpa;
    private final AplicativoRepJpa aplicativoRepJpa;
    private final AssinaturaRepJpa assinaturaRepJpa;
    private final UsuarioRepJpa usuarioRepJpa;
    private final PagamentoRepJpa pagamentoRepJpa;

    @Autowired
    public Controller(ClienteRepJpa clientesJpa,
                      AplicativoRepJpa aplicativoRepJpa,
                      AssinaturaRepJpa assinaturaRepJpa,
                      UsuarioRepJpa usuarioRepJpa,
                      PagamentoRepJpa pagamentoRepJpa) {
        this.clientesJpa = clientesJpa;
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

    @GetMapping("/servcad/clientes")
    public List<ClienteModel> todosClientes() {
        return clientesJpa.todos();
    }

    @GetMapping("/servcad/aplicativos")
    public List<AplicativoModel> todosAplicativos() {
        return aplicativoRepJpa.todos();
    }

    @GetMapping("/servcad/assinaturas")
    public List<AssinaturaModel> todosAssinatura() {
        return assinaturaRepJpa.todosAssinatura();
    }

    @GetMapping("/servcad/pagamentos")
    public List<PagamentoModel> todosPagamentos() {
        return pagamentoRepJpa.todos();
    }

    @GetMapping("/servcad/usuarios")
    public List<UsuarioModel> todosUsuarios() {
        return usuarioRepJpa.todos();
    }
}

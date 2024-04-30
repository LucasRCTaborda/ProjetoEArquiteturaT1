package interfaceAdaptadora;

import dominio.modelos.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private UsuarioModel usuario;
    private AplicativoModel aplicativo;
    private AssinaturaModel assinatura;
    private ClienteModel cliente;
    private PagamentoModel pagamento;


    public Controller(UsuarioModel usuario,
                      AplicativoModel aplicativo,
                      AssinaturaModel assinatura,
                      ClienteModel cliente,
                      PagamentoModel pagamento
    ){
        this.usuario = usuario;
        this.aplicativo = aplicativo;
        this.assinatura = assinatura;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

    @GetMapping("")
    @CrossOrigin(origins = "*")
    public String welcomeMessage(){
        return("Bem vindo as lojas ACME");
    }


    }
package interfaceAdaptadora;

import dominio.modelos.Aplicativo;
import dominio.modelos.Cliente;
import dominio.servicos.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aplicativo")
public record ClienteController(ClienteService clienteService) {
    @PostMapping
    public Cliente save(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }
}

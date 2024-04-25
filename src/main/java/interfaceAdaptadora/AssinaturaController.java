package interfaceAdaptadora;

import dominio.modelos.Aplicativo;
import dominio.modelos.Assinatura;
import dominio.servicos.AssinaturaService;
import dominio.servicos.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assinatura")
public record AssinaturaController(AssinaturaService assinaturaService) {
    @PostMapping
    public Assinatura save(@RequestBody Assinatura assinatura){
        return assinaturaService.save(assinatura);
    }
}

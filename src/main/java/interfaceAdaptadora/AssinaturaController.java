package interfaceAdaptadora;

import dominio.servicos.AssinaturaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assinatura")
public record AssinaturaController(AssinaturaService assinaturaService) {



























  /*  @PostMapping
    public Assinatura save(@RequestBody Assinatura assinatura){
        return assinaturaService.save(assinatura);
    }*/
}

package interfaceAdaptadora;


import dominio.modelos.Aplicativo;
import dominio.servicos.AplicativoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aplicativo")
public record AplicativoController(AplicativoService aplicativoService) {

    @PostMapping
    public Aplicativo salvar(@RequestBody Aplicativo aplicativo) {
        return aplicativoService.save(aplicativo);

    }
}
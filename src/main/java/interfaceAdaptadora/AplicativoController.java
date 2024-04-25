package interfaceAdaptadora;


import dominio.modelos.Aplicativo;
import dominio.servicos.AplicativoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aplicativo")
public record AplicativoController(AplicativoService aplicativoService) {

    @PostMapping
    public Aplicativo salvar(@RequestBody Aplicativo aplicativo){
       return aplicativoService.save(aplicativo);
    }
}

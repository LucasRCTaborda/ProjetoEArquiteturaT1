package interfaceAdaptadora;

import dominio.modelos.Pagamento;
import dominio.servicos.PagamentoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamento")
public record PagamentoController(PagamentoService pagamentoService) {
    @PostMapping
    public Pagamento salvar(@RequestBody Pagamento pagamento) {
        return pagamentoService.save(pagamento);
    }
}

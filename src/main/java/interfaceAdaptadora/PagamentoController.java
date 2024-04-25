package interfaceAdaptadora;

import dominio.modelos.Pagamento;
import dominio.servicos.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pagamento")
public record PagamentoController(PagamentoService pagamentoService) {

    @Autowired
    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Pagamento> cadastrarPagamento(@RequestBody Pagamento pagamento) {
        Pagamento novoPagamento = pagamentoService.cadastrarPagamento(pagamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPagamento);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<Pagamento> editarPagamento(@PathVariable Long id, @RequestBody Pagamento pagamentoAtualizado) {
        Pagamento pagamentoEditado = pagamentoService.editarPagamento(id, pagamentoAtualizado);
        if (pagamentoEditado != null) {
            return ResponseEntity.ok(pagamentoEditado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Pagamento>> listarPagamentos() {
        List<Pagamento> pagamentos = pagamentoService.listarPagamentos();
        return ResponseEntity.ok(pagamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento> buscarPagamentoPorId(@PathVariable Long id) {
        Optional<Pagamento> pagamento = pagamentoService.buscarPagamentoPorId(id);
        return pagamento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletarPagamento(@PathVariable Long id) {
        Optional<Pagamento> pagamento = pagamentoService.buscarPagamentoPorId(id);
        if (pagamento.isPresent()) {
            pagamentoService.delete(pagamento.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }}
}

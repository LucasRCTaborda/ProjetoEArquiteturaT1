package interfaceAdaptadora;
import dominio.modelos.Assinatura;
import dominio.servicos.AssinaturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assinatura")
public record AssinaturaController(AssinaturaService assinaturaService) {
    @Autowired
    public AssinaturaController(AssinaturaService assinaturaService) {
        this.assinaturaService = assinaturaService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Assinatura> cadastrarAssinatura(@RequestBody Assinatura assinatura) {
        Assinatura novaAssinatura = assinaturaService.cadastrarAssinatura(assinatura);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaAssinatura);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<Assinatura> editarAssinatura(@PathVariable Long id, @RequestBody Assinatura assinaturaAtualizada) {
        Assinatura assinaturaEditada = assinaturaService.editarAssinatura(id, assinaturaAtualizada);
        if (assinaturaEditada != null) {
            return ResponseEntity.ok(assinaturaEditada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Assinatura>> listarAssinaturas() {
        List<Assinatura> assinaturas = assinaturaService.listarAssinaturas();
        return ResponseEntity.ok(assinaturas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assinatura> buscarAssinaturaPorId(@PathVariable Long id) {
        Optional<Assinatura> assinatura = assinaturaService.buscarAssinaturaPorId(id);
        return assinatura.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletarAssinatura(@PathVariable Long id) {
        Optional<Assinatura> assinatura = assinaturaService.buscarAssinaturaPorId(id);
        if (assinatura.isPresent()) {
            assinaturaService.delete(assinatura.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

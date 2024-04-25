package interfaceAdaptadora;


import dominio.modelos.Aplicativo;
import dominio.servicos.AplicativoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aplicativo")
public record AplicativoController(AplicativoService aplicativoService) {


    public AplicativoController(AplicativoService aplicativoService) {
        this.aplicativoService = aplicativoService;
    }

    @GetMapping
    public ResponseEntity<List<Aplicativo>> listarAplicativos() {
        List<Aplicativo> aplicativos = aplicativoService.listarAplicativos();
        return ResponseEntity.ok(aplicativos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aplicativo> buscarAplicativoPorId(@PathVariable Long id) {
        Optional<Aplicativo> aplicativo = aplicativoService.buscarAplicativoPorId(id);
        return aplicativo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/cadastrarAplicativo/{Id}/{name}/{custoMensal}")
    public ResponseEntity<Aplicativo> cadastrarAplicativo(@PathVariable Long Id,
                                                          @PathVariable String name ,
                                                          @PathVariable double custoMensal) {
        Aplicativo novoAplicativo = new Aplicativo(Id, name, custoMensal);
        aplicativoService.save(novoAplicativo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoAplicativo);
    }


    @PostMapping("/editarAplicativo/{id}/{nome}/{custoMensal}")
    public ResponseEntity<Aplicativo> editarAplicativo(@PathVariable Long id,
                                                       @PathVariable String nome,
                                                       @PathVariable double custoMensal) {
        Aplicativo aplicativoAtualizado = aplicativoService.editarAplicativo(id, nome, custoMensal);
        if (aplicativoAtualizado != null) {
            return ResponseEntity.ok(aplicativoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAplicativo(@PathVariable Long id) {
        Optional<Aplicativo> optionalAplicativo = aplicativoService.buscarAplicativoPorId(id);
        if (optionalAplicativo.isPresent()) {
            aplicativoService.delete(optionalAplicativo.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    }

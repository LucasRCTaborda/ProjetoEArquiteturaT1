package dominio.servicos;

import java.util.List;
import java.util.Optional;

import dominio.modelos.Aplicativo;
import dominio.persistencia.IAplicativoRepository;
import org.springframework.stereotype.Service;

@Service
public class AplicativoService {

    private final IAplicativoRepository aplicativoRepository;

    public AplicativoService(IAplicativoRepository aplicativoRepository) {
        this.aplicativoRepository = aplicativoRepository;
    }

    public Aplicativo save(Aplicativo aplicativo) {
        return aplicativoRepository.save(aplicativo);
    }

    public void delete(Aplicativo aplicativo) {
        aplicativoRepository.delete(aplicativo);
    }

    public List<Aplicativo> listarAplicativos() {
        return aplicativoRepository.findAll();
    }

    public Optional<Aplicativo> buscarAplicativoPorId(Long id) {
        return aplicativoRepository.findById(id);
    }

    public Aplicativo cadastrarAplicativo(Aplicativo aplicativo) {
        return save(aplicativo);
    }

    public Aplicativo editarAplicativo(Long id,String nome, double custoMensal) {
        Optional<Aplicativo> optionalAplicativo = buscarAplicativoPorId(id);
        if (optionalAplicativo.isPresent()) {
            Aplicativo aplicativoExistente = optionalAplicativo.get();
            aplicativoExistente.setNome(nome);
            aplicativoExistente.setCustoMensal(custoMensal);
            return save(aplicativoExistente);
        } else {
            // Lógica de tratamento de erro se o aplicativo não for encontrado
            return null;
        }
    }
}

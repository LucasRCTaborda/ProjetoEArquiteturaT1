package dominio.servicos;

import dominio.modelos.Pagamento;
import dominio.persistencia.IPagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public record PagamentoService(IPagamentoRepository iPagamentoRepository) {

    public Pagamento save(Pagamento pagamento){
        return iPagamentoRepository.save(pagamento);

    }
    public void delete(Pagamento pagamento){
        iPagamentoRepository.delete(pagamento);
    }
}

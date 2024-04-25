package dominio.servicos;

import java.util.List;
import java.util.Optional;

import dominio.modelos.Pagamento;
import dominio.persistencia.IPagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    private final IPagamentoRepository iPagamentoRepository;

    public PagamentoService(IPagamentoRepository iPagamentoRepository) {
        this.iPagamentoRepository = iPagamentoRepository;
    }

    public Pagamento save(Pagamento pagamento) {
        return iPagamentoRepository.save(pagamento);
    }

    public void delete(Pagamento pagamento) {
        iPagamentoRepository.delete(pagamento);
    }

    public List<Pagamento> listarPagamentos() {
        return iPagamentoRepository.findAll();
    }

    public Optional<Pagamento> buscarPagamentoPorId(Long id) {
        return iPagamentoRepository.findById(id);
    }

    public Pagamento cadastrarPagamento(Pagamento pagamento) {
        return save(pagamento);
    }

    public Pagamento editarPagamento(Long id, Pagamento pagamentoAtualizado) {
        Optional<Pagamento> optionalPagamento = buscarPagamentoPorId(id);
        if (optionalPagamento.isPresent()) {
            Pagamento pagamentoExistente = optionalPagamento.get();
            // Atualize os campos do pagamentoExistente com os valores de pagamentoAtualizado
            // Exemplo: pagamentoExistente.setValorPago(pagamentoAtualizado.getValorPago());
            return save(pagamentoExistente);
        } else {
            // Lógica de tratamento de erro se o pagamento não for encontrado
            return null;
        }
    }
}
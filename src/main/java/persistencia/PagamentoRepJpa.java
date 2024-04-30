package persistencia;

import dominio.modelos.AssinaturaModel;
import dominio.modelos.PagamentoModel;
import dominio.persistencia.IPagamentoRepository;
import interfaceAdaptadora.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import persistencia.Entity.Assinatura;
import persistencia.Entity.Pagamento;
import persistencia.JPARep.PagamentoJpa_itfRep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@Repository
@Primary
public class PagamentoRepJpa implements IPagamentoRepository {
private PagamentoJpa_itfRep pagamentoRepository;


@Autowired
public PagamentoRepJpa(PagamentoJpa_itfRep pagamentoRepository){
    this.pagamentoRepository=pagamentoRepository;
}

    @Override
    public List<PagamentoModel> todos() {
        List<Pagamento> pagamentos = pagamentoRepository.findAll();
        if (pagamentos.size() == 0) {
            return new LinkedList<PagamentoModel>();
        } else {
            return pagamentos.stream()
                    .map(prod -> Pagamento.toPagamentoModel(prod))
                    .toList();
        }
    }

    @Override
    public PagamentoModel consultaPorId(Long codigo) {
        return null;
    }

    @Override
    public List<AssinaturaModel> todosAssinatura() {
        return null;
    }

    @Override
    public AssinaturaModel consultaPorIdAssinatura(Long codigo) {
        return null;
    }
}

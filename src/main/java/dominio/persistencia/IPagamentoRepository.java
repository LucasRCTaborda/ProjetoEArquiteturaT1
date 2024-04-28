package dominio.persistencia;

import dominio.modelos.AssinaturaModel;
import dominio.modelos.PagamentoModel;

import java.util.List;

public interface IPagamentoRepository {
    List<PagamentoModel> todos ();
    PagamentoModel consultaPorId(Long codigo);

    List<AssinaturaModel> todosAssinatura ();
    AssinaturaModel consultaPorIdAssinatura(Long codigo);

}

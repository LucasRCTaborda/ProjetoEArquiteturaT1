package persistencia;

import dominio.modelos.AssinaturaModel;
import dominio.modelos.PagamentoModel;
import dominio.persistencia.IPagamentoRepository;
import persistencia.Entity.Assinatura;

import java.util.ArrayList;
import java.util.List;

public class PagamentoRepJpa implements IPagamentoRepository {

    @Override
    public List<PagamentoModel> todos() {
        return null;
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

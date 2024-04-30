package persistencia.JPARep;

import org.springframework.data.repository.CrudRepository;

import persistencia.Entity.Pagamento;

import java.util.List;
import java.util.Optional;

public interface PagamentoJpa_itfRep extends CrudRepository<Pagamento, Long> {

    List<Pagamento> findAll();
    Optional<Pagamento> findById(long id);
}

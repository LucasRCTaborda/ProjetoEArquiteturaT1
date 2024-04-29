package persistencia.JPARep;

import org.springframework.data.repository.CrudRepository;
import persistencia.Entity.Aplicativo;
import persistencia.Entity.Cliente;

import java.util.List;

public interface AplicativoJpa_itfRep extends CrudRepository<Aplicativo,Long> {
    List<Aplicativo> findAll();
    Aplicativo findById(long id);
}

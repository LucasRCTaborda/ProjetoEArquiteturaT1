package persistencia.JPARep;

import org.springframework.data.repository.CrudRepository;
import persistencia.Entity.Cliente;
import persistencia.Entity.Usuario;

import java.util.List;

public interface ClienteJpa_itfRep extends CrudRepository<Cliente,Long> {
    List<Cliente> findAll();
    Cliente findById(long id);
}

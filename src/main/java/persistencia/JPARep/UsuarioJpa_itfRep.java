package persistencia.JPARep;

import org.springframework.data.repository.CrudRepository;
import persistencia.Entity.Usuario;

import java.util.List;

public interface UsuarioJpa_itfRep  extends CrudRepository<Usuario, Long> {
    List<Usuario> findAll();
    Usuario findById(long id);
}

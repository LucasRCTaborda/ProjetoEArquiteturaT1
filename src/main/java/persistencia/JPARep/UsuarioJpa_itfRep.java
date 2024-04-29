package persistencia;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioJpa_itfRep  extends CrudRepository<Usuario, Long> {
    List<Usuario> findAll();
    Usuario findById(long id);
}

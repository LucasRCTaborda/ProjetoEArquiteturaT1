package persistencia;

import dominio.modelos.UsuarioModel;
import dominio.persistencia.IUsuarioRepository;
import interfaceAdaptadora.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Primary
@Repository
public class UsuarioRepJpa implements IUsuarioRepository {
    private UsuarioJpa_itfRep usuarioRepository;

    @Autowired
    public UsuarioRepJpa(UsuarioJpa_itfRep usuarioRepository){

        this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioModel> todos() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        if (usuarios.size() == 0) {
            return new LinkedList<UsuarioModel>();
        }else {
            List<Object> list = usuarios.stream()
                    .map(prod -> {
                        return usuarios.toString(prod);
                    })
                    .toList();
            return list;
        }
    }

}







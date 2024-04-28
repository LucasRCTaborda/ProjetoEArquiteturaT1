package persistencia;

import dominio.modelos.UsuarioModel;
import dominio.persistencia.IUsuarioRepository;
import interfaceAdaptadora.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

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
        } else {
            return usuarios.stream()
                    .map(prod -> Usuario.toUsuarioModel(prod))
                    .toList();
        }
        public UsuarioModel findById(long id) {
            Usuario usuario = usuarioRepository.findById(id);
            System.out.println("Produto de codigo: "+id+": "+usuario);
            if (usuario == null) {
                return null;
            } else {
                return Usuario.toProdutoModel(produto);
            }
        }

    }

    @Override
    public UsuarioModel consultaPorId(Long codigo) {
        return null;
    }
}

package persistencia;

import dominio.modelos.UsuarioModel;

import dominio.persistencia.IUsuarioRepository;
import interfaceAdaptadora.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import persistencia.Entity.Usuario;
import persistencia.JPARep.UsuarioJpa_itfRep;

import java.util.LinkedList;
import java.util.List;


@Repository
@Primary
public class UsuarioRepJpa implements IUsuarioRepository {
    private UsuarioJpa_itfRep usuarioRepository;

    @Autowired
    public UsuarioRepJpa(UsuarioJpa_itfRep usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioModel> todos() {
        List<Usuario> produtos = usuarioRepository.findAll();
        if (produtos.size() == 0) {
            return new LinkedList<UsuarioModel>();
        } else {
            return produtos.stream()
                    .map(prod -> Usuario.toUsuarioModel(prod))
                    .toList();
        }
    }

    public UsuarioModel consultaPorId(long id) {
        Usuario produto = usuarioRepository.findById(id);
        System.out.println("Produto de codigo: "+id+": "+produto);
        if (produto == null) {
            return null;
        } else {
            return Usuario.toUsuarioModel(produto);
        }
    }

}







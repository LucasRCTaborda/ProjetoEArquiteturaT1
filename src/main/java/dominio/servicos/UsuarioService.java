package dominio.servicos;

import dominio.modelos.Cliente;
import dominio.modelos.Usuario;
import dominio.persistencia.IUsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public record UsuarioService(IUsuarioRepository iUsuarioRepository) {

    public Usuario save(Usuario usuario){
        return iUsuarioRepository.save(usuario);
    }

    public void delete(Usuario usuario) {
        iUsuarioRepository.delete(usuario);
    }
}

package dominio.persistencia;

import dominio.modelos.UsuarioModel;

import java.util.List;

public interface IUsuarioRepository  {
    List<UsuarioModel> todos ();
    UsuarioModel consultaPorId(Long codigo);
}

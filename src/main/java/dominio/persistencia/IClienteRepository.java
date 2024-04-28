package dominio.persistencia;

import dominio.modelos.ClienteModel;

import java.util.List;

public interface IClienteRepository  {
    List<ClienteModel> todos ();
    ClienteModel consultaPorId(Long codigo);
}

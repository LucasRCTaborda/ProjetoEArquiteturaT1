package dominio.persistencia;

import dominio.modelos.AplicativoModel;
import dominio.modelos.AssinaturaModel;
import dominio.modelos.ClienteModel;

import java.util.List;

public interface IAssinaturaRepository  {
    List<AssinaturaModel> todosAssinatura ();
    List<AplicativoModel> todosAplicativos();
    List<ClienteModel> todosClientes();

    AssinaturaModel consultaPorId(Long codigo);
    AssinaturaModel ConsultaporIdAssinatura(long codigo);
}

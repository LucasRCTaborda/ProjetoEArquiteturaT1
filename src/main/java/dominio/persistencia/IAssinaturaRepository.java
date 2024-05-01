package dominio.persistencia;

import dominio.modelos.AplicativoModel;
import dominio.modelos.AssinaturaModel;
import dominio.modelos.ClienteModel;

import java.util.List;
import java.util.Optional;

public interface IAssinaturaRepository  {
    List<AssinaturaModel> todosAssinatura ();
    List<AplicativoModel> todosAplicativos();
    List<ClienteModel> todosClientes();

    Optional<AssinaturaModel> consultaPorId(Long codigo);
    AssinaturaModel ConsultaporIdAssinatura(long codigo);
}

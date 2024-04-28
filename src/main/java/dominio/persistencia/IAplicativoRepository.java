package dominio.persistencia;


import dominio.modelos.AplicativoModel;

import java.util.List;

public interface IAplicativoRepository {
List<AplicativoModel> todos ();
AplicativoModel consultaPorId(Long codigo);


}

package dominio.servicos;

import dominio.modelos.Aplicativo;
import dominio.persistencia.IAplicativoRepository;
import org.springframework.stereotype.Service;

@Service
public record AplicativoService(IAplicativoRepository iAplicativoRepository) {

    public Aplicativo save(Aplicativo aplicativo){
        return iAplicativoRepository.save(aplicativo);

    }

}

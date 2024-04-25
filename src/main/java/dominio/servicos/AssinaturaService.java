package dominio.servicos;

import dominio.modelos.Assinatura;
import dominio.persistencia.IAssinaturaRepository;
import org.springframework.stereotype.Service;

@Service
public class AssinaturaService {

    private  IAssinaturaRepository assinaturaRepository;

    public AssinaturaService(IAssinaturaRepository assinaturaRepository) {
        this.assinaturaRepository = assinaturaRepository;
    }

    public Assinatura save(Assinatura assinatura) {
        return assinaturaRepository.save(assinatura);
    }

    public void delete(Assinatura assinatura) {
        assinaturaRepository.delete(assinatura);
    }


}

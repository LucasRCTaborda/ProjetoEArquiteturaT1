package dominio.servicos;

import dominio.modelos.Cliente;
import dominio.persistencia.IClienteRepository;
import org.springframework.stereotype.Service;

@Service
public record ClienteService(IClienteRepository iClienteRepository) {

    public Cliente save(Cliente cliente) {
        return iClienteRepository.save(cliente);
    }

    public void delete(Cliente cliente) {
        iClienteRepository.delete(cliente);
    }
}
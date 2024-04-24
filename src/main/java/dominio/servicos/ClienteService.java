package dominio.servicos;

import dominio.modelos.Assinatura;
import dominio.modelos.Cliente;
import dominio.persistencia.IClienteRepository;
import org.springframework.stereotype.Service;

@Service
public record ClienteService(IClienteRepository iClienteRepository) {

    public Cliente salvar(Cliente cliente) {
        return iClienteRepository.save(cliente);
    }

    public void Cliente(Cliente cliente) {
        iClienteRepository.delete(cliente);
    }
}
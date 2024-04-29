package persistencia;

import dominio.modelos.ClienteModel;
import dominio.persistencia.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import persistencia.Entity.Cliente;
import persistencia.Entity.Usuario;
import persistencia.JPARep.ClienteJpa_itfRep;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ClienteRepJpa implements IClienteRepository {
    private final ClienteJpa_itfRep clienteRepository;

    @Autowired
    public ClienteRepJpa(ClienteJpa_itfRep clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<ClienteModel> todos() {
        List<Cliente> clientes = clienteRepository.findAll();
        if (clientes.size() == 0){
            return new LinkedList<ClienteModel>();
        } else {
            return clientes.stream()
                    .map(clie -> Cliente.toClienteModel(clie))
                    .toList();
        }
    }

    @Override
    public ClienteModel consultaPorId(Long codigo) {
        // Buscar o cliente pelo ID
        Optional<Cliente> optionalCliente = clienteRepository.findById(codigo);

        // Verificar se o cliente foi encontrado
        if (optionalCliente.isPresent()) {
            // Cliente encontrado, retornar o modelo de cliente correspondente
            Cliente cliente = optionalCliente.get();
            System.out.println("Cliente de código: " + codigo + ": " + cliente);
            return Cliente.toClienteModel(cliente);
        } else {
            // Cliente não encontrado, retornar null
            return null;
        }
    }

}

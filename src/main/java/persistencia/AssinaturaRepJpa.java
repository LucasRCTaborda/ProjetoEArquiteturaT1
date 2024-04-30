package persistencia;

import dominio.modelos.AplicativoModel;
import dominio.modelos.AssinaturaModel;
import dominio.modelos.ClienteModel;
import dominio.persistencia.IAssinaturaRepository;
import persistencia.Entity.Aplicativo;
import persistencia.Entity.Assinatura;
import persistencia.Entity.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AssinaturaRepJpa implements IAssinaturaRepository {
    private  List<Assinatura> assinaturas = new ArrayList<>();


    public AssinaturaRepJpa(List<Assinatura> assinaturas) {
        this.assinaturas = assinaturas;
    }


    private AssinaturaModel mapToAssinaturaModel(Assinatura assinatura) {
        return new AssinaturaModel(
                assinatura.getCodigo(),
                assinatura.getAplicativo().getNome(), // Supondo que você tenha acesso ao nome do aplicativo
                assinatura.getCliente().getNome(), // Supondo que você tenha acesso ao nome do cliente
                assinatura.getInicioVigencia(),
                assinatura.getFimVigencia()
        );
    }

    @Override
    public List<AssinaturaModel> todosAssinatura() {
        return assinaturas.stream()
                .map(this::mapToAssinaturaModel)
                .collect(Collectors.toList());
    }

    @Override
    public List<AplicativoModel> todosAplicativos() {
        return assinaturas.stream()
                .map(assinatura -> assinatura.getAplicativo())
                .distinct() // Para garantir que não haja aplicativos duplicados
                .map(this::mapToAplicativoModel)
                .collect(Collectors.toList());
    }

    private AplicativoModel mapToAplicativoModel(Aplicativo aplicativo) {
        return new AplicativoModel(
                aplicativo.getCodigo(),
                aplicativo.getNome(),
                aplicativo.getCustoMensal()
        );
    }

    @Override
    public List<ClienteModel> todosClientes() {
        return assinaturas.stream()
                .map(assinatura -> assinatura.getCliente())
                .distinct() // Para garantir que não haja clientes duplicados
                .map(this::mapToClienteModel)
                .collect(Collectors.toList());
    }

    private ClienteModel mapToClienteModel(Cliente cliente) {
        return new ClienteModel(
                cliente.getcodigo(),
                cliente.getNome(),
                cliente.getEmail()
        );
    }


    @Override
    public AssinaturaModel consultaPorId(Long codigo) {
        Optional<Assinatura> assinaturaOptional = assinaturas.stream()
                .filter(assinatura -> assinatura.getCodigo() == codigo)
                .findFirst();

        if (assinaturaOptional.isPresent()) {
            Assinatura assinatura = assinaturaOptional.get();
            return mapToAssinaturaModel(assinatura);
        } else {
            return null; // Ou lança uma exceção, dependendo dos requisitos do seu aplicativo
        }
    }


    @Override
    public AssinaturaModel ConsultaporIdAssinatura(long codigo) {
        Optional<Assinatura> assinaturaOptional = assinaturas.stream()
                .filter(assinatura -> assinatura.getCodigo() == codigo)
                .findFirst();

        if (assinaturaOptional.isPresent()) {
            Assinatura assinatura = assinaturaOptional.get();
            return mapToAssinaturaModel(assinatura);
        } else {
            return null; // Ou lança uma exceção, dependendo dos requisitos do seu aplicativo
        }
    }

}

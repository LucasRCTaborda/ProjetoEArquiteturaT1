package dominio.servicos;

import dominio.modelos.AplicativoModel;
import dominio.persistencia.IAplicativoRepository;
import dominio.persistencia.IAssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoAtualizaCustoMensal {
    private IAplicativoRepository aplicativo ;
    private double novoCusto;

    @Autowired
    public ServicoAtualizaCustoMensal(IAplicativoRepository aplicativo, double custo){
        this.aplicativo=aplicativo;
        this.novoCusto=custo;

    }
    public AplicativoModel produtoPorCodigo(long id){
        return this.aplicativo.consultaPorId(id);
    }

    public void AtualizaCusto(long id, double preco){
        aplicativo.AtualizaCusto(id,preco);
    }


}

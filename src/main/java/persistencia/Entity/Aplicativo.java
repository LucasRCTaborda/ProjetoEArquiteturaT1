package persistencia.Entity;

import dominio.modelos.AplicativoModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aplicativo {
    @Id
    @GeneratedValue
    private long codigo;
    private String nome;
    private double custoMensal;

    public Aplicativo() {
    }

    public Aplicativo(long codigo, String nome, double custoMensal) {
        this.codigo = codigo;
        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCustoMensal() {
        return custoMensal;
    }

    public void setCustoMensal(double custoMensal) {
        this.custoMensal = custoMensal;
    }

    public static Aplicativo fromAplicativoModel(AplicativoModel apModel){
        return new Aplicativo(apModel.getCodigo(),apModel.getNome(),apModel.getCustoMensal());
    }

    public static AplicativoModel toAplicativoModel(Aplicativo aplicativo){
        return new AplicativoModel(aplicativo.getCodigo(), aplicativo.getNome(), aplicativo.getCustoMensal());
    }
}

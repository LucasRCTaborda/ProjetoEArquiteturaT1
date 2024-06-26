package aplicacao.dtos;

import dominio.modelos.AplicativoModel;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class AplicativoDTO {
    @Id
    @GeneratedValue
    private long codigo;
    private String nome;
    private double custoMensal;



    public AplicativoDTO(long codigo, String nome, double custoMensal) {
        this.codigo = codigo;
        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCustoMensal(double custoMensal) {
        this.custoMensal = custoMensal;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getCustoMensal() {
        return custoMensal;
    }
    public static AplicativoDTO fromModel(AplicativoModel aplicativo){
        return new AplicativoDTO(aplicativo.getCodigo(), aplicativo.getNome(), aplicativo.getCustoMensal());
    }

}

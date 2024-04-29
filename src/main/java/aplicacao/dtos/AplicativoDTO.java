package aplicacao.dtos;

import dominio.modelos.AplicativoModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Aplicativo {
    @Id
    @GeneratedValue
    private long codigo;
    private String nome;
    private double custoMensal;



    public Aplicativo(long codigo, String nome, double custoMensal) {
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

  
}

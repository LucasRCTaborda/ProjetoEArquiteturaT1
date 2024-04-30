package dominio.modelos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class AssinaturaModel {

    @Id
    @GeneratedValue
    private long codigo;
    private Date inicioVigencia;
    private Date fimVigencia;
    private List<ClienteModel> cliente;
    private List<AplicativoModel> aplicativo;



    public List<ClienteModel> getCliente() {
        return cliente;
    }
    public List<AplicativoModel> getAplicativo() {
        return aplicativo;
    }


    public AssinaturaModel(long codigo, String nome, String s, Date inicioVigencia, Date fimVigencia) {
        this.codigo = codigo;
      this.aplicativo = new LinkedList<>();
        this.cliente = new LinkedList<>();
    }

    public AssinaturaModel() {
        this.aplicativo = new LinkedList<>();
        this.cliente = new LinkedList<>();
    }

    public long getCodigo() {
        return codigo;
    }



    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(Date fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

    @Override
    public String toString() {
        return "AssinaturaModel{" +
                "codigo=" + codigo +
                ", inicioVigencia=" + inicioVigencia +
                ", fimVigencia=" + fimVigencia +
                ", cliente=" + cliente +
                ", aplicativo=" + aplicativo +
                '}';
    }
}

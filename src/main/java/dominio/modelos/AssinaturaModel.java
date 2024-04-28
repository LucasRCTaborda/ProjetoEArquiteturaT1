package dominio.modelos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import persistencia.Aplicativo;
import persistencia.Assinatura;
import persistencia.Cliente;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class AssinaturaModel {

    @Id
    @GeneratedValue
    private long codigo;
    private List<AplicativoModel> aplicativo;
    private List<ClienteModel> cliente;

    private Date inicioVigencia;
    private Date fimVigencia;

    public AssinaturaModel(long codigo) {
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

}

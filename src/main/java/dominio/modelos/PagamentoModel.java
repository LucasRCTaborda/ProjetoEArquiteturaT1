package dominio.modelos;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
public class PagamentoModel {


    @Id
    @GeneratedValue
    private long codigo;
    private AssinaturaModel assinatura;
    private double valorPago;
    private String promocao;

    public PagamentoModel(long codigo, AssinaturaModel assinatura, double valorPago, String promocao) {
        this.codigo = codigo;
        this.assinatura = assinatura;
        this.valorPago = valorPago;
        this.promocao = promocao;
    }

    public long getCodigo() {
        return codigo;
    }


    public AssinaturaModel getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(AssinaturaModel assinatura) {
        this.assinatura = assinatura;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

    @Override
    public String toString() {
        return "PagamentoModel{" +
                "codigo=" + codigo +
                ", assinatura=" + assinatura +
                ", valorPago=" + valorPago +
                ", promocao='" + promocao + '\'' +
                '}';
    }
}

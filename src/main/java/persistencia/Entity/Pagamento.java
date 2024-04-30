package persistencia.Entity;

import jakarta.persistence.*;
import persistencia.Entity.Assinatura;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming you want it to be auto-generated
    private long codigo;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Assinatura assinatura;
    private double valorPago;
    private String promocao;

    public Pagamento(long codigo, Assinatura assinatura, double valorPago, String promocao) {
        this.codigo = codigo;
        this.assinatura = assinatura;
        this.valorPago = valorPago;
        this.promocao = promocao;
    }

    public Pagamento() {

    }

    public long getCodigo() {
        return codigo;
    }

    public Assinatura getAssinatura() {
        return assinatura;
    }

    public double getValorPago() {
        return valorPago;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setAssinatura(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "codigo=" + codigo +
                ", assinatura=" + assinatura +
                ", valorPago=" + valorPago +
                ", promocao='" + promocao + '\'' +
                '}';
    }
}

package persistencia.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity

public class Pagamento {


    @Id
    @GeneratedValue
    private long codigo;
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

    public void setAssinatura(Assinatura assinatura) {
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
}

package dominio.modelos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Pagamento {


    @Id
    @GeneratedValue
    private long codigo;
    private Assinatura assinatura;
    private double valorPago;
    private String promocao;

}

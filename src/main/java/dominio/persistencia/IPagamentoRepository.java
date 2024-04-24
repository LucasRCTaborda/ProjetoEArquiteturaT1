package dominio.persistencia;

import dominio.modelos.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPagamentoRepository extends JpaRepository <Pagamento, Long>{
}

package dominio.persistencia;

import dominio.modelos.Assinatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAssinaturaRepository extends JpaRepository<Assinatura, Long> {
}

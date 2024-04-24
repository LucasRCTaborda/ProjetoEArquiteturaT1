package dominio.servicos.persistencia;


import dominio.modelos.Aplicativo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAplicativoRepository extends JpaRepository< Aplicativo,Long> {
}

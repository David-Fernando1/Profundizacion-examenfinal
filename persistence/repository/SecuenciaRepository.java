package co.edu.poli.Examenfinal.persistence.repository;

import co.edu.poli.Examenfinal.persistence.entity.Secuencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecuenciaRepository extends JpaRepository<Secuencia, Long> {

}

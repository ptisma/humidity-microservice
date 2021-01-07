package hr.rassus.lab.repo;

import hr.rassus.lab.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
}

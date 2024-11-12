package tech.sujitjayaraj.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import tech.sujitjayaraj.tacocloud.domain.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}

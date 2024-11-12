package tech.sujitjayaraj.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import tech.sujitjayaraj.tacocloud.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}

package workintech.ecommerce.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import workintech.ecommerce.backend.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
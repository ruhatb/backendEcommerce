package workintech.ecommerce.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import workintech.ecommerce.backend.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
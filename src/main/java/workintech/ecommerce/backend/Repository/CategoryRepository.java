package workintech.ecommerce.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import workintech.ecommerce.backend.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
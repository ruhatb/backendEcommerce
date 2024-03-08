package workintech.ecommerce.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workintech.ecommerce.backend.Entity.Product;
import workintech.ecommerce.backend.Repository.ProductRepository;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllCategories() {
        return productRepository.findAll();
    }
}
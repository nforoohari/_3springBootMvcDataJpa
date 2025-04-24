package ir.digixo.dao;

import ir.digixo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao  extends JpaRepository<Product,Long> {
   /* List<Product> findAll();
    void save(Product product);
    Product findById(Long id);
    void delete(Long id);*/

}

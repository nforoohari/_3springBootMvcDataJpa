package ir.digixo.service;

import ir.digixo.dao.ProductDao;
import ir.digixo.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {


    private ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    @Transactional
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    @Transactional
    public Product findById(Long id) {
        return productDao.findById(id).get();
    }

    @Override
    @Transactional
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional<Product> byId = productDao.findById(id);
        productDao.delete(byId.get());
    }
}

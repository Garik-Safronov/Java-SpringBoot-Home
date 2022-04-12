package ru.gb.javaspringboothome.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.javaspringboothome.model.Product;
import ru.gb.javaspringboothome.repository.ProductRepository;
import ru.gb.javaspringboothome.model.Product;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.saveProduct(product);
    }

    public Product findById(Integer id) {
        return productRepository.findProductById(id);
    }

    public List<Product> findAll() {
        return productRepository.allProductList();
    }

    public void deleteById(Integer id) {
        productRepository.deleteProductById(id);
    }
}

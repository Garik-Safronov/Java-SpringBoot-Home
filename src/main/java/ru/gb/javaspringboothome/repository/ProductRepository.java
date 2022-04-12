package ru.gb.javaspringboothome.repository;

import org.springframework.stereotype.Component;
import ru.gb.javaspringboothome.model.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    List<Product> productList = new ArrayList<>();
    int index;

    public Product saveProduct(Product product) {
        product.setId(index++);
        productList.add(product);
        return product;
    }

    public List<Product> allProductList(){
        return productList;
    }

    public Product findProductById(int id){
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        throw new RuntimeException("Товар не нейден");
    }

    public void deleteProductById(Integer id) {
        if (id < productList.size()) {
            for (Product p : productList) {
                if (p.getId() == id) {
                    productList.remove(p);
                    return;
                }
            }
        }
    }
}

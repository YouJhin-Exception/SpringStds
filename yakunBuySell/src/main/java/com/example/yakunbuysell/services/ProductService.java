package com.example.yakunbuysell.services;

import com.example.yakunbuysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> allProducts = new ArrayList<>();
    private long productId = 0;

    {
        allProducts.add(new Product(++productId,"PlayStation", "some Desc to PS",60000, "Stavropol","Jhin"));
        allProducts.add(new Product(++productId,"Iphone12", "some Desc to iphone",80000, "Stavropol","Jhin"));
    }
    public List<Product> allProduct(){
        return allProducts;
    }
    public void saveProduct(Product product){
        product.setId(++productId);
        allProducts.add(product);
    }

    public void deleteProduct(Long id){
        allProducts.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : allProducts) {
            if (product.getId().equals(id))
                return product;
        }
        return null;
    }
}

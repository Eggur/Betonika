package com.Eggur.service;

import com.Eggur.model.Product;
import com.Eggur.repo.ProductRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow(null);
    }

    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
        System.out.println("Продукт был успешно удален");
    }
}

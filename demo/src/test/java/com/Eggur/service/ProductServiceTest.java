package com.Eggur.service;

import com.Eggur.model.Product;
import com.Eggur.repo.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest

public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetProductById() {
        // Подготовка заглушки
        Product product = new Product();
        product.setId(1L);
        product.setLabel("M500");
        product.setPrice(100);

        Mockito.when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        // Выполнение теста
        Product actualProduct = productService.getProductById(1L);

        // Проверка результатов
        Assertions.assertEquals(product, actualProduct);
    }

    @Test
    public void testFindAllProduct() {
        // Подготовка заглушки
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "M300", 100));
        products.add(new Product(2L, "M500", 200));

        Mockito.when(productRepository.findAll()).thenReturn(products);

        // Выполнение теста
        List<Product> actualProducts = productService.findAllProduct();

        // Проверка результатов
        Assertions.assertEquals(products, actualProducts);
    }

    @Test
    public void testDeleteProduct() {
        // Подготовка заглушки
        Mockito.doNothing().when(productRepository).deleteById(1L);

        // Выполнение теста
        productService.deleteProduct(1L);

        // Проверка результатов
        Mockito.verify(productRepository, Mockito.times(1)).deleteById(1L);
    }
}
package com.Eggur.controller;

import com.Eggur.model.Product;
import com.Eggur.service.ProductService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Data
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/")
    public String product(Model model){
        model.addAttribute("product", "aboba");
        return "index";
    }

    @GetMapping("/product")
    public String products(Model model){
        model.addAttribute("products", productService.findAllProduct());
        return "products";
    }
}

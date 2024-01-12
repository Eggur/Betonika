package com.Eggur.controller;

import com.Eggur.model.Suppliers;
import com.Eggur.service.SupplierService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Data
@RequiredArgsConstructor
public class SupplierController {

    private final SupplierService supplierService;

    @GetMapping("/suppliers")
    public String suppliers(Model model){
        model.addAttribute("supplier", supplierService.findAllSuppliers());
        return "suppliers";
    }

    @GetMapping("/suppliers/delete{id}")
    public String deleteSupplier(@PathVariable Long id){
        supplierService.deleteSupplier(id);
        return "redirect:/suppliers";
    }

    @GetMapping("/suppliers/creating")
    public String createSupplier(Model model){
        model.addAttribute("create", supplierService.findAllSuppliers());
        return "createSupplier";
    }

    @PostMapping("/suppliers/create")
    public String creationSupplier(Suppliers supplier){
        supplierService.createSupplier(supplier);
        return "redirect:/suppliers";
    }

}

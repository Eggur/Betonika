package com.Eggur.service;

import com.Eggur.model.Suppliers;
import com.Eggur.repo.SuppliersRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class SupplierService {

    private final SuppliersRepository suppliersRepository;

    public List<Suppliers> findAllSuppliers(){
        return suppliersRepository.findAll();
    }

    public void deleteSupplier(Long id){
        suppliersRepository.deleteById(id);
        System.out.println("Поставщик был успешно удален");
    }

    public void createSupplier(Suppliers supplier){
        suppliersRepository.save(supplier);
    }

    public List<Suppliers> suppliersList(){
        return suppliersRepository.findAll();
    }
}

package dev.steven.springboot.services;

import dev.steven.springboot.entities.Supplier;
import dev.steven.springboot.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService {

    @Autowired
    private SupplierRepository repository;

    @Override
    public List<Supplier> getAll() {
        return (List<Supplier>) repository.findAll();
    }

    @Override
    public Supplier getById(Long id) {
        return (Supplier) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Supplier supplier) {
        repository.save(supplier);
    }

}

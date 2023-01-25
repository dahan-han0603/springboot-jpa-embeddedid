package com.springboot.jpa.embeddedId.repository;

import com.springboot.jpa.embeddedId.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Optional<Product> findById(Long id);
}

package com.springboot.jpa.embeddedId.repository;

import com.springboot.jpa.embeddedId.entity.Product;
import com.springboot.jpa.embeddedId.entity.ProductMedia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.Optional;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@Sql(scripts = "classpath:data.sql")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductRepositoryTest {

    @Autowired private ProductRepository productRepository;

    @Test
    void findById() {
        Optional<Product> result = productRepository.findById(1L);
        Product product = result.get();
        assertThat(product).isNotNull();

//        Set<ProductMedia> productMedia = product.getProductMedia();
//        productMedia.stream().forEach(productMediaData -> System.out.println("productMediaData = " + productMediaData));
//
//        assertThat(productMedia.size()).isEqualTo(5);
    }
}
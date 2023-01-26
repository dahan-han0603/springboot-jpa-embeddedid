package com.springboot.jpa.embeddedId.repository;

import com.springboot.jpa.embeddedId.entity.Media;
import com.springboot.jpa.embeddedId.entity.ProductMedia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Sql(scripts = "classpath:data.sql")
@DataJpaTest(includeFilters = {
        @ComponentScan.Filter(Component.class)
})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductMediaRepositoryTest {

    @Autowired private ProductMediaRepository productMediaRepository;

    @Test
    void findByProductId() {
        List<ProductMedia> listOfProductId1 = productMediaRepository.findByProductId(1L);
        listOfProductId1.stream().forEach(productMedia -> System.out.println("listOfProductId1 = " + productMedia));

        List<ProductMedia> listOfProductId2 = productMediaRepository.findByProductId(2L);
        listOfProductId2.stream().forEach(productMedia -> System.out.println("listOfProductId2 = " + productMedia));

        assertThat(listOfProductId1.size()).isEqualTo(5);
        assertThat(listOfProductId2.size()).isEqualTo(6);
    }

    @Test
    void findByMediaId() {
        List<ProductMedia> result = productMediaRepository.findByMediaId(5L); // Dummy Data 상에서 Product 1, 2에 모두 포함되어 있는 Media
        result.stream().forEach(productMedia -> System.out.println("productMedia = " + productMedia));

        assertThat(result.size()).isEqualTo(2);



    }

    @Test
    void findProductMediaByMediaName() {
        List<ProductMedia> result = productMediaRepository.findProductMediaByMediaId(1L);
        result.stream().forEach(productMedia -> System.out.println("productMedia = " + productMedia));
    }

    @Test
    void findMediaByIdFromFindProductMedia() {
        Media result = productMediaRepository.findMediaByIdFromFindProductMedia(1L);
        System.out.println("result = " + result);
    }

}
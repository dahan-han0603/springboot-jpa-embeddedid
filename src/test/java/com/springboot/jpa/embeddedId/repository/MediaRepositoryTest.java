package com.springboot.jpa.embeddedId.repository;

import com.springboot.jpa.embeddedId.entity.Media;
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
class MediaRepositoryTest {

    @Autowired private MediaRepository mediaRepository;

    @Test
    void findById() {
        Optional<Media> result = mediaRepository.findById(5L);  // Dummy Data 상에서 Product 1, 2에 모두 포함되어 있는 Media

        Media media = result.get();
        assertThat(media).isNotNull();
//        Set<ProductMedia> productMedia = media.getProductMedia();
//        productMedia.stream().forEach(productMediaData -> System.out.println("productMediaData = " + productMediaData));
//
//        assertThat(productMedia.size()).isEqualTo(2);
    }
}
package com.springboot.jpa.embeddedId.repository;

import com.springboot.jpa.embeddedId.embeddable.ProductMediaKey;
import com.springboot.jpa.embeddedId.entity.ProductMedia;
import com.springboot.jpa.embeddedId.repository.dao.ProductMediaRepositoryDao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductMediaRepository extends CrudRepository<ProductMedia, ProductMediaKey>, ProductMediaRepositoryDao {
    List<ProductMedia> findByProductId(Long productId);
    List<ProductMedia> findByMediaId(Long mediaId);
}

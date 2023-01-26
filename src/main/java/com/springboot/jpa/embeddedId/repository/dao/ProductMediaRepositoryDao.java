package com.springboot.jpa.embeddedId.repository.dao;

import com.springboot.jpa.embeddedId.entity.Media;
import com.springboot.jpa.embeddedId.entity.ProductMedia;

import java.util.List;

public interface ProductMediaRepositoryDao {
    List<ProductMedia> findProductMediaByMediaId(Long id);

    Media findMediaByIdFromFindProductMedia(Long id);
}

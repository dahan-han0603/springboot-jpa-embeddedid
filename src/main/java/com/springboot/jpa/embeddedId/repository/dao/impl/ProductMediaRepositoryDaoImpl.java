package com.springboot.jpa.embeddedId.repository.dao.impl;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.springboot.jpa.embeddedId.entity.Media;
import com.springboot.jpa.embeddedId.entity.ProductMedia;
import com.springboot.jpa.embeddedId.repository.dao.ProductMediaRepositoryDao;

import static com.springboot.jpa.embeddedId.entity.QProductMedia.productMedia;
import static com.springboot.jpa.embeddedId.entity.QMedia.media;
import static com.springboot.jpa.embeddedId.entity.QProduct.product;

import java.util.List;

public class ProductMediaRepositoryDaoImpl implements ProductMediaRepositoryDao {

    private final JPAQueryFactory query;

    public ProductMediaRepositoryDaoImpl(JPAQueryFactory query) {
        this.query = query;
    }

    @Override
    public List<ProductMedia> findProductMediaByMediaId(Long id) {
        return query.selectFrom(productMedia).where(productMedia.product.id.eq(id)).fetch();
    }

    @Override
    public Media findMediaByIdFromFindProductMedia(Long id) {
        return query.select(media)
                .from(productMedia)
                .where(productMedia.media.id.eq(id))
                .fetchOne();
    }
}

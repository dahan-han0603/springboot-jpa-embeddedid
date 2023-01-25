package com.springboot.jpa.embeddedId.entity;

import com.springboot.jpa.embeddedId.embeddable.ProductMediaKey;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter @Setter @ToString
@NoArgsConstructor
@Entity
public class ProductMedia {

    @EmbeddedId
    ProductMediaKey id;

    @ManyToOne
    @MapsId("product_id") // XXX: IntelliJ 상에서 발생하는 오류로 `Cannot resolve attribute ` 출력. = 컴파일 오류가 아니다.
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    Product product;

    @ManyToOne
    @MapsId("media_id")
    @JoinColumn(name = "media_id")
    Media media;

    int sort;

    public ProductMedia(ProductMediaKey id, Product product, Media media, int sort) {
        this.id = id;
        this.product = product;
        this.media = media;
        this.sort = sort;
    }
}

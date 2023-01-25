package com.springboot.jpa.embeddedId.embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter @Setter
@NoArgsConstructor
@Embeddable
public class ProductMediaKey implements Serializable {

    @Column(name = "product_id")
    Long productId;

    @Column(name = "media_id")
    Long mediaId;

    public ProductMediaKey(Long productId, Long mediaId) {
        this.productId = productId;
        this.mediaId = mediaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductMediaKey that = (ProductMediaKey) o;
        return productId.equals(that.productId) && mediaId.equals(that.mediaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, mediaId);
    }
}

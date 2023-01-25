package com.springboot.jpa.embeddedId.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter @Setter @ToString(exclude = "productMedia")
@Entity
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "media")
    @MapKey(name = "id")
    Set<ProductMedia> productMedia;
}

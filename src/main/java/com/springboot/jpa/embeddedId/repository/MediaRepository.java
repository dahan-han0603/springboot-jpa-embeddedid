package com.springboot.jpa.embeddedId.repository;

import com.springboot.jpa.embeddedId.entity.Media;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MediaRepository extends CrudRepository<Media, Long> {
    Optional<Media> findById(Long id);
}

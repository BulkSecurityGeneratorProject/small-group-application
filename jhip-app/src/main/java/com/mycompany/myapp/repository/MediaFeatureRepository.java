package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.MediaFeature;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the MediaFeature entity.
 */
@SuppressWarnings("unused")
public interface MediaFeatureRepository extends JpaRepository<MediaFeature,Long> {

}

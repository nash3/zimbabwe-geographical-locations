package com.nashe.zimbabwe.geographical.locations.province;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProvinceRepository extends JpaRepository<Province, Long> {
    Optional<Province> findByName(final String name);
}

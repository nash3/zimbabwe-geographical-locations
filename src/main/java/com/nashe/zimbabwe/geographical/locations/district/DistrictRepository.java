package com.nashe.zimbabwe.geographical.locations.district;

import com.nashe.zimbabwe.geographical.locations.province.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DistrictRepository extends JpaRepository<District, Long> {
    Optional<District> findByName(final String name);

    List<District> findByProvince(final Province province);

    District save(final District district);
}

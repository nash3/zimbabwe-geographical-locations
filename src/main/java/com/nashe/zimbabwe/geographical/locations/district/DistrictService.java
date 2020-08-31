package com.nashe.zimbabwe.geographical.locations.district;

import com.nashe.zimbabwe.geographical.locations.province.Province;

import java.util.List;
import java.util.Optional;

public interface DistrictService {
    Optional<District> findByName(final String name);

    List<District> findByProvince(final Province province);

    District save(final District district);

    List<District> findAll();
}

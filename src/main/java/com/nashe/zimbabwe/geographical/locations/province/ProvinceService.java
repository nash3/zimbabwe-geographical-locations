package com.nashe.zimbabwe.geographical.locations.province;

import java.util.List;
import java.util.Optional;

public interface ProvinceService {

    Optional<Province> findByName(final String name);

    List<Province> findAll();

    Province save(final Province province);
}

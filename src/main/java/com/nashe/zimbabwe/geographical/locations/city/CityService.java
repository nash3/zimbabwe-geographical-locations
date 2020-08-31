package com.nashe.zimbabwe.geographical.locations.city;

import com.nashe.zimbabwe.geographical.locations.district.District;
import com.nashe.zimbabwe.geographical.locations.province.Province;

import java.util.List;

public interface CityService {
    List<City> findByDistrict(final District district);

    List<City> findByProvince(final Province province);

    List<City> findAll();

    City save(final City city);

}

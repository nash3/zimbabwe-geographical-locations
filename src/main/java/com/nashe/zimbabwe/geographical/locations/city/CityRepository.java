package com.nashe.zimbabwe.geographical.locations.city;

import com.nashe.zimbabwe.geographical.locations.district.District;
import com.nashe.zimbabwe.geographical.locations.province.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

    List<City> findByDistrict(final District district);

    List<City> findByProvince(final Province province);
}

package com.nashe.zimbabwe.geographical.locations.city;

import com.nashe.zimbabwe.geographical.locations.district.District;
import com.nashe.zimbabwe.geographical.locations.province.Province;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Override
    public List<City> findByDistrict(District district) {
        return cityRepository.findByDistrict(district);
    }

    @Override
    public List<City> findByProvince(Province province) {
        return cityRepository.findByProvince(province);
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }
}

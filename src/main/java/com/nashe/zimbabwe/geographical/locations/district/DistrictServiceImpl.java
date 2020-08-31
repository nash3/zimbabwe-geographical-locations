package com.nashe.zimbabwe.geographical.locations.district;

import com.nashe.zimbabwe.geographical.locations.province.Province;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;

    @Override
    public Optional<District> findByName(String name) {
        return districtRepository.findByName(name);
    }

    @Override
    public List<District> findByProvince(Province province) {
        return districtRepository.findByProvince(province);
    }

    @Override
    public District save(District district) {
        return districtRepository.save(district);
    }

    @Override
    public List<District> findAll() {
        return districtRepository.findAll();
    }
}

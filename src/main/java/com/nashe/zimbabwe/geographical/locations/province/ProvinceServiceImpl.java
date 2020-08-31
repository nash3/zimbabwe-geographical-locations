package com.nashe.zimbabwe.geographical.locations.province;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProvinceServiceImpl implements ProvinceService {

    private final ProvinceRepository provinceRepository;

    @Override
    public Optional<Province> findByName(String name) {
        return provinceRepository.findByName(name);
    }

    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province save(Province province) {
        return provinceRepository.save(province);
    }
}

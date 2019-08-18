package com.example.demo.service;

import com.example.demo.model.District;
import com.example.demo.model.Province;

import java.util.List;
import java.util.Optional;

public interface DistrictService {
    List<District> findAllDistrict();

    List<District> findAllDistrictByProvinceCode(String provinceCode);

    Optional<District> findById(Integer id);

    void save(District base);

    void remove(District base);
}

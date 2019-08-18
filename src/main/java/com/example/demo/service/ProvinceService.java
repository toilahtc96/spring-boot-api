package com.example.demo.service;

import com.example.demo.model.Province;

import java.util.List;
import java.util.Optional;

public interface ProvinceService {
    List<Province> findAllProvince();

    Optional<Province> findById(Integer id);

    void save(Province base);

    void remove(Province base);
}

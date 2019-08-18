package com.example.demo.service;

import com.example.demo.model.Base;
import com.example.demo.model.District;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictServiceImpl implements DistrictService {

    private DistrictRepository districtRepository;

    @Autowired
    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }


    @Override
    public List<District> findAllDistrict() {
        return null;
    }

    @Override
    public List<District> findAllDistrictByProvinceCode(String provinceCode) {
        return districtRepository.getLstDistrictByProvinceCode(provinceCode);
    }


    @Override
    public Optional<District> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(District base) {

    }

    @Override
    public void remove(District base) {

    }

}

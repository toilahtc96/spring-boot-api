package com.example.demo.service;

import com.example.demo.model.Province;
import com.example.demo.repository.DistrictRepository;
import com.example.demo.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    private ProvinceRepository provinceRepository;

    @Autowired
    public ProvinceServiceImpl(ProvinceRepository provinceRepository) {
        this.provinceRepository = provinceRepository;
    }


    @Override
    public List<Province> findAllProvince() {
        // TODO Auto-generated method stub
        return (List<Province>) provinceRepository.findAll();
    }


    @Override
    public Optional<Province> findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Province base) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Province base) {
        // TODO Auto-generated method stub

    }


}

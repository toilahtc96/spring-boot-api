package com.example.demo.repository;

import com.example.demo.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRespository extends CrudRepository<Province, Integer> {
}
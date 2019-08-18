package com.example.demo.repository;

import com.example.demo.model.District;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DistrictRepository extends CrudRepository<District,Integer> {

    @Query("select d from District  d where d.province_code = ?1")
    List<District> getLstDistrictByProvinceCode(String provinceCode);

}

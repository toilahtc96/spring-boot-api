package com.example.demo.service;

import com.example.demo.model.DataReportTest;
import com.example.demo.model.Province;

import java.util.List;
import java.util.Optional;

public interface DataReportTestService {
    List<DataReportTest> findAllDataReport();

    List<DataReportTest> findByCondition(String provinceCode,String districtCode);

    Optional<DataReportTest> findById(Integer id);

    void save(DataReportTest base);

    void remove(DataReportTest base);
}

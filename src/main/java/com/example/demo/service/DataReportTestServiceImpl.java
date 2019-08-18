package com.example.demo.service;

import com.example.demo.model.DataReportTest;
import com.example.demo.model.Province;
import com.example.demo.repository.DataReportTestRepository;
import com.example.demo.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataReportTestServiceImpl implements DataReportTestService {

    private DataReportTestRepository dataReportTestRepository;

    @Autowired
    public DataReportTestServiceImpl(DataReportTestRepository dataReportTestRepository) {
        this.dataReportTestRepository = dataReportTestRepository;
    }


    @Override
    public List<DataReportTest> findAllDataReport() {
        return null;
    }

    @Override
    public List<DataReportTest> findByCondition(String provinceCode,String districtCode) {
        return dataReportTestRepository.getLstReport(provinceCode,districtCode);
    }

    @Override
    public Optional<DataReportTest> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(DataReportTest base) {

    }

    @Override
    public void remove(DataReportTest base) {

    }
}

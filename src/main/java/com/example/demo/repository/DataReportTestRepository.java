package com.example.demo.repository;

import com.example.demo.model.DataReportTest;
import com.example.demo.model.District;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DataReportTestRepository extends CrudRepository<DataReportTest,Integer> {

    @Query("select d from DataReportTest  d where d.province_code = ?1 and d.district_code =?2")
    List<DataReportTest> getLstReport(String provinceCode,String districtCode);

}

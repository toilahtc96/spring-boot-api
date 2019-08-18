package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DataReportTest")
public class DataReportTest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String province_code;
	private String district_code;
	private String data_row_one;
	private String data_row_two;
	private String data_row_three;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvince_code() {
		return province_code;
	}

	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}

	public String getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}

	public String getData_row_one() {
		return data_row_one;
	}

	public void setData_row_one(String data_row_one) {
		this.data_row_one = data_row_one;
	}

	public String getData_row_two() {
		return data_row_two;
	}

	public void setData_row_two(String data_row_two) {
		this.data_row_two = data_row_two;
	}

	public String getData_row_three() {
		return data_row_three;
	}

	public void setData_row_three(String data_row_three) {
		this.data_row_three = data_row_three;
	}
}

package com.example.demo.form;

public class SearchForm {
    private String district;
    private String province;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "SearchForm{" +
                "district='" + district + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}

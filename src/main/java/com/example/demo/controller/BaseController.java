package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.form.OneForm;
import com.example.demo.form.SearchForm;
import com.example.demo.model.*;
import com.example.demo.service.DataReportTestService;
import com.example.demo.service.DistrictService;
import com.example.demo.service.ProvinceService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.BaseService;

@RestController
public class BaseController {
    private BaseService<Base> baseService;
    private ProvinceService provinceService;
    private DistrictService districtService;
    private DataReportTestService dataReportTestService;
    private static final Logger logger = LogManager.getLogger(BaseController.class);

    @Autowired
    public BaseController(BaseService<Base> baseService, ProvinceService provinceService, DistrictService districtService, DataReportTestService dataReportTestService) {
        this.baseService = baseService;
        this.provinceService = provinceService;
        this.districtService = districtService;
        this.dataReportTestService = dataReportTestService;
    }

    //    	@CrossOrigin(origins = "http://localhost:3001")
    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ResponseEntity<List<Base>> findAllBase() {
        List<Base> bases = baseService.findAllBase();
        if (bases == null || bases.isEmpty()) {
            logger.debug("bases is null or empty");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        logger.info("response bases to client OK");
        return new ResponseEntity<>(bases, HttpStatus.OK);
    }

    @RequestMapping(value = "/provinces", method = RequestMethod.GET)
    public ResponseEntity<List<Province>> display() {
        List<Province> lstProvince = provinceService.findAllProvince();
        if (lstProvince == null || lstProvince.isEmpty()) {
            logger.debug("bases is null or empty");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        logger.info("response bases to client OK Province", lstProvince.size());
        return new ResponseEntity<>(lstProvince, HttpStatus.OK);
    }

    //    /district/${id}
    @RequestMapping(value = "/district/{proviceCode}", method = RequestMethod.GET)
    public ResponseEntity<List<District>> getDistrict(@PathVariable("proviceCode") String proviceCode) {
        List<District> lstDistrict = districtService.findAllDistrictByProvinceCode(proviceCode);
        if (lstDistrict == null || lstDistrict.isEmpty()) {
            logger.info("bases is null or empty");
            return new ResponseEntity<>(new ArrayList<District>(), HttpStatus.NO_CONTENT);
        }
        logger.info("response bases to client OK lstDistrict" + lstDistrict.size());

        return new ResponseEntity<>(lstDistrict, HttpStatus.OK);
    }


    @RequestMapping(value = "/getLst", method = RequestMethod.POST)
    public ResponseEntity<List<DataReportTest>> getLstReport(@RequestBody SearchForm searchForm) {
        logger.info(searchForm.toString());
        List<DataReportTest> lstOneForm = dataReportTestService.findByCondition(searchForm.getProvince(),searchForm.getDistrict());
        if (lstOneForm == null || lstOneForm.isEmpty()) {
            logger.info("lstOneForm is null or empty");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        logger.info("response bases to client OK lstOneForm "+ lstOneForm.size());

        return new ResponseEntity<>(lstOneForm, HttpStatus.OK);
    }
    /*
     * @RequestMapping(value = "/products/{id}", method = RequestMethod.GET,
     * produces = MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<Product>
     * getProductById(
     *
     * @PathVariable("id") Integer id) { Optional<Product> product =
     * productService.findById(id);
     *
     * if (!product.isPresent()) { return new ResponseEntity<>(product.get(),
     * HttpStatus.NO_CONTENT); } return new ResponseEntity<>(product.get(),
     * HttpStatus.OK); }
     *
     * @RequestMapping(value = "/products", method = RequestMethod.POST) public
     * ResponseEntity<Product> createProduct(
     *
     * @RequestBody Product product, UriComponentsBuilder builder) {
     * productService.save(product); HttpHeaders headers = new HttpHeaders();
     * headers.setLocation(builder.path("/products/{id}")
     * .buildAndExpand(product.getId()).toUri()); return new
     * ResponseEntity<>(product, HttpStatus.CREATED); }
     *
     * @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT) public
     * ResponseEntity<Product> updateProduct(
     *
     * @PathVariable("id") Integer id,
     *
     * @RequestBody Product product) { Optional<Product> currentProduct =
     * productService .findById(id);
     *
     * if (!currentProduct.isPresent()) { return new
     * ResponseEntity<>(HttpStatus.NO_CONTENT); }
     *
     * currentProduct.get().setName(product.getName());
     * currentProduct.get().setPrice(product.getPrice());
     * currentProduct.get().setDescription(product.getDescription());
     *
     * productService.save(currentProduct.get()); return new
     * ResponseEntity<>(currentProduct.get(), HttpStatus.OK); }
     *
     * @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
     * public ResponseEntity<Product> deleteProduct(
     *
     * @PathVariable("id") Integer id) { Optional<Product> product =
     * productService.findById(id); if (!product.isPresent()) { return new
     * ResponseEntity<>(HttpStatus.NOT_FOUND); }
     * productService.remove(product.get()); return new
     * ResponseEntity<>(HttpStatus.NO_CONTENT); } }
     */

}

package com.example.demo.service;

import com.example.demo.model.Base;
import java.util.List;
import java.util.Optional;

public interface BaseService {
	List<Base> findAllBase();

	Optional<Base> findById(Integer id);

	void save(Base base);

	void remove(Base base);
}
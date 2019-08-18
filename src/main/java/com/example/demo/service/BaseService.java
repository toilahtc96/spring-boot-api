package com.example.demo.service;

import com.example.demo.model.Base;
import java.util.List;
import java.util.Optional;

public interface BaseService<T> {
	List<T> findAllBase();

	List<T> findAllT();

	Optional<T> findById(Integer id);

	void save(T base);

	void remove(T base);
}
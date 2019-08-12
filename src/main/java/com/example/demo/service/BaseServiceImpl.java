package com.example.demo.service;

import com.example.demo.model.Base;
import com.example.demo.repository.BaseRepository;
import com.example.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BaseServiceImpl implements BaseService {

	private BaseRepository baseRepository;

	@Autowired
    public BaseServiceImpl (BaseRepository baseRepository){
        this.baseRepository = baseRepository;
    }

	@Override
	public List<Base> findAllBase() {
		// TODO Auto-generated method stub
		return (List<Base>) baseRepository.findAll();
	}

	@Override
	public Optional<Base> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Base base) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Base base) {
		// TODO Auto-generated method stub

	}

}

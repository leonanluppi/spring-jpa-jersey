package br.com.cinq.spring.data.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.repository.CityRepository;
import br.com.cinq.spring.data.sample.service.CityService;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

	@Override
	@Transactional
	public Iterable<City> findAll() {
		return cityRepository.findAll();
	}

	@Override
	public List<City> findCitiesByCountryName(String name) {
		name = name.toLowerCase();
		return cityRepository.findByCountryName(name);
	}
}

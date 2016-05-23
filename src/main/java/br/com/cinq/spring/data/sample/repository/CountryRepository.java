package br.com.cinq.spring.data.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cinq.spring.data.sample.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
	
	//Using spring data keywords
	List<Country> findByNameContainingIgnoreCase(String name);
	
}
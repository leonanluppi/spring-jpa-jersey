package br.com.cinq.spring.data.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.entity.Country;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
	//Using spring data keywords
	List<City> findByCountry(Country country);

	//Using spring named parms and JPQL query
	@Query(value = "select ci from City ci join ci.country co where lower(ci.country.name) like %:name%")
	List<City> findByCountryName(@Param("name") String name);
}

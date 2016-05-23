package br.com.cinq.spring.data.sample.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Leonan Luppi
 * 
 */
@Entity
@Table(name = "city")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;

	public City() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
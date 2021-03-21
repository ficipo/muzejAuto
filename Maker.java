package com.example.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maker")
public class Maker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int makerId;
	
	@Column(name = "name")
	private String makerName;
	
	@Column(name = "country_id")
	private int countryId;
	
	@ManyToOne
	@JoinColumn(name = "country_id", referencedColumnName = "id")
	private Country country;
	
	@OneToMany(mappedBy = "maker")
	private List<Car> carList;
	

}

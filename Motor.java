package com.example.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "motor")
public class Motor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int motorId;
	
	@Column(name = "name")
	private String motorName;
	
	@Column(name = "power")
	private int power;
	
	@Column(name = "torque")
	private int torque;
	
	@OneToMany(mappedBy = "motor")
	private List<Car> carList;
	
	@Enumerated(EnumType.STRING)
	private Type motorType;
	
	
}

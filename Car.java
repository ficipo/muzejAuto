package com.example.demo;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int carId;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "manufacture_date")
	@Temporal(TemporalType.DATE)
	private Date manufactureDate;
	
	@Column(name = "maker_id")
	private int makerId;
	
	@Column(name = "owner_id")
	private int ownerId;
	
	@Column(name = "motor_id")
	private int motorId;
	
	
	@ManyToOne
	@JoinColumn(name = "maker_id",referencedColumnName = "id")
	private Maker maker;
	

	@ManyToOne
	@JoinColumn(name = "owner_id",referencedColumnName = "id")
	private Owner owner;
	

	@ManyToOne
	@JoinColumn(name = "motor_id",referencedColumnName = "id")
	private Motor motor;
	

}

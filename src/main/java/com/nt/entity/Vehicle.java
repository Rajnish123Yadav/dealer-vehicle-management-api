package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NonNull;


@Entity
@Table(name="JPA_VehicleDL_Tab1")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="vehicle_Model")
    private String model;
    
    @Column(name="vehicle_Price")
    private Double price;

    @Enumerated(EnumType.STRING)
    @Column(name="vehicle_Status")
    private VehicleStatus status;

    @ManyToOne
    @JoinColumn(name = "dealer_id", nullable = false)
    private Dealer dealer;

    //ALLArgsConstructor...
	public Vehicle(Long id, String model, Double price, VehicleStatus status, Dealer dealer) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.status = status;
		this.dealer = dealer;
	}
	
	//Require ArgsConstructor...
	public Vehicle(String model, Double price, VehicleStatus status, Dealer dealer) {
		super();	
		this.model = model;
		this.price = price;
		this.status = status;
		this.dealer = dealer;
	}
	
	//NoArgConstructor...
	public Vehicle() {	 }

	//Getter Methods...
	public Long getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public Double getPrice() {
		return price;
	}

	public VehicleStatus getStatus() {
		return status;
	}

	public Dealer getDealer() {
		return dealer;
	}

	
	//Setter Methods...
	public void setId(Long id) {
		this.id = id;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setStatus(VehicleStatus status) {
		this.status = status;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	//ToString Method...
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", "
				+ "model=" + model + ", "
				+ "price=" + price + ", "
				+ "status=" + status + ", "
				+ "dealer="+ dealer + "]";
	}
	
}

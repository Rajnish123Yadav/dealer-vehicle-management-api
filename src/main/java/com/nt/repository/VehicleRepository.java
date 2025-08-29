package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.SubscriptionType;
import com.nt.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	 @Query("SELECT v FROM Vehicle v WHERE v.dealer.subscriptionType = :subscriptionType")
	    List<Vehicle> findByPremiumDealers(SubscriptionType subscriptionType);
}

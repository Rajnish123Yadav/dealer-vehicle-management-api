package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.SubscriptionType;
import com.nt.entity.Vehicle;
import com.nt.repository.VehicleRepository;

import lombok.RequiredArgsConstructor;

@Service
public class VehicleService {
	
	@Autowired
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
	}

    
	public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).orElseThrow();
    }

    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        Vehicle existing = getVehicleById(id);
        existing.setModel(vehicle.getModel());
        existing.setPrice(vehicle.getPrice());
        existing.setStatus(vehicle.getStatus());
        existing.setDealer(vehicle.getDealer());
        return vehicleRepository.save(existing);
    }

    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    public List<Vehicle> getVehiclesByPremiumDealers() {
        return vehicleRepository.findByPremiumDealers(SubscriptionType.PREMIUM);
    }
}

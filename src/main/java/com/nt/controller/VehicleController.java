package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nt.entity.Vehicle;
import com.nt.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

	@Autowired
    private final VehicleService vehicleService;
	
	
	//RequiredArgsConstructor...
    public VehicleController(VehicleService vehicleService) {
		super();
		this.vehicleService = vehicleService;
	}

	@PostMapping("/saveVehicle")
    public ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle) {
        Vehicle saved = vehicleService.saveVehicle(vehicle);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/findAllVehicles")
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        return ResponseEntity.ok(vehicleService.getAllVehicles());
    }

    @GetMapping("/findVehicleById/{id}")
    public ResponseEntity<Vehicle> getVehicle(@PathVariable Long id) {
        Vehicle v = vehicleService.getVehicleById(id);
        if (v == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(v);
    }

    @PutMapping("/updateVehicleById/{id}")
    public ResponseEntity<Vehicle> updateVehicle(@PathVariable Long id, @RequestBody Vehicle vehicle) {
        Vehicle updated = vehicleService.updateVehicle(id, vehicle);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/deleteVehicleById/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/premium")
    public ResponseEntity<List<Vehicle>> getPremiumDealerVehicles() {
        return ResponseEntity.ok(vehicleService.getVehiclesByPremiumDealers());
    }
}

package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nt.entity.Dealer;
import com.nt.service.DealerService;


@RestController
@RequestMapping("/api/dealers")
public class DealerController {

	@Autowired
    private final DealerService dealerService;

	//RequiredArgsConstructor...
    public DealerController(DealerService dealerService) {
		super();
		this.dealerService = dealerService;
		
	}

    @PostMapping("/saveDealer")
    public ResponseEntity<Dealer> createDealer(@RequestBody Dealer dealer) {
        Dealer saved = dealerService.saveDealer(dealer);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/findAllDealers")
    public ResponseEntity<List<Dealer>> getAllDealers() {
        return ResponseEntity.ok(dealerService.getAllDealers());
    }

    @GetMapping("/findDealerById/{id}")
    public ResponseEntity<Dealer> getDealer(@PathVariable Long id) {
        Dealer d = dealerService.getDealerById(id);
        if (d == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(d);
    }

    @PutMapping("/updateDealerById/{id}")
    public ResponseEntity<Dealer> updateDealer(@PathVariable Long id, @RequestBody Dealer dealer) {
        Dealer updated = dealerService.updateDealer(id, dealer);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/deleteDealerById/{id}")
    public ResponseEntity<Void> deleteDealer(@PathVariable Long id) {
        dealerService.deleteDealer(id);
        return ResponseEntity.noContent().build();
    }
}

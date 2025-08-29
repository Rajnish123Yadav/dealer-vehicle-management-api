package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Dealer;
import com.nt.repository.DealerRepository;

import lombok.RequiredArgsConstructor;

@Service
public class DealerService {
	
	@Autowired
    private final DealerRepository dealerRepository;

    public DealerService(DealerRepository dealerRepository) {
		super();
		this.dealerRepository = dealerRepository;
	}
    

	public Dealer saveDealer(Dealer dealer) {
        return dealerRepository.save(dealer);
    }

    public List<Dealer> getAllDealers() {
        return dealerRepository.findAll();
    }

    public Dealer getDealerById(Long id) {
        return dealerRepository.findById(id).orElseThrow();
    }

    public Dealer updateDealer(Long id, Dealer dealer) {
        Dealer existing = getDealerById(id);
        existing.setName(dealer.getName());
        existing.setEmail(dealer.getEmail());
        existing.setSubscriptionType(dealer.getSubscriptionType());
        return dealerRepository.save(existing);
    }

    public void deleteDealer(Long id) {
        dealerRepository.deleteById(id);
    }
}

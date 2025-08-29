package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Dealer;

public interface DealerRepository extends JpaRepository<Dealer, Long> {

}

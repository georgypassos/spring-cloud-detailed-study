package com.study.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.microservices.currencyexchangeservice.controller.bean.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	
	public CurrencyExchange findByFromAndTo(String from, String to);
	
}

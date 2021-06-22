package com.study.microservices.currencyconversionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.microservices.currencyconversionservice.bean.CurrencyConversion;

public interface CurrencyConversionRepository extends JpaRepository<CurrencyConversion, Long> {

}

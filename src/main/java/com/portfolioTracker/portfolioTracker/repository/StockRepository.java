package com.portfolioTracker.portfolioTracker.repository;

import com.portfolioTracker.portfolioTracker.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}

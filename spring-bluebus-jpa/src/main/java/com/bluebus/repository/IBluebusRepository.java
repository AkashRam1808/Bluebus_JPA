package com.bluebus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluebus.model.Bluebus;
@Repository
public interface IBluebusRepository extends JpaRepository<Bluebus, Integer> {

	List<Bluebus> getBySourceAndDestinationAndCategory(String source, String destination, String category);
	List<Bluebus> getBySourceAndDestinationAndCostLessThanEqual(String source, String destination, double cost);
}

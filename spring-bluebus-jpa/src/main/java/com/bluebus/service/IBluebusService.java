package com.bluebus.service;

import java.util.List;

import com.bluebus.model.Bluebus;

public interface IBluebusService {
	
	void addBus(Bluebus bus);
	void updateBus(Bluebus bus);
	void deleteBus(int busNumber);
	Bluebus getById(int busNumber);
	
	List<Bluebus> getByCategory(String source, String destination,String category);
	List<Bluebus> getByPrice(String source, String destination,double price);

}

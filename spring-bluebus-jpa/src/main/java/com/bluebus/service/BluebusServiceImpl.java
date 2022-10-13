package com.bluebus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebus.model.Bluebus;
import com.bluebus.repository.IBluebusRepository;
@Service
public class BluebusServiceImpl implements IBluebusService {

	private IBluebusRepository busRepository;
	
	@Autowired
	public void setBusRepository(IBluebusRepository busRepository) {
		this.busRepository = busRepository;
	}
	
	@Override
	public void addBus(Bluebus bus) {
		// TODO Auto-generated method stub
		busRepository.save(bus);
	}

	

	@Override
	public void updateBus(Bluebus bus) {
		// TODO Auto-generated method stub
		busRepository.save(bus);
	}

	@Override
	public void deleteBus(int busNumber) {
		// TODO Auto-generated method stub
		busRepository.deleteById(busNumber);
	}

	@Override
	public Bluebus getById(int busNumber) {
		// TODO Auto-generated method stub
		return busRepository.findById(busNumber).get();
	}

	@Override
	public List<Bluebus> getByCategory(String source, String destination, String category) {
		// TODO Auto-generated method stub
		return busRepository.getBySourceAndDestinationAndCategory(source, destination, category);
	}

	@Override
	public List<Bluebus> getByPrice(String source, String destination, double price) {
		// TODO Auto-generated method stub
		return busRepository.getBySourceAndDestinationAndCostLessThanEqual(source, destination, price);
	}

}

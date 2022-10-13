package com.bluebus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bluebus.model.Bluebus;
import com.bluebus.service.IBluebusService;

@SpringBootApplication
public class SpringBluebusJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBluebusJpaApplication.class, args);
	}

	@Autowired
	private IBluebusService busService;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate startDateLocal = LocalDate.parse("2022-10-20", formatter);
		
		formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime startDateTimeLocal = LocalDateTime.parse("2022-10-20 09:30", formatter);
		
		Bluebus bus =new Bluebus(7,"KSRTC",startDateLocal,"Non-Sleeper","Non-AC",1500,"Madurai","Mysuru",35,startDateTimeLocal);
		busService.addBus(bus);*/
		
		//busService.deleteBus(7);
		
		System.out.println("******Get by Id******");
		System.out.println(busService.getById(1));
		
		System.out.println("******Get by Category******");
		busService.getByCategory("Madurai", "Mysuru", "Sleeper").forEach(System.out::println);
		
		System.out.println("******Get by Price******");
		busService.getByPrice("Madurai", "Mysuru", 3000).forEach(System.out::println);
	}

}

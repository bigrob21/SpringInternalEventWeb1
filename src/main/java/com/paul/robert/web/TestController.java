package com.paul.robert.web;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	private AtomicInteger counter = new AtomicInteger(1);
	
	@GetMapping(value="/")
	public ResponseEntity<?> generateRadomNumbers(){
		if(counter.getAndIncrement() % 5 == 0) {
			//TODO: Figure out the publishing!
			throw new RuntimeException("Opps you lucked out and got a random error!!! Try again...");
		}
		List<Integer> numbers = new Random()
				.ints(10, 0, 1000)
				.mapToObj(Integer::new)
				.collect(Collectors.toList());
		logger.debug(">>> " + numbers);
		return ResponseEntity.ok(numbers);
	}
	
}

package com.paul.robert.event.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.paul.robert.event.ErrorEvent;

@Component
public class ErrorLogEventPublisher {

	@Autowired
	private ApplicationEventPublisher publisher;
	
	public void publish(Exception error) {
		ErrorEvent event = new ErrorEvent(error, error.getMessage());
		publisher.publishEvent(event);
	}
	
}

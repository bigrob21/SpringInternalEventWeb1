package com.paul.robert.event.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.paul.robert.event.ErrorEvent;

@Component
public class ErrorEventListener implements ApplicationListener<ErrorEvent> {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void onApplicationEvent(ErrorEvent event) {
		logger.error("*** " + event.getMessage() + "  ***");
	}

}

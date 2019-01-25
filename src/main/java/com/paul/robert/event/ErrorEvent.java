package com.paul.robert.event;

import org.springframework.context.ApplicationEvent;

public class ErrorEvent extends ApplicationEvent {

	private static final long serialVersionUID = -4358939047279135300L;
	private String message;
	
	public ErrorEvent(Object source) {
		super(source);
	}

	public ErrorEvent(Object source, String msg) {
		super(source);
		this.message = msg;
	}

	public String getMessage() {
		return this.message;
	}
	
}

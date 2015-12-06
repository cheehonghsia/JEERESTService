package com.zazu.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.zazu.controller.RegisterProcess;

@ApplicationPath("/resource")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		System.out.println("Resource Loaded..!");
		registerClasses(RegisterProcess.class);
	}

}

package com.zazu.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.zazu.controller.RegisterProcess;

@ApplicationPath("/resource")
public class AppConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		
		System.out.println("Application configuration loaded...");
		return new HashSet<Class<?>>(Arrays.asList(RegisterProcess.class));
	}

}

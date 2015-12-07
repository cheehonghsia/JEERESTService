package com.zazu.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.zazu.dao.PersonDao;

@Path("/person")
public class PersonService {
	
	@Inject
	private PersonDao dao;
	
	@GET
	@Path("/insanitycheck")
	public String insanityCheck() {
		return "OK";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRegisterDetails() {
		String msg = "You Clicked Get Request";

		return Response.ok().status(200).entity(msg).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRegisterDetails1() {

		String msg = "You Clicked Post Request";
		return Response.ok().status(200).entity(msg).build();

	}
}

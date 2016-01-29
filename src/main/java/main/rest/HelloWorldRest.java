package main.rest;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import main.model.HelloWorld;

@Named
@Path("/")
public class HelloWorldRest {
	
	private HelloWorld hello = new HelloWorld();
	
	@GET
	@Path("hello")
	@Produces(MediaType.APPLICATION_JSON)
	public String greeting(@QueryParam("name") String name ){
		hello.setHello(name);
		return hello.getHello();
	}

}
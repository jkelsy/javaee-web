package com.jkelsy.javaeemicro;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("recurso")
public class Recurso{
    @Inject
	@ConfigProperty(name="JAVA_HOME")
	String javaHome;
	
	@Inject
	@ConfigProperty(name="demo.inicio", defaultValue="valla")
    String demoInicio;
    
    @GET
    public String mostrar(){
       return "JAVA_HOME: "+javaHome+" demo.inicio: "+demoInicio;
    }
}
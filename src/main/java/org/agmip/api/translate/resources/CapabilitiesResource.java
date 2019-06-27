package org.agmip.api.translate.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.agmip.api.translate.api.Capabilities;

@Path("translate/capabilities")
@Produces(MediaType.APPLICATION_JSON)
public class CapabilitiesResource {
	public CapabilitiesResource() {}

	@GET
	public Capabilities getCapabilities() {
		return new Capabilities();
	}
}

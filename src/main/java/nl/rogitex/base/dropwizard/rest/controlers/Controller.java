package nl.rogitex.base.dropwizard.rest.controlers;

import nl.rogitex.base.dropwizard.rest.constants.RequestMappings;
import nl.rogitex.base.dropwizard.services.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path(RequestMappings.ENDPOINT_INFO_REQUEST)
public class Controller {
    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

    private Service service;

    public Controller() {
        service = new Service();
    }

    @POST
    @Path(RequestMappings.LOOKUP_REQUEST)
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String lookup(String json) {
        LOGGER.debug("Called lookup: " + json);
        String response = service.lookup(json);
        LOGGER.info("Send lookup response: " + response);
        return response;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getInfo() {
        LOGGER.debug("Called getInfo");
        String response = service.info();
        LOGGER.info("Send info response: " + response);
        return response;
    }

}

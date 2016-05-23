package br.com.cinq.spring.data.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Greet Service
 *
 * @author Adriano Kretschmer
 */
@Path("/")
public class SampleResource {
    Logger logger = LoggerFactory.getLogger(SampleResource.class);

    @Path("/a")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findCities(@QueryParam("country") String name) {
        logger.info("Retrieving cities for {}", name);

        return Response.ok().entity("Not implemented").build();
    }
}

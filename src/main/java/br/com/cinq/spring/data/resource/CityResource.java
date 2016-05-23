package br.com.cinq.spring.data.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import br.com.cinq.spring.data.sample.service.CityService;


/**
 * City Resource
 *
 * @author Leonan Luppi
 */
@RestController
@Path("/")
public class CityResource {
    Logger logger = LoggerFactory.getLogger(CityResource.class);

	@Autowired
	private CityService cityService;
	
    @Path("/cities")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response findCities(@QueryParam("country") String name) {
    	if (!StringUtils.hasLength(name)) {
        	logger.info("Retrieving all cities");
    		return Response.ok().entity(cityService.findAll()).build();
    	}
        
    	logger.info("Retrieving cities by country name");
        return Response.ok().entity(cityService.findCitiesByCountryName(name)).build();
    }
}

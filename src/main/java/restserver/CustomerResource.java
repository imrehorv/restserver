package restserver;

import java.util.UUID;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import restserver.model.Customer;

@Path("/customer")
public class CustomerResource {

	Logger logger=Logger.getLogger(CustomerResource.class.getName());
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response store(Customer customer)
	{
		logger.info("aaa2 store called customer:"+customer);
		customer.setId(UUID.randomUUID().getLeastSignificantBits());
		return Response.accepted().entity(customer).build();
	}
}

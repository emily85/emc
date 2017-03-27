package jerseyluntest;


import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("hello")
public class HelloJersey {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greed()
	{
		return "hello world";
	}
}

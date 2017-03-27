package jerseyluntest;

import javax.ws.rs.core.MultivaluedMap;

import org.testng.annotations.*;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class TestJersey {

	private String url = "http://localhost:8080/jerseyluntest/restapi/LunService";

    @Test
    public void testDelete() {
        Client client = Client.create();
        WebResource webResource = client.resource(url + "/deletelun/6700");
        ClientResponse response = webResource.delete(ClientResponse.class);
        
        System.out.println("Response for delete request: " + response.getStatus());
    }
    
    @Test
    public void testPut() {
        Client client = Client.create();
        WebResource webResource = client.resource(url + "/addlun");
        MultivaluedMap queryParams = new MultivaluedMapImpl();
        queryParams.add("size", "6706");
        queryParams.add("deviceinfo", "/dev/sdf3");
        queryParams.add("devicetype", "taps");
        ClientResponse response = webResource.queryParams(queryParams).put(ClientResponse.class, "foo:test");
        System.out.println("Response for put request: " + response.getStatus());
    }
}

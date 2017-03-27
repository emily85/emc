package jerseyluntest;

import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;


@Path("LunService")
public class LunService {

	private static Map<Integer, Lun> lunlist = new HashMap<Integer, Lun>();
	public static Integer index = 6700;
	public LunService() 
	{
		if(lunlist.size() == 0)
		{
			lunlist.put(index, new Lun(index++, 1024, "/dev/sda" , "disk"));
			lunlist.put(index, new Lun(index++, 2048, "/dev/sdb" , "disk : NTFS"));
			
		}
	}
	
	@GET
	@Path("/GetLunInfo/{id}") 
	@Produces(MediaType.APPLICATION_JSON)
	public Lun getInfo(@PathParam("id") Integer id)			
	{
		if(lunlist.containsKey(id))
			return lunlist.get(id);
		else
			return new Lun(000,000, "Null", "Null");
	}
	
	@GET
    @Path("/list")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Lun> getAllStudents() {
     List<Lun> luns = new ArrayList<Lun>();
	 luns.addAll(lunlist.values());
	 return luns;
	}
	
	@PUT
	@Path("/addlun")
	@Produces("text/plain")
	public String addlun(@QueryParam("size") Integer size, 
			@QueryParam("deviceinfo") String deviceinfo,
			@QueryParam("devicetype") String devicetype)
	{
		lunlist.put(index, new Lun(index++,size,deviceinfo,devicetype));
		return String.valueOf(index-1);
	}
	
	@DELETE
	@Path("/deletelun/{id}")
	@Produces("text/plain")
	public String removelun(@PathParam("id") Integer id)
	{
		Lun removed = lunlist.remove(id);
		if(removed == null ) return "failed remove.";
		else return "successfully remove.";
	}
	
	@GET
	@Path("/testLun") 
	@Produces(MediaType.APPLICATION_JSON)
	public Lun GetLunInfo()
	{
		Lun lun = new Lun();
		lun.setId(888);
		lun.setSize(1024);
		lun.setDevicetype("disk");
		lun.setDeviceinfo("devx");
		return lun;
		
		
	}
}

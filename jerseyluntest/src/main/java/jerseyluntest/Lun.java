package jerseyluntest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Lun {

	private Integer id;
	private Integer size;
	private String deviceinfo;
	private String devicetype;
	
	public Lun()
	{
		
	}
	public Lun(Integer id, Integer size, String deviceinfo, String devicetype)
	{
		super();
		this.id = id;
		this.size = size;
		this.deviceinfo = deviceinfo;
		this.devicetype = devicetype;
		
	}
	public String getDeviceinfo()
	{
		return deviceinfo;
		
	}
	
	public void setDeviceinfo(String deviceinfo)
	{
		this.deviceinfo=deviceinfo;
		
	}
	
	public String getDevicetype()
	{
		return devicetype;
		
	}
	
	public void setDevicetype(String devicetype)
	{
		this.devicetype=devicetype;
		
	}
	
	public Integer getId() 
	{
	        return id;
	}

	public void setId(Integer id) 
	{
	        this.id = id;
	}
	
	public Integer getSize() 
	{
	        return size;
	}

	public void setSize(Integer size) 
	{
	        this.size = size;
	}
}

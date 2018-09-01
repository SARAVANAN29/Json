import org.codehaus.jackson.map.ObjectMapper;

public class o2j {
	public static ObjectMapper om; 
	static {
		 om = new ObjectMapper();
		
	}
public  String obj2json(Object o1) throws Exception
{
	String s = "";
	s= om.writeValueAsString(o1);
	return s;
}
public  <T> T json2obj(String jstring, Class<T> cls) throws Exception
	{
		T thrlla = null;
	thrlla = om.readValue(jstring, cls);
	
	return thrlla;
	
}
}
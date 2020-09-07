package hashMapIterate18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterate 
{
	public static void main(String[] args) 
	{
		
	Map<String,Integer > m=new HashMap<String,Integer >();
	
	m.put("java", 1);
	m.put("j2ee", 2);
	m.put("jsp", 3);
	m.put("sql", 4);
	
	//System.out.println(m);
	
	Iterator<String> itr=m.keySet().iterator();
	while(itr.hasNext())
	{
		String val=itr.next();
		Integer i=m.get(val);
		System.out.println(val+"="+i);
		
	}

	
}
}
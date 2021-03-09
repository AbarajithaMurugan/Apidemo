package comapi;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ApiCreatejson {
	public static void main(String[] args) throws FileNotFoundException {
		JSONObject jsobj=new JSONObject();
		jsobj.put("source", "Athens");
		jsobj.put("Destination", "Singapore");
		jsobj.put("triptype", "2way");
		Map mp=new LinkedHashMap();
		mp.put("d1", "12-03-2021");
		mp.put("d2", "29-04-2021");
		jsobj.put("date",mp);
		JSONArray jsarray=new JSONArray();
		Map mp1=new LinkedHashMap();
		mp1.put("name1", "abz");
		mp1.put("email", "@gmail");
		
		Map mp2=new LinkedHashMap();
		mp2.put("name2", "navin");
		mp2.put("email", "@yahoo");
		jsarray.add(mp1);
		jsarray.add(mp2);
		jsobj.put("passengers", jsarray);
		Set entrySet = jsobj.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
			
		}
		PrintWriter pw=new PrintWriter("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\ApiClass\\src\\test\\resources\\write.json");
		pw.write(jsobj.toJSONString());
		pw.flush();
		
	}

}

package comapi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiDay1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
			JSONParser js=new JSONParser();
		Object obj=	js.parse(new FileReader("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\ApiClass\\src\\test\\resources\\airlineInputs.json"));
		JSONObject jsobj=(JSONObject)obj;
		String s=(String)jsobj.get("source");
		System.out.println(s);
		String s1=(String)jsobj.get("Destination");
		System.out.println(s1);
		String s2=(String)jsobj.get("triptype");
		System.out.println(s2);
		Map s3=(Map)jsobj.get("date");
		System.out.println(s3);
		String dat=(String)s3.get("d2");
		System.out.println(dat);
		List li=(List)jsobj.get("passengers");
		System.out.println(li);
		Map st=(Map)li.get(1);
		System.out.println(st);
		String stmail=(String)st.get("email");
		System.out.println(stmail);
	}

}

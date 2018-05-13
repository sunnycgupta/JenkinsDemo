package jennkinsDemo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class JenkinsDemo {

	@Test
	public  void gulu() throws IOException {
		
		HashMap<Integer,String> sun=new HashMap<Integer,String>();
		sun.put(1, "Sunny1");
		sun.put(2, "Sunny1");
		sun.put(3, "Sunny3");
		sun.put(4, "Sunny4");
		
		for(Map.Entry<Integer, String> k:sun.entrySet()){
			System.out.println(k.getKey() +" the corresponding value " +k.getValue());
		}
		
		
		System.out.println(sun.get(1));
	}
}

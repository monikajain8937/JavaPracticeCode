package JavaPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap {

	public static void main(String[] args) {
		//HashMap<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(100,"Monika");
		map.put(200, "Neha");
		map.put(300, "Surendra");
		map.put(400, "Sarika");
		map.put(null, "Selenium");
		map.put(500, null);
		System.out.println(map.size());
		System.out.println(map.get(100));
		boolean flag = map.containsKey("Neha");
		System.out.println(flag);
		map.forEach((k,v)-> System.out.println(k+":"+v));
//		HashSet<String> set= new HashSet<>();
//		set.add("Monika");
//		set.add("Surendra");
//		set.add("Neha");
//		System.out.println(set);
		System.out.println("***********************");
		
		Map<String, String> map1 = new TreeMap<String, String>();
		map1.put("Monika", "ahh");
		map1.put("Neha", "chh");
		map1.put( "Surendra", "fhh");
		map1.put("Sarika", "bhh");
		map1.put("Selenium", "dhh");
		map1.put("ah", "rhh");
		map1.forEach((s,h)-> System.out.println(s+":"+h));
		
		System.out.println("***********************");
		
		
		
		
	}
	

}

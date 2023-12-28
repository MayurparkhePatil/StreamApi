package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm= new HashMap<>();
		hm.put("Mayur", 123123123);
		hm.put("Sai", 456456456);
		hm.put("Mahi", 789789789);
		hm.put("Sai", 56456);
		
		System.out.println(hm.get("Mahi"));
		System.out.println(hm.remove("Sai",56456));
		System.out.println(hm);
		Set<String>set=hm.keySet();
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {;
		String s=itr.next();
		//System.out.println(hm.get(s));
		}
	}

}

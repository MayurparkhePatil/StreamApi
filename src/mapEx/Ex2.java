package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex2 {
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("aaa", 123);
		hm.put("bbb", 4556);
		hm.put("ccc",789);
		System.out.println(hm);
		
		Set<String> set=hm.keySet();
		
		for(String str:set) {
			System.out.println(str+" "+hm.get(str));
		}
		
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s+" "+hm.get(s));
		}
	}

}

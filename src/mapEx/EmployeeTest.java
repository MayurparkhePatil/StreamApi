package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeTest {

	public static void main(String[] args) {
		
		HashMap<Integer,Employee> hm= new HashMap<>();
		
		Employee e1=new Employee(1,15000,"aaa");
		Employee e2=new Employee(2,25000,"bbb");
		Employee e3=new Employee(3,35000,"ccc");
		
		
		hm.put(e2.eid, e2);
		hm.put(e3.eid, e3);
		hm.put(e1.eid, e1);
		System.out.println(hm);
		
		Set<Integer> set=hm.keySet();
		
		Iterator<Integer>itr=set.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			System.out.println(i+" "+hm.get(i));
		}
		
		for(Integer ss:set)
		{
			System.out.println(ss+" "+hm.get(ss));
		}
		
		///Updating values 
		Employee emp=hm.get(2);
		emp.salary=2000;
		emp.name="Mayur";
		System.out.println(emp);
		
		Employee emp5=hm.put(3, new Employee(3,30000,"Sai"));
		System.out.println(emp5);
		
		System.out.println(hm);
		
		//for shorting
		
		System.out.println(new TreeMap(hm));
		
		

	}

}

package mapEx;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,Employee>hm=new HashMap<Integer,Employee>();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter how many object add ");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			int eid=sc.nextInt();
			System.out.println("Enter Employee id.salary,name ");
			hm.put(eid, new Employee(eid,sc.nextInt(),sc.next()));
			
		}
		System.out.println(hm);
	}

}

package WildCard;

import java.util.ArrayList;

public class WildCardEx2 {

	 void show(ArrayList<?extends Object> al)
	{
		System.out.println(al);
	}
	public static void main(String[] args) {
		WildCardEx2 wd = new WildCardEx2();
		
		ArrayList<Exception>al=new ArrayList<Exception>();
		wd.show(al);
		
		ArrayList<Integer>al2=new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		wd.show(al2);
		
		ArrayList<String>al3=new ArrayList<String>();
		al3.add("Mayur");
		al3.add("Parkhe");
		wd.show(al3);
		
	}
}

package WildCard;

import java.util.ArrayList;

public class WildCardEx3 {

	//when we use wildCard(?),then extends keyword replace in impliments keywords
	static void show(ArrayList<?extends Comparable> al)
	{
		//all classes will work here as every class extends Object class
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer>al= new ArrayList<Integer>();
		show(al);
		//All wrapper class implements Comparable Interface
		
ArrayList<String>al2= new ArrayList<String>();
		
		show(al2);
	}
	
	
}

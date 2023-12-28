package WildCard;

import java.util.ArrayList;

public class WildCardEx {
	
	static void show(ArrayList<? extends Number>al) {
	//while declaring arguments only use Wild card  
		
	}

	public static void main(String[] args) {
		
		ArrayList<Float>al=new ArrayList<Float>();
	
		show(al);
		
		//only those classes object  are allowed ,who are chilled class of Number class
		
		ArrayList<Integer>al1=new ArrayList<Integer>();
		
		show(al1);
		
      //  ArrayList<String>al2=new ArrayList<String>();
		
		//show(al2);
        //String Does not extend Number, hence it is not allowed
		
			}
}

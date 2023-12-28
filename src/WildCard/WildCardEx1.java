package WildCard;

import java.util.ArrayList;

public class WildCardEx1 {
	
	static void show(ArrayList<? super RuntimeException> arrayList) {
		
	}
	public static void main(String[] args) {
		
		ArrayList<Exception> al = new ArrayList<Exception>();
		show(al);
		//Exception is a super class of NullpointerException
		
		
		//ArrayList<NullPointerException> al2 = new ArrayList<NullPointerException>();
		//show(al2);
		//this condition NullPointerException is not a super of RuntimeException
		//it will gives error
		
		
	}
}

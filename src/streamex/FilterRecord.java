package streamex;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterRecord {

	public static void main(String[] args) {
		
		Stream<Integer> str=Arrays.asList(1,2,3,4,5,6).stream();
		Stream<Integer> str2=str.filter(integer->integer%2==0);
		str2.forEach(i->System.out.println(i));
		
		Arrays.asList("aaa","bbb","ccc","ddd","eee").stream().filter(a->a.startsWith("a")).forEach(i->System.out.println(i));

	}

}

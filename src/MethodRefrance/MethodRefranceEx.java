package MethodRefrance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// method refrance is used to use predefine functionality
public class MethodRefranceEx {
	public static void main(String[] args) {
		List<String> al = Arrays.asList("java", "Angular", "core", "selenium");
		System.out.println(al);

		Stream<String> str = al.stream();
		Stream<Integer> str1 = str.map(string -> string.length());
		// str1.forEach(System.out::println);
		// str1.forEach(Integer->System.out.println(Integer));
		str1.forEach(integer -> System.out.println(integer * 2));
	}
}

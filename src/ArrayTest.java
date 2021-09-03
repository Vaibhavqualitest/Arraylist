import java.util.*;
public class ArrayTest {
	public static void main(String[] args) {
		System.out.println("Create operations");
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(1);
		myNumbers.add(2);
		myNumbers.add(3);
		myNumbers.add(4);
		System.out.println("Read Operations");
		for(int i: myNumbers) {
			System.out.println(i);
		}
		System.out.println("Remove Operations");
		myNumbers.remove(2);
		System.out.println("now numbers are");
		for(int i: myNumbers) {
			System.out.println(i);
		}
		System.out.println("Updated element");
		myNumbers.set(1, 122);
		System.out.println("now numbers are");
		for(int i: myNumbers) {
			System.out.println(i);
		}
		System.out.println(myNumbers);
	}

}

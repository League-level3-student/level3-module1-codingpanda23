package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
			ArrayList <String> shades = new ArrayList<String>();
		//2. Add five Strings to your list
			shades.add("azure");
			shades.add("navy");
			shades.add("lapis");
			shades.add("cerulean");
			shades.add("aegean");
		//3. Print all the Strings using a standard for-loop
			/*for (int i = 0; i < shades.size(); i++) {
				String s = shades.get(i);
				System.out.println(s);
			}
			System.out.println("\n");*/
		//4. Print all the Strings using a for-each loop
			/*for (String string : shades) {
				System.out.println(string);
			}
			System.out.println("\n");*/
		//5. Print only the even numbered elements in the list.
			/*for (int i = 1; i < shades.size(); i+=2) {
				String g = shades.get(i);
				System.out.println(g);
			}*/
		//6. Print all the Strings in reverse order.
			/*for (int i = 4; i < shades.size(); i--) {
				String s = shades.get(i);
				System.out.println(s);
			}*/
		//7. Print only the Strings that have the letter 'e' in them.
			/*for (int i = 0; i < shades.size(); i++) {
				String t = shades.get(i);
				if (t.contains("e")) {
					System.out.println(t);
				}
			}*/
	}
}

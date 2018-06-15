import java.util.Scanner;
import java.util.ArrayList;

public class StringManipulatorApp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
	
		System.out.print("Enter a string: ");
		String str1 = sc.nextLine();
		list.add(str1);
		Manip manipulate = new Manip(str1);
	
		System.out.println("Your reversed string is: " + manipulate.reverse(str1));
		manipulate.forEach(list);
		manipulate.bracket(list);
		System.out.println("Your string has " + manipulate.vowels(str1) + " vowels and contains " + manipulate.words(str1) + " word(s).");
		System.out.println("Your string with no spaces: " + manipulate.removeSpace(str1));
		System.out.println("Uppercase String: " + str1.toUpperCase());
		System.out.println("Lowercase String: " + str1.toLowerCase());
		System.out.println("Your secret string: " + manipulate.secret(str1));
	}
}

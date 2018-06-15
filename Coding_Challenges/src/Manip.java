import java.util.ArrayList;
import java.util.Random;
public class Manip {
	private String reverse = "";
	private int vowelCount;
	
	Manip(String text) {
		System.out.println();
		System.out.println("You entered: " + text);
	}
	
	public String reverse(String text) {
		for(int i=text.length()-1; i>=0; i--) {
			reverse += text.charAt(i);
		}
		return(reverse);
	}
	
	public ArrayList<String> forEach(ArrayList<String> list) {
		System.out.print("Printed using an ArrayList and for-each loop: ");
		for(String listArray : list) {
			System.out.print(listArray);
		}
		return(list);
	}
	
	public void bracket(ArrayList<String> list) {
		System.out.println();
		System.out.print("Bracket form: ");
		System.out.println(list);
	}
	
	public int vowels(String text) {
		if ((text == null) || (text.isEmpty())) { 
			return(0); 
		} 
		for(int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			if( (c==('A'))||(c==('a')) ||
		        (c==('E'))||(c==('e')) ||
		        (c==('I'))||(c==('i')) ||	
		        (c==('O'))||(c==('o')) ||	
		        (c==('U'))||(c==('u')) )
				vowelCount++;
		}
		return(vowelCount);
	}
	
	public int words(String text) {
		if ((text == null) || (text.isEmpty())) { 
			return(0); 
		} 
		String[] words = text.split("\\s+"); 
		return(words.length); 
	}
	
	public String removeSpace(String text) {
		return(text.replaceAll("\\s+", ""));
	}
	
	public String secret(String text) {
		String sec="";
		Random rand = new Random();
		
		for(int i=0;i<text.length();i++) {
			sec+=(char)((text.charAt(i))+rand.nextInt(50)); //Casts your string into characters and adds a random integer
		}													//ranging from 0-49 to each character in your string.
		return(sec);
	}
}

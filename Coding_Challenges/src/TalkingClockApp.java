/**
 * Challenge: Talking Clock
 * Difficulty: Easy
 * @version 1.0
 * @author Kevin Black <kevinandrewblack@live.com>
 * Started: June 11, 2018 (Satisfactory)
 * 
 * Comments: I wonder if there's an easier way to handle
 * the switch cases. And if there's some Java API method 
 * that can convert an integer to its English word equivalent.
 * 
 */

import java.util.Scanner;

class TalkingClockApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a time (XX:XX): ");
		String time = new Scanner(System.in).nextLine();
		String format = "(\\d?\\d:\\d\\d)"; //Standard clock format e.g. X:XX or XX:XX.
		
		if(time.matches(format)) {
			String[] clock = time.split(":"); //Puts the [XX]:[XX] parts of the clock into an array.
			if((clock[0].equals("00"))&&(clock[1].equals("00"))) {	//Midnight if clock is 00:00.
				System.out.println("It is midnight.");
				System.exit(0);
			}
			else if(clock[0].equals("12") && clock[1].equals("00")) { //Noon if clock is 12:00.
				System.out.println("It is noon.");
				System.exit(0);
			}
			else System.out.println("It is " + hrTalk(clock) + minO(clock) + minTalk(clock) + amORpm(clock) + "."); //Clock speech.
		}
		else {
			System.out.println("Incorrect format for clock.");
		}
	}
	
	public static String hrTalk(String[] set) {		
		switch(Integer.parseInt(set[0])) { //Various cases to handle the [XX]:XX (hr) part of the clock.
		case 0:  return("twelve");case 1:  return("one"); case 2:  return("two");case 3:  return("three");
		case 4:  return("four");  case 5:  return("five");case 6:  return("six");case 7:  return("seven");
		case 8:  return("eight"); case 9:  return("nine");case 10: return("ten");case 11: return("eleven");
		case 12: return("twelve");case 13: return("one"); case 14: return("two");case 15: return("three");
		case 16: return("four");  case 17: return("five");case 18: return("six");case 19: return("seven");
		case 20: return("eight"); case 21: return("nine");case 22: return("ten");case 23: return("eleven");
		default: 
			System.out.println("Incorrect hours.");
			System.exit(0);
		}
		return(null);
	}
	
	public static String minTalk(String[] set) {
		switch(Integer.parseInt(set[1])) {	//Various cases to handle the XX:[XX] (min) part of the clock.
		case 0:  return(""); 			case 1:  return(" one"); 	   case 2: return(" two");   		case 3: return(" three"); 		 case 4: return(" four");
		case 5:  return(" five"); 		case 6:  return(" six"); 	   case 7: return(" seven"); 		case 8: return(" eight"); 		 case 9: return(" nine");
		case 10: return(" ten"); 		case 11: return(" eleven");    case 12: return(" twelve");  	case 13: return(" thirteen"); 	 case 14: return(" fourteen");
		case 15: return(" fifteen"); 	case 16: return(" sixteen");   case 17: return(" seventeen"); 	case 18: return(" eightteen"); 	 case 19: return(" nineteen");
		case 20: return(" twenty"); 	case 21: return(" twenty-one");case 22: return(" twenty-two"); 	case 23: return(" twenty-three");case 24: return(" twenty-four");
		case 25: return(" twenty-five");case 26: return(" twenty-six");case 27: return("twenty-seven");	case 28: return("twenty-eight"); case 29: return("twenty-nine");
		case 30: return(" thirty"); 	case 31: return(" thirty-one");case 32: return(" thirty-two"); 	case 33: return(" thirty-three");case 34: return(" thirty-four");
		case 35: return(" thirty-five");case 36: return(" thirty-six");case 37: return(" thirty-seven");case 38: return(" thirty-eight");case 39: return(" thirty-nine");
		case 40: return(" fourty"); 	case 41: return(" fourty-one");case 42: return(" fourty-two");  case 43: return(" fourty-three");case 44: return(" fourty-four");
		case 45: return(" fourty-five");case 46: return(" fourty-six");case 47: return(" fourty-seven");case 48: return(" fourty-eight");case 49: return(" fourty-nine");
		case 50: return(" fifty"); 		case 51: return(" fifty-one"); case 52: return(" fifty-two");   case 53: return(" fifty-three"); case 54: return(" fifty-four");
		case 55: return(" fifty-five"); case 56: return(" fifty-six"); case 57: return(" fifty-seven"); case 58: return(" fifty-eight"); case 59: return(" fifty-nine");
		default:
			System.out.println("Incorrect minutes.");
			System.exit(0);
		}
		return(null);
	}
	
	public static String amORpm(String[] set) {
		int temp=Integer.parseInt(set[0]);	//Converting the [XX]:XX part of the clock to an integer.
		if((temp>=0)&&(temp<=11)) return(" am"); //If the hour is between midnight and eleven, it is the am.
		else if((temp>=12)&&(temp<=23)) return(" pm"); //If the hour is between noon and eleven, it is the pm.
		else {
			System.out.println("Incorrect am/pm.");
			System.exit(0);
		}
		return(null);
	}
		
	public static String minO(String[] set) {
		int temp=Integer.parseInt(set[1]); //Converting the XX:[XX] part of the clock to an integer.
		if((temp>=1)&&(temp<=9)) return(" o'"); //If the minute is >=1 and <=9, add o' to the talking clock.
		else if((temp==0)||((temp>=10)&&(temp<=59))) return(""); //No o' if the minute is 0 or >=10 and <=59.
		else {
			System.out.println("Incorrect o'.");
			System.exit(0);
		}
		return(null);
	}
}

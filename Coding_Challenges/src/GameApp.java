import java.util.ArrayList;
import java.util.Scanner;

public class GameApp {	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		ArrayList<Weapon> inventory = new ArrayList<Weapon>();
		boolean inv_Status = true, start_Status = true;
		System.out.print("What is your name, adventurer?: ");
		String player_Name = new Scanner(System.in).nextLine();
		Scanner input = new Scanner(System.in);
		
		while(start_Status) {
			System.out.println("Choose a starting weapon: ");
			System.out.println("Dagger, Axe, Catalyst, Sword, Mace, Greatsword");
			String weapon_Choice = new Scanner(System.in).nextLine();
			switch(weapon_Choice) {
			case "Dagger":
				Weapon Dagger_I = new Weapon("Dagger I", 15, 10, 12, 16);
				inventory.add(Dagger_I);
				break;
			case "Axe":
				Weapon Axe_I = new Weapon("Axe I", 16, 9, 10, 15);
				inventory.add(Axe_I);
				break;
			case "Catalyst":
				Weapon Catalyst_I = new Weapon("Catalyst I", 7, 13, 14, 12);
				inventory.add(Catalyst_I);
				break;
			case "Sword":
				Weapon Sword_I = new Weapon("Sword I", 20, 7, 9, 12);
				inventory.add(Sword_I);
				break;
			case "Mace":
				Weapon Mace_I = new Weapon("Mace I", 17, 8, 10, 15);
				inventory.add(Mace_I);
				break;
			case "Greatsword":
				Weapon Greatsword_I = new Weapon("Greatsword I", 23, 6, 12, 9);
				inventory.add(Greatsword_I);
				break;
			default:
				start_Status = false;
			}
			break;
		}
		System.out.println("- " + player_Name + "'s Inventory and Weapons Management -");
		while(inv_Status) {
			System.out.println();
			System.out.println("1: Put a weapon in inventory");
			System.out.println("2: List inventory");
			System.out.println("3: Empty inventory");
			System.out.println("4: Exit simulator");
			System.out.println("5: Weapon index");
			System.out.println("6: Weapon removal");
			System.out.print("Which would you like to go to?: ");
			int choice = new Scanner(System.in).nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println();
			System.out.println("- Putting a weapon into your inventory -");
			System.out.print("What is the name of your weapon?: ");
			String name = new Scanner(System.in).nextLine();
			System.out.print("What is the ATK of your weapon?: ");
			//int ATK = new Scanner(System.in).nextInt();
			int ATK = input.nextInt();
			System.out.print("What is the DEF of your weapon?: ");
			//int DEF = new Scanner(System.in).nextInt();
			int DEF = input.nextInt();
			System.out.print("What is the INT of your weapon?: ");
			//int INT = new Scanner(System.in).nextInt();
			int INT = input.nextInt();
			System.out.print("What is the DEX of your weapon?: ");
			//int DEX = new Scanner(System.in).nextInt();
			int DEX = input.nextInt();
			Weapon weapon = new Weapon(name, ATK, DEF, INT, DEX);
			inventory.add(weapon);
			System.out.println("Weapon added to inventory.");
			break;
		case 2: 
			int item_Num=0;
			System.out.println();
			if(inventory.size()==0)
				System.out.println("Inventory is empty.");
			for(Weapon list : inventory) {
				System.out.println("Slot [" + item_Num + "]: " + list);
				item_Num++;
			}
			break;
		case 3: 
			System.out.print("Are you sure? (y/n): ");
			String empty_Confirm = new Scanner(System.in).nextLine();
			if(empty_Confirm.equals("y"))
				inventory.clear();
			else
				break;
			System.out.println("Inventory emptied");
			break;
		case 4: 
			System.exit(0);
		case 5:
			System.out.print("Enter an index: ");
			int search_Index = new Scanner(System.in).nextInt();
			try {
				System.out.println();
				System.out.println("Slot [" + search_Index + "]: " + inventory.get(search_Index));
			} catch(Exception e) {
				e.getMessage();
				System.out.println("Index doesn't exist.");
				break;
			}
			break;
		case 6:
			System.out.print("Enter the index for the item you wish to remove: ");
			int remove_Index = new Scanner(System.in).nextInt();
			try {
				System.out.print("Are you sure? (y/n): ");
				String delete_Confirm = new Scanner(System.in).nextLine();
				if(delete_Confirm.equals("y")) {
					System.out.println(inventory.get(remove_Index).getName() + " is being removed...");
					inventory.remove(remove_Index);
					System.out.println("Weapon removed.");
				}
				else
					break;
			} catch(Exception e) {
				e.getMessage();
				System.out.println("Index doesn't exist.");
				break;
			}
			break;
		default:
			inv_Status = false;
		}
		}
	}
}

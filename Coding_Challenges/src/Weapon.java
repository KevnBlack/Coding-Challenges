
public class Weapon {
	private String name;
	private int ATK, DEF, INT, DEX;
	
	Weapon(String name, int ATK, int DEF, int INT, int DEX){
		this.name=name;
		this.ATK=ATK;
		this.DEF=DEF;
		this.INT=INT;
		this.DEX=DEX;
	}
	
	public String getName() {
		return(name);
	}
	
	public String toString() {
		return(name + " ATK: " + ATK + " DEF: " + DEF + " INT: " + INT + " DEX: " + DEX);
	}
}

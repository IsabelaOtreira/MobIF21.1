
public class monstCerberus extends Monster{
	
	public monstCerberus(String name, int level) {
		super (name, level);
	}
	
	public String name() {
		return getName();
	}
	
	public int level() {
		return getLevel();
	}

	public void atributeGen() {
		this.ability = (int)(this.level + 3 + Math.random() * 6);;
		this.energy = (int)(2 * this.level + 12 + Math.random() * 12);;
		this.attack = "Claw";
		
		System.out.println("[ " + this.name() + " | Lv." + this.level + " ]\n" +
		"Type: Cerberus \n" + 
		"Ability: " + this.ability + "\n" +
		"Energy: " + this.energy + "\n" + 
		"Attack Type: " + this.attack + "\n");
	}
	
	public void showSheet(){
		System.out.println("[" + this.name() + " | Lv." + this.level + " ]\n" +
		"Type: Cerberus \n" + 
		"Ability: " + this.ability + "\n" +
		"Energy: " + this.energy + "\n" + 
		"Attack Type: " + this.attack + "\n");
	}
}



public class humMage extends Humanoid {
	public humMage(String name) {
		super (name);
	}
	
	public String name() {
		return getName();
	}

	public void atributeGen() {
		this.ability = (int)(6 + Math.random() * 6);;
		this.energy = (int)(12 + Math.random() * 12);;
		this.experience = 0;
		this.attack = "Fireball";
		
		System.out.println("[ " + this.name() + " ]\n" +
		"Class: Mage \n" + 
		"Ability: " + this.ability + "\n" +
		"Energy: " + this.energy + "\n" + 
		"Experience: " + this.experience + "\n" + 
		"Attack Type: " + this.attack + "\n");
	}
	
	public void showSheet(){
		System.out.println("[ " + this.name() + " ]\n" +
		"Class: Mage \n" + 
		"Ability: " + this.ability + "\n" +
		"Energy: " + this.energy + "\n" + 
		"Experience: " + this.experience + "\n" + 
		"Attack Type: " + this.attack + "\n");
	}
}

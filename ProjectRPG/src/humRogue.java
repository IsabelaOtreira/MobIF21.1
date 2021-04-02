

public class humRogue extends Humanoid {
	public humRogue(String name) {
		super (name);
	}
	
	public String name() {
		return getName();
	}

	public void atributeGen() {
		this.ability = (int)(10 + Math.random() * 6);;
		this.energy = (int)(6 + Math.random() * 12);;
		this.experience = 0;
		this.attack = "Dagger";
		
		System.out.println("[ " + this.name() + " ]\n" +
		"Class: Rogue \n" + 
		"Ability: " + this.ability + "\n" +
		"Energy: " + this.energy + "\n" + 
		"Experience: " + this.experience + "\n" + 
		"Attack Type: " + this.attack + "\n");
	}
	
	public void showSheet(){
		System.out.println("[ " + this.name() + " ]\n" +
		"Class: Rogue \n" + 
		"Ability: " + this.ability + "\n" +
		"Energy: " + this.energy + "\n" + 
		"Experience: " + this.experience + "\n" + 
		"Attack Type: " + this.attack + "\n");
	}
}

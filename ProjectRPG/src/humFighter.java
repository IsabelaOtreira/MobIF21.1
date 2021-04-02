

public class humFighter extends Humanoid {
	
	public humFighter(String name) {
		super (name);
	}
	
	public String name() {
		return getName();
	}

	public void atributeGen() {
		this.ability = (int)(10 + Math.random() * 6);;
		this.energy = (int)(8 + Math.random() * 12);;
		this.experience = 0;
		this.attack = "Sword";
		
		System.out.println("[ " + this.name() + " ]\n" +
		"Class: Fighter \n" + 
		"Ability: " + this.ability + "\n" +
		"Energy: " + this.energy + "\n" + 
		"Experience: " + this.experience + "\n" + 
		"Attack Type: " + this.attack + "\n");
	}
	
	public void showSheet(){
		System.out.println("[ " + this.name() + " ]\n" +
		"Class: Fighter \n" + 
		"Ability: " + this.ability + "\n" +
		"Energy: " + this.energy + "\n" + 
		"Experience: " + this.experience + "\n" + 
		"Attack Type: " + this.attack + "\n");
	}
}

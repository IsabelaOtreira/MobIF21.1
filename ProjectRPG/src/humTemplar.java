

public class humTemplar extends Humanoid {
	public humTemplar(String name) {
		super (name);
	}
	
	public String name() {
		return getName();
	}

	public void atributeGen() {
		this.ability = (int)(3 + Math.random() * 6);;
		this.energy = (int)(18 + Math.random() * 12);;
		this.experience = 0;
		this.attack = "Club";
		
		System.out.println("[ " + this.name() + " ]\n" +
		"Class: Templar \n" + 
		"Ability: " + this.ability + "\n" +
		"Energy: " + this.energy + "\n" + 
		"Experience: " + this.experience + "\n" + 
		"Attack Type: " + this.attack + "\n");
	}
	
	public void showSheet(){
		System.out.println("[ " + this.name() + " ]\n" +
		"Class: Templar \n" + 
		"Ability: " + this.ability + "\n" +
		"Energy: " + this.energy + "\n" + 
		"Experience: " + this.experience + "\n" + 
		"Attack Type: " + this.attack + "\n");
	}
}

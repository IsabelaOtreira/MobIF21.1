

public abstract class Humanoid {
	
	private String name;
	protected int ability;
	protected int energy;
	protected int experience;
	protected String attack;
	
	public Humanoid (String name) {
		setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void getExperience(int expGot) {
		this.experience += expGot;
		if (this.experience >= 10) {
			this.experience -= 10;
			this.ability += 2;
			this.energy += 4;
			
			System.out.println(this.name + " Level Up! \n");
		}
	}
	
	public abstract void atributeGen();
}

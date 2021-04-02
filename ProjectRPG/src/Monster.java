
public abstract class Monster {
	private String name;
	protected int ability;
	protected int energy;
	protected int level;
	protected String attack;
	
	public Monster (String name, int level) {
		setName(name);
		setLevel(level);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public abstract void atributeGen();
}

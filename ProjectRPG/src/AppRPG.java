public class AppRPG {
	
	public static void main(String[] args) {
		
		// Create all Characters
		humMage char1 = new humMage("Hendrickson");
		char1.atributeGen();
		
		humFighter char2 = new humFighter("Magnus");
		char2.atributeGen();
		
		humRogue char3 = new humRogue("Venser");
		char3.atributeGen();
		
		humTemplar char4 = new humTemplar("Guillemot");
		char4.atributeGen();
		
		//Create Enemies
		
		monstCerberus monster1 = new monstCerberus("Abaddon, the Three Headed Dog", 10 + (int)(Math.random() * 6));
		monster1.atributeGen();
		
		monstEel monster2 = new monstEel("Policramus, the Eternal Hydra", 1 + (int)(Math.random() * 6) + (int)(Math.random() * 6));
		monster2.atributeGen();
		
		char1.getExperience(monster1.level);
		char1.showSheet();
		
	}

}

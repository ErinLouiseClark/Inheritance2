
public class Billionaires extends Armed {

	protected int money;
	
	public void spendMoney(){
		int random = (int)(Math.random()*3 + 1);
		if(random == 1){
			System.out.println(name + " spent money upgrading their " + weapon + ".");
		}
		else if(random ==2){
			System.out.println(name + " spent money on a night out!");
		}
		else{
			System.out.println(name + " donated money to charity.");
		}
	}
	
	public void createWeapons(){
		System.out.println(name + " worked hard to fix their " + weapon + "");
	}
	
	public void fightEvil(){
		System.out.println(name + " used their " + weapon + " to fight " + archnemesis + " and win!");
	}
}

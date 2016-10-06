
public abstract class Powers extends Superhero {

	protected String powerOrigin;
	protected String power;
	
	public void fightEvil(){
		System.out.println(name + " used their " + power + " to fight " + archnemesis + " and win!");
	}
	
	public void trainPower(){
		System.out.println(name + " trained to strengthen their " + power + ".");
	}
}

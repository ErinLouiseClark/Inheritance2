
public abstract class Armed extends Superhero {

	protected String weapon;
	
	public abstract void fightEvil();
	
	public void beHuman(){
		System.out.println("During times of peace, " + name + " lives as " + birthName + ".");
	}
}

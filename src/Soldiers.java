
public class Soldiers extends Armed {

	protected String martialArts;
	protected String protection; 
	
	public void fightEvil(){
		System.out.println(name + " used their " + martialArts + " and their" + protection + " to fight " + archnemesis + " and win!");
	}
	
	public void train(){
		System.out.println(name + " trained to fight even better!");
	}
}

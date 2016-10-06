
public abstract class Superhero {
	
	protected String name;
	protected boolean tragicPast;
	protected String location;
	protected String birthName;
	protected String training;
	protected String archnemesis;
	
	public abstract void fightEvil();
	
	public void saveCivilians(){
		int random = (int)(Math.random()*1000 + 1);
		System.out.println(name + " saved " + random + " citizens in " + location + "!");
	}
		
}

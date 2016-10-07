import java.util.ArrayList;
public class SuperheroRunner {

	public static void main(String[] args) {
		
		ArrayList<Superhero> comic = new ArrayList<Superhero>();
		
		protected String name;
		protected boolean tragicPast;
		protected String location;
		protected String birthName;
		protected String archnemesis;
		
		
		comic.add(new Mind("Professor X", false, "New York", "Charles Xavier","Magneto"));
		comic.add(new humanImprovement("Flash", true, "Central City", "Barry Allen", "Reverse-Flash"));
		comic.add(new externalPower("Starfire", false, "California", "Starfire", "Blackfire"));
		comic.add(new animal("Wolverine", true, "New York", "Logan", "Magneto"));
		comic.add(new magic("Dr. Strange", false, "Philadelphia", "Stephen Strange", "aarkus"));
		comic.add(new billionaire("Batman", true, "Gotham City", "Bruce Wayne", "Joker"));
		comic.add(new soldier("Captain America", true, "Brooklyn", "Steve Rogers", "HYDRA"));
	}

}

package tr.edu.hacettepe.bbm490;

public class Country {

	private int id;
	private String name;
	private long population;

	public Country(int id, String name, long population) {
		this.id = id;
		this.name = name;
		this.population = population;
	}

	public Country() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
}

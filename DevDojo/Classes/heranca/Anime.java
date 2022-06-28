package heranca;

public class Anime {
	private String name;

	public Anime(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Anime: " + this.name;
	}
	
//	Forma que a propria IDE sobrescreve o toString();
//	@Override
//	public String toString() {
//		return "Anime [name=" + name + "]";
//	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

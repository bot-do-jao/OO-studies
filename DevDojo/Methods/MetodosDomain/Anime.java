package MetodosDomain;

public class Anime {
	private String name;
	private String type;
	private int episodes;
	private String genre;
	private String studio;
	
	//construtor
	public Anime(String name, String type, int episodes, String genre) {
		this.name = name;
		this.type = type;
		this.episodes = episodes;
		this.genre = genre;
	}
	public Anime(String name, String type, int episodes, String genre, String studio) {
		this(name,type,episodes,genre);
		this.studio = studio;
	}
	//also construtor
	public Anime() {
		
	}
	
	public void init(String name, String type, int episodes) {
		this.name = name;
		this.type = type;
		this.episodes = episodes;
	}
	//sobrecarga de metodos abaixo
	
	public void init(String name, String type, int episodes, String genre) {
		this.init(name,type,episodes);
		this.genre = genre;
	}
	
	

	public void construct(){
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.episodes);
		System.out.println(this.genre);
		System.out.println(this.studio);
		
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getgenre() {
		return genre;
	}

	public void setgenre(String genre) {
		this.genre = genre;
	}
	
}

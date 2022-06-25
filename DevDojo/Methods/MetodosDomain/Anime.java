package MetodosDomain;

public class Anime {
	private String name;
	private String type;
	private int episodes;
	private String genre;
	private String studio;

	{
		System.out.println("Isso é um bloco de inicialização,");
		System.out.println("qualquer coisa aqui é executada antes do construtor e métodos");
	}
	
	static {
		System.out.println("Esse bloco é estatico, logo sera inicializado só uma vez");
		System.out.println();
	}
	//Constructor
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
	//also constructor
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}



}

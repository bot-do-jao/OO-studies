package MetodosTest;

import MetodosDomain.Anime;

public class AnimeTest {
	public static void main(String[] args) {
	Anime anotherAnime = new Anime("naruto","TV",700,"A��o","Pierrot");	
	Anime newAnime = new Anime("Sword Art Online", "TV", 50, "A��o");	
	Anime anime = new Anime();
	anime.init("noragami", "TV",12,"Aventura");
	anime.construct();
	newAnime.construct();
	anotherAnime.construct();
}
}

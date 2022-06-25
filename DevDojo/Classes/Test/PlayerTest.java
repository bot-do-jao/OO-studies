package Test;

import Domain.Player;
import Domain.Team;

public class PlayerTest {
	public static void main(String[] args) {
		Player playern1 = new Player("Pelé");
		Player playern2 = new Player("Romário");
		Player playern3 = new Player("Zico");
		
		Player[] players = {playern1,playern2,playern3};
		
		for (Player player : players) {
			player.construct();
		}
		System.out.println();
		Player playern4 = new Player("Bebeto");
		Team team = new Team("Selecao Flasco", players);
		
		playern1.setTeam(team);
		playern2.setTeam(team);
		playern3.setTeam(team);
		playern4.setTeam(team);
		
		Player[] players2 = {playern1,playern2,playern3,playern4};
		for (Player player : players2) {
			player.construct();
			System.out.println();
		}
		
		Team selecao = new Team("Vasco", players2);
		
		team.contruct();
		System.out.println();
		selecao.contruct();
		System.out.println();
		team.contruct();
	}
}

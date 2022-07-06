package repo;

public class RepoTest {
	public static void main(String[] args) {
		Repositorio repo = new RepositorioBancoDeDados();
		
		repo.salvar();
	}
}

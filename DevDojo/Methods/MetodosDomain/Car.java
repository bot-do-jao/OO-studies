package MetodosDomain;

public class Car {
	private String nome;
	public static final double MAX_VELOCITY = 250;
	public final Buyer BUYER = new Buyer();
	
	
	
	public Buyer getBUYER() {
		return BUYER;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

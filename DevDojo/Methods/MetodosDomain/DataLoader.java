package MetodosDomain;

public interface DataLoader {
	//atributos em uma interface sempre sao publicos, estaticos e FINAIS (constantes)
	int MAX_DATA_SIZE = 10;
	
	//metodos em uma interface sempre são publicos e abstratos
	void load();
	
	default void checkPermission() {
		System.out.println("Checking permissions");
	}
	
	static void retrieveMaxDataSize() {
		System.out.println("Here");
	}
}

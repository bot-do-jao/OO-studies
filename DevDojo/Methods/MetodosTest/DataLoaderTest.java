package MetodosTest;

import MetodosDomain.DataLoader;
import MetodosDomain.DatabaseLoader;
import MetodosDomain.FileLoader;

public class DataLoaderTest {
	public static void main(String[] args) {
		DatabaseLoader database = new DatabaseLoader();
		FileLoader files = new FileLoader();
		
		database.load();
		files.load();
		database.remove();
		files.remove();
		database.checkPermission();
		files.checkPermission();
		DataLoader.retrieveMaxDataSize();
		DatabaseLoader.retrieveMaxDataSize();
	}
}

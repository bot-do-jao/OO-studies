package MetodosDomain;

public class DatabaseLoader implements DataLoader, DataRemover {
	
	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println("Loading data from the database");
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("Removing from the database");
	}

	@Override
	public void checkPermission() {
		// TODO Auto-generated method stub
		System.out.println("Checking database permissions");
	}
	
	public static void retrieveMaxDataSize() {
		System.out.println("----------------");
		System.out.println("Here's johny");
	}
	
}

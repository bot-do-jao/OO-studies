package Domain;



public enum ClientType {
	PESSOA_FISICA(1, "Pessoa F�sica"),
	PESSOA_JURIDICA(2, "Pessoa Jur�dica");
	
	public final int VALUE;
	private String nameSpreadsheet;

	private ClientType(int value, String nameSpreadsheet) {
		this.VALUE = value;
		this.nameSpreadsheet = nameSpreadsheet;
	}

	public static ClientType clientTypePerSpreadName(String nameSpreadsheet) {
		for (ClientType clientType : values()) {
			if(clientType.getNameSpreadsheet().equals(nameSpreadsheet)) {
				return clientType;
			}
			
		}
		
		return null;
	}
	
	public String getNameSpreadsheet() {
		return nameSpreadsheet;
	}
	
	
}

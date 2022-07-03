import Domain.Client;
import Domain.ClientType;
import Domain.PaymentType;


public class ClientTest {
	public static void main(String[] args) {
		Client client1 = new Client("Tsubasa", ClientType.PESSOA_FISICA, PaymentType.CREDITO);
		Client client2 = new Client("Akira", ClientType.PESSOA_JURIDICA, PaymentType.DEBITO);
		
		
		System.out.println(client1);
		System.out.println(client2);
		System.out.println(PaymentType.DEBITO.CalculateDeal(100));
		System.out.println(PaymentType.CREDITO.CalculateDeal(100));
		System.out.println();
		
		ClientType pessoa_fisica = ClientType.valueOf("PESSOA_FISICA");
		System.out.println(pessoa_fisica.getNameSpreadsheet());
		ClientType pessoa_fisica2 = ClientType.clientTypePerSpreadName("Pessoa Jurídica");
		System.out.println(pessoa_fisica2);
		
	}	
}

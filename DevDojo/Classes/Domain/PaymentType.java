package Domain;

public enum PaymentType{
	CREDITO{
		@Override
		public double CalculateDeal(double value) {
			// TODO Auto-generated method stub
			return value * 0.05;
		}
	}, DEBITO{

		@Override
		public double CalculateDeal(double value) {
			// TODO Auto-generated method stub
			return value * 0.1;
		}
		
	};
	
	public abstract double CalculateDeal(double value); 
		
}
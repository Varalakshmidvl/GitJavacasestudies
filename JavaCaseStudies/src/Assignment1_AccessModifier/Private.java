package Assignment1_AccessModifier;

public class Private {
		private int a = 143;
		
		private void pvt() {

		System.out.println("I am private Accessfier");

		}
		public static void main(String[] args) {

		Private pvt = new Private();
		pvt.pvt();
		System.out.println("value of a is "+pvt.a);
		}
	
}

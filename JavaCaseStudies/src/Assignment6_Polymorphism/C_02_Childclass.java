package Assignment6_Polymorphism;

	public class C_02_Childclass extends C_01_Parentclass {

		public void display() {
			System.out.println("This is child display method");
		}
		public void show() {
			System.out.println("This is child show method");
		}
			
		public static void main(String[] args) {
			C_02_Childclass obj1 = new C_02_Childclass();
			obj1.display();
			obj1.show();
			obj1.disp();
			//Parent Reference and Parent object
			C_01_Parentclass obj2 = new C_01_Parentclass();
			obj2.display();
			obj2.disp();

			//Parent Reference and Child object
			C_01_Parentclass obj3 = new C_01_Parentclass();
			obj3.display();
			obj3.show();
		
		}
	
	
	}	
	
	
	
	
	


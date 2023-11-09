package test;

public class Outter {

	int field = 10;
	void method() {
		
		System.out.println("Outter class method");
	}
	
	 class Nested{
		
		int field = 20;
		void method() {
			System.out.println("Nested class method : "+ Outter.this.field);//Outter.this. 안하면 20 출려됨 
		}
		
		void method2() {
			Outter.this.method();
		}
	}
	
	
}

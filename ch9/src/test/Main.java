package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
////		A a = new A();
////		A.B b = a.new B(); 
//		A.C c = new A.C();
//		A.memberA = 20;
////		c.field1 = 10;
//		//c.field2 = 20;
		
		Outter o = new Outter();
		Outter.Nested n = o.new Nested();
		n.method2();
	}

}

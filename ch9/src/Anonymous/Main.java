package Anonymous;

public class Main {

	public static void main(String[] args) {
		
		RemoteControl r = new RemoteControl() {
			public void turnOn() {
				System.out.println("TV is on.");
			}
		};
		
		r.turnOn();
		
		Anony a = new Anony();
		a.method(10, 20);
		
//		Main m = new Main();
//		
////		Parent p = new Parent();
//		
//		m.TestMethod(new Parent() {
//			void method() {
//				
//				System.out.println("I am Child");
//			}
//		});//메소드 호출
//		
//		
////		Parent p = new Parent(){
////			public void method() {
////				System.out.println("I am new Child");
////			}
////		};
////		
////		p.method();
////	}
////	
////	void method2() {
//////		class Child2 extends Parent{
//////			void method() {
//////				System.out.println("I am a child");
//////			}
//////		}
////		Parent p = new Parent() {
////			
////			void method() {
////				System.out.println("I am a child");
////			}
////		};
////		p.method();
//	}
//	
//	void TestMethod(Parent p) {
//		p.method();
//	}
	}
}

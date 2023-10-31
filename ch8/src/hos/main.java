package hos;

public class main {

	public static void main(String[] args) {
		
		main m = new main();
		
		Pet p1 = new dog("PSH", 25);
		Pet p2 = new Cat("HCM", 3);
		//Pet p3 = new Pet("CBH");
		
		m.ShowOwner(p1);
		m.ShowOwner(p2);
		
		
		m.TestCry(p1);
		m.TestCry(p2);
		
		m.TestRunSpeed(p1);
		m.TestRunSpeed(p2);
		

	}
	
	void ShowOwner(Pet p) {
		System.out.println("Owner's name is " + p.OwnerName());
	}
	void TestCry(Pet p) {
		p.Cry();
	}
	
	void TestRunSpeed(Pet p) {
		
		if(p instanceof dog)
		{
			dog d = (dog)p;
			System.out.println("Run Speed is " + d.RunSpeed());
		}
		else if(p instanceof Cat)
		{
			Cat c =(Cat)p;
			System.out.println("Jumpig Height is " + c.JumpigHeight());
		}
	}

}

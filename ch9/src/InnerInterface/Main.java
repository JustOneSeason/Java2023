package InnerInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button b = new Button();
		
		//Call c = new Call();
		
		b.SetOnClickKistener(new Button.OnClickKistener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Make a call.");
			}
		});
		b.touch();
		
		Message m = new Message();
		b.SetOnClickKistener(m);
		b.touch();
		

	}

}

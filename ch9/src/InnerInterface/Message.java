package InnerInterface;

public class Message implements Button.OnClickKistener{
	
	public void onClick() {
		System.out.println("Send Message");
	}
}

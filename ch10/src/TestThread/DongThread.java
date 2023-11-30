package TestThread;

public class DongThread extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Dong");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

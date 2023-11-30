package TestThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DongTask dong = new DongTask();//Runnable dong = new DongTask();랑 같다
//		Thread thread = new Thread(dong);
//		thread.start();
//		Thread thread = new Thread(new Runnable() {
//			public void run() {
//			for(int i = 0; i < 10; i++) {
//				System.out.println("Dong");
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			}
//		});
//		
//		Thread thread = new DongThread();
		Thread thread = new Thread() {
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
		};
		thread.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("Ding");
			try {
				Thread.sleep(1000);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	}

}

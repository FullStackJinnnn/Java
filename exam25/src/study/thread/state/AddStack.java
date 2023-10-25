package study.thread.state;

public class AddStack extends Thread {

	private Storage st;
	
	public AddStack(Storage st) {
		this.st = st;
		
	}
	
	public void run() {
		try {
			
			while(true) {
				Thread.sleep(100);
				if(this.st.getStackCount() == 0) {
					System.out.println("짐 추가 ");
					this.st.addStack(10);
				}
			}
			
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

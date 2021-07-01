package ClassWork;

public class ThreadRevision {
	public ThreadRevision() {
		Thread t=new Thread(new ThreadJob());
		t.start();
	}
	public static void main(String[] args) {

		new ThreadRevision();
		Thread t=Thread.currentThread();
		System.out.println(t);
	
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			System.out.println(i);
		}
	}
}
class ThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread is executed....");
	}
}
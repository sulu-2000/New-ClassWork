package ClassWork;

public class Threadingdemo2 {
	public Threadingdemo2() {
		Thread t= new Thread((new ThreadJob2()));
		t.start();
	}
	public static void main(String[] args)throws Exception {
		Thread t=Thread.currentThread();
		System.out.println(t);
		new Threadingdemo2();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
class ThreadJob2 implements Runnable{
	@Override
	public void run() {
		System.out.println("i am the child thread 2...");
	}
}
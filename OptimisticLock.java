package ClassWork;

public class OptimisticLock {
	public static void main(String[] args) {
		CounsellingHall university=new CounsellingHall();
		Thread Deepa=new Thread(new CounsellingJob(university),"Deepa");
		Thread sulu=new Thread(new CounsellingJob(university),"sulu");
		Deepa.start();
		sulu.start();
	}
}
class CounsellingJob implements Runnable{
	public CounsellingJob(CounsellingHall university) {
		this.university=university;
	}
	CounsellingHall university;
	@Override
	public void run() {

		if(Thread.currentThread().getName().equals("Deepa")) {
			university.table1();university.table2();
		}
		else if(Thread.currentThread().getName().equals("sulu")){
			university.water();
		}
	//	}
	}
}
class CounsellingHall{
	synchronized public void table1() {
		System.out.println("entered table1...:"+Thread.currentThread().getName());
		try {Thread.sleep(5000);}catch(Exception e) {}
	}
	synchronized public void table2() {
		System.out.println("entered table2...:"+Thread.currentThread().getName());
	}
	public void water() {
		System.out.println("entered water area to drink water....:"+Thread.currentThread().getName());
	}
}
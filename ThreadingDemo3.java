package ClassWork;

public class ThreadingDemo3 {
	public static void main(String[] args) {
		ReservationCentre central =new ReservationCentre();
		Thread taqi=new Thread (new booking(central,1000),"taqi");
		Thread imran =new Thread (new booking (central,500),"imran");
		taqi.start();
		imran.start();
	}
}
class booking implements Runnable{
	ReservationCentre central;
	int amount;
	public booking(ReservationCentre central,int amount) {
		this.central=central;
		this.amount=amount;
	}
	@Override
	public void run() {
		synchronized (central){
		central.bookTicket(amount);	
		central.getChange();}
	}

}
class ReservationCentre {
	int amount;
	public void bookTicket(int amount) {
		Thread t= Thread.currentThread();
		String name=t.getName();
		this.amount=amount;
		System.out.println(name+"  has come to book ticket...");
		System.out.println("with a amount of "+amount);
		try {t.sleep(1000);}
		catch(Exception e) {}
	}
	public void getChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		this.amount=amount;
		System.out.println("give change ..."+(amount-100));
	}
}
package ClassWork;

public class ThreadingDemo4 {
	public static void main(String[] args) {
		ReservationCounter2 central=new ReservationCounter2();
		Thread taqi=new Thread (new  bookingcounter(central,1000),"taqi");
		Thread imran=new Thread (new bookingcounter(central,500),"imran");
		taqi.start();
		imran.start();
	}
}
class bookingcounter implements Runnable{
	ReservationCounter2 central;int amt;
	public bookingcounter(ReservationCounter2 central,int amt) {
		this.central=central;
		this.amt =amt;
	}
	public void run() {
		synchronized(central) {
			central.bookticket(amt);
			central.returnChange();
		}
	}
}
class ReservationCounter2 {
	int amt;
	public void bookticket(int amt) {
	Thread t= Thread.currentThread();
	String name=t.getName();
	this.amt=amt;
	System.out.println(name+" has come to buy ticket with amount ="+amt);
	}
	public void returnChange() {
	Thread t=Thread.currentThread();
	String name=t.getName();
	System.out.println("give change to "+name);
	System.out.println("the change given is "+(amt-100));
	}
}
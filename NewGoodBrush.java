package ClassWork;

public class NewGoodBrush {
	public static void main(String[] args) {
	paint paint =new redpaint();
	makeup m1=new rosepowder();
	GoodBrush1 b1=new GoodBrush1();
	b1.obj=paint;
	b1.obj=m1;
	b1.excute();
	b1.excute();
	}
}
abstract class paint{
	public abstract void dopaint();
}
class redpaint extends paint{
	@Override
	public void dopaint() {
	System.out.println("red paint....");
	}
}
class bluepaint extends paint{
	@Override
	public void dopaint() {
		System.out.println("blue panit.....");
		}
}
abstract class makeup{
	public abstract void domakeup();
}
class whitepowder extends makeup{
	@Override
	public void domakeup() {
		System.out.println("white powder....");
	}
}
class rosepowder extends makeup {
	@Override
	public void domakeup() {
		System.out.println("rose powder....");
    }
}
class GoodBrush1{
	Object obj;
	public void excute() {
		if (obj instanceof paint) {
			paint p=(paint)obj;
			p.dopaint();
		}
		if (obj instanceof makeup) {
			makeup m=(makeup)obj;
			m.domakeup();
		}

	}
}
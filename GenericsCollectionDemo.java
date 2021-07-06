package ClassWork;

public class GenericsCollectionDemo {
	public static void main(String[] args) {
		paint p=new bluepaint();
		makeup m=new whitemakeup();
		Goodbrush2<paint> accept=new Goodbrush2<>();
		accept.setT(p);
		paint p1=accept.getT();
		p1.dopaint();
	}
}
abstract class paint{
	abstract public void dopaint();
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
		System.out.println("blue paint...");	
		}
}
abstract class makeup{
	abstract public void domakeup();
}
class whitemakeup extends makeup{
	@Override
	public void domakeup() {
		System.out.println("white makeup....");
	}
}
class rosemakeup extends makeup{
	@Override
	public void domakeup() {
		System.out.println("rose makeup...");
	}
}
class Goodbrush2<T>{
	T obj;
	public T getT() {
		return obj;
	}
	public void setT(T obj) {
		this.obj=obj;
	}
}
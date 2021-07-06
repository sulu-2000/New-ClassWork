package ClassWork;

public class GenericsDemo {
	public static void main(String[] args) {
		ball b=new ball();
		sky s=new sky();
		Accept<ball> baccept=new Accept<>();
		baccept.sett(b);
		ball b1= baccept.gett();
		Accept<sky>saccept=new Accept<>();
		saccept.sett(s);
		sky s1 = saccept.gett();
	}
}
class ball{

}
class sky{

}
class Accept<t>{
	t obj;
	public t gett() {
		return obj;
	}
	public void sett(t obj) {
		this.obj=obj;
	}
}
package abstractionjavademo;
class Area<T>{
	private T t1;
	public void  add(T t) {
		this.t1=t;
	}
	public T get() {
		return t1;
		
	}
}
public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area<Integer> a1 = new Area<Integer>();
		Area<String> a2 = new Area<String>();
		a1.add(12);
		a2.add("name");
		System.out.println(a1.get());
		System.out.println(a2.get());

	}

}

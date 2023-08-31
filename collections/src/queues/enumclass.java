package queues;
enum colour{
	Red,
	Blue,
	Black;
}
class demo1{
	colour c2;
	demo1(colour d2){
		this.c2=c2;
	}
	
}
public class enumclass {
	public static void main(String[] args) {
		colour c1 = colour.Black;
		switch(c1){
			case Blue:
				System.out.println("I am Blue");
		
		}
	}
}

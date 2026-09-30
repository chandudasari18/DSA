package DSA;
class vehicle{
	public void name(){
		System.out.println("TATA SIERRA EV.............");
	}
}
class car extends vehicle {
	public void color() {
		System.out.println("The color is white..");
	}
}

public class Engine extends car{
	public void type() {
		System.out.println("Fuel engine..");
	}
	public static void main(String args[]) {
		Engine eng=new Engine();
		eng.name();
		eng.color();
		eng.type();
		
	}
}

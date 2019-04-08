package inheritance;

public class TestPoly {

	public static void main(String[] args) {
		Father father;
		father = new Son();//son obj is created at the runtime.
		father.playGame();//runtime polymorphism
	}
	
}

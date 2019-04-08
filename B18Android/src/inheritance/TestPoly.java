package inheritance;

public class TestPoly {

	public int add(int a, int b) {return a+b;}
	public int add(int a, int b,int c) {return a+b+c;}

	
	public static void main(String[] args) {
		Father father;
		father = new Son();//son obj is created at the runtime.
		father.playGame();//runtime polymorphism --- dynamic binding
		
		TestPoly testPoly = new TestPoly();
		testPoly.add(10, 20,30); //static binding
	}
	
}

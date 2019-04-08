package polymorphism;
class Bike7{  
	int speed = 200;  

	Bike7(){System.out.println("speed is "+speed);
	System.out.println("consturctor called");
	}  

	{
		speed=100;
		System.out.println("instance init block called");
	}  

	public static void main(String args[]){  
		Bike7 b1=new Bike7();  
		Bike7 b2=new Bike7();  
	}      
}  
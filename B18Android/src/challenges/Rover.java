package challenges;

public class Rover {
	static int matrixSize = 4;
	static int noCells = matrixSize * matrixSize;
	static int currentLocation=8;
	static String[] commands = {"down"};
	//,"left","up","down","down"};
	public static void main(String[] args) {
		for(String command : commands) {
			switch (command) {
			case "right":
				moveRight();
				break;
			case "down":
				moveDown();
				break;
				/*case "left":
				moveLeft();
				break;	
			case "up":
				moveUp();
				break;	
				 */


			}
		}
		System.out.println("location = "+currentLocation);

	}




	public static void moveRight(){currentLocation++;}
	public static void moveLeft(){currentLocation--;}



	public static void moveDown(){ 
		int lastRowBegin = (matrixSize * (matrixSize - 1))+1;
		int lastRowEnd = (matrixSize * matrixSize) -1;
		if (currentLocation >= lastRowBegin && currentLocation <= lastRowEnd) {	} //if the rover is in the last row don't do anything
		else currentLocation += matrixSize; // currentLocation = currentLocation +matrixSize;

		//currentLocation +=matrixSize;
	}
	public static void moveUp(){currentLocation -= matrixSize; }

}

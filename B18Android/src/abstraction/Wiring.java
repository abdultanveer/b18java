package abstraction;

public class Wiring {

	public static void main(String[] args) {
		ISwitchBoard iSwitchBoard;
		iSwitchBoard = new GEAppliances();
				//new HavellsAppliances(); //wiring
		
		iSwitchBoard.switchOnFan();
		iSwitchBoard.switchOnLight();
		iSwitchBoard.switchOnTubelight();
	}

}

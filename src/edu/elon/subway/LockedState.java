package edu.elon.subway;

public class LockedState implements SubwayState {

	private Subway subway;
	
	public LockedState(Subway subway) {
		this.subway = subway;
	}
	
	@Override
	public String useCoin() {
		String output = "Locked door now unlocked!";
		subway.setState(subway.getUnlockedState());
		return output;
	}

	@Override
	public String pass() {
		String output = "ALARM STARTED!";
		return output;
	}

}

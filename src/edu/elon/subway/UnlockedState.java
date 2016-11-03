package edu.elon.subway;

public class UnlockedState implements SubwayState {
	
	private Subway subway;
	
	public UnlockedState(Subway subway) {
		
		this.subway = subway;
	}

	public String useCoin() {
		String output = "Thank you!";
		return output;
	}

	@Override
	public String pass() {
		String output = "Unlocked door now locked!";
		subway.setState(subway.getLockedState());
		return output;
	}

}

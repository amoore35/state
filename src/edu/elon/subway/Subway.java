package edu.elon.subway;

public class Subway {
	
	private SubwayState lockedState;
	private SubwayState unlockedState;
	
	private SubwayState state;
	
	public Subway() {
		lockedState = new LockedState(this);
		unlockedState = new UnlockedState(this);
		state = lockedState;
	}
	
	public String useCoin() {
		return state.useCoin();
	}
	
	public String pass() {
		return state.pass();
			
	}
	
	public SubwayState getState() {
		return state;
	}
	
	public void setState(SubwayState state) {
		this.state = state;
	}
	
	public SubwayState getLockedState() {
		return lockedState;
	}
	
	public SubwayState getUnlockedState() {
		return unlockedState;
	}
	
	

}

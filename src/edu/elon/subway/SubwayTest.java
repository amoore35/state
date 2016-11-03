package edu.elon.subway;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubwayTest {

	private Subway subway;
	private SubwayState lockedState;
	private SubwayState unlockedState;
	
	@Before
	public void setUp() {
		subway = new Subway();
		lockedState = subway.getLockedState();
		unlockedState = subway.getUnlockedState();
	}
	
	@Test
	public void testCoinUnlock() {
		subway.useCoin();
		assertEquals(unlockedState, subway.getState());
	}
	
	@Test
	public void testCoinUnlockString() {
		String output = subway.useCoin();
		assertEquals(output, "Locked door now unlocked!");
	}
	
	@Test
	public void testCoinThankYou() {
		subway.useCoin();
		assertEquals(unlockedState, subway.getState());
	}
	
	@Test
	public void testCoinThankYouString() {
		subway.useCoin();
		String output = subway.useCoin();
		assertEquals(output, "Thank you!");
	}
	
	@Test
	public void testPassLock() {
		subway.useCoin();
		subway.pass();
		assertEquals(lockedState, subway.getState());
	}
	
	@Test
	public void testPassLockString() {
		subway.useCoin();
		String output = subway.pass();
		assertEquals(output, "Unlocked door now locked!");
	}

	@Test
	public void testPassAlarm() {
		subway.useCoin();
		subway.pass();
		subway.pass();
		assertEquals(lockedState, subway.getState());
	}
	
	@Test
	public void testPassAlarmString() {
		subway.useCoin();
		subway.pass();
		String output = subway.pass();
		assertEquals(output, "ALARM STARTED!");
	}
	
}

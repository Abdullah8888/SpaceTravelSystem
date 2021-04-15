package sps_unit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sps.SpaceTravelSystem;
import sps.SpaceTravelSystemData;


class SpaceTravelSystemTest {
	private SpaceTravelSystem sps;
	
	@BeforeEach
	void setUp() throws Exception {
		sps = new SpaceTravelSystem();
	}

	@Test
	void testTripTransition() {
		//fail("Not yet implemented");
		assertEquals(2950.0, sps.tripTransition("Falcon1", "Abuja", "Moon"));
	}
	
	@Test
	void testTripAbujaToMoonViaFalcon9() {
		assertEquals(2900.0, sps.tripTransition("Falcon9", "Abuja", "Moon"));
	}
	
	@Test
	void testTripMoonToSpockViaFalcon1() {
		assertEquals(2750.0, sps.tripTransition("Falcon1", "Moon", "Spock"));
	}
	
	@Test
	void testTripMarsToIssViaFalcon9() {
		assertEquals(2700.0, sps.tripTransition("Falcon9", "Spock", "ISS"));
	}
	
}

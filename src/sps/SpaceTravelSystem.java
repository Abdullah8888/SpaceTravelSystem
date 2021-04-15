package sps;

import java.util.*;

public class SpaceTravelSystem {
	SpaceTravelSystemData spsData = new SpaceTravelSystemData();

	public double tripTransition(String rocketType, 
								String stationFrom,
								String stationTo) {
		Double userWallet = 0.0;
		Double tripFare = 0.0;
		String orbitStationFrom = spsData.orbit.get(stationFrom);
		String orbitStationTo = spsData.orbit.get(stationTo);
		String landingType = spsData.type.get(stationTo);
		
		//trip cases
		if(orbitStationFrom.equalsIgnoreCase(orbitStationTo)){
			userWallet = spsData.userWallet;
			tripFare = getFareForTrip(rocketType, true);
			userWallet = userWallet - tripFare;
			
		}
		else if(!orbitStationFrom.equalsIgnoreCase(orbitStationTo)){
			userWallet = spsData.userWallet;
			tripFare = getFareForTrip(rocketType, false);
			userWallet = userWallet - tripFare;	
		}
		
		userWallet = checkRoyaltyFare(userWallet, landingType);
		return userWallet;
	}
	
	public Double getFareForTrip(String selectedRocket, boolean isFromSameOrbit) {
		double tripFare = 0.0;
		if (selectedRocket.equalsIgnoreCase("Falcon1")) {
			tripFare = (isFromSameOrbit == true)? spsData.tripFareOnSameOrbit : 
				spsData.tripFareOnDifferentOrbit;
		}
		else {
			tripFare = (isFromSameOrbit == true)? 2 * spsData.tripFareOnSameOrbit : 
				2 * spsData.tripFareOnDifferentOrbit;
		}
		
		return tripFare;
	}
	
	public Double checkRoyaltyFare(Double userWallet, String landingType) {
		if (landingType.equalsIgnoreCase("Manmade")) {
			userWallet = userWallet + 200.0;
		}
		return userWallet;
	}
	
	public static void main(String[] args) {
		SpaceTravelSystem sps = new SpaceTravelSystem();
		Double userWallet = sps.tripTransition("Falcon9", "Spock", "ISS");
		System.out.println(userWallet);
	}

}

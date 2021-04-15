package sps;

import java.util.HashMap;
import java.util.Map;

enum RocketType {
	Falcon9, 
	Falcon1
}

public class SpaceTravelSystemData {
	String[] stations = {"Abuja", "Spock", "Moon", "ISS"};
	Double userWallet = 3000.0;
	Double tripFareOnSameOrbit = 50.0;
	Double tripFareOnDifferentOrbit = 250.0;
	Map<String, String> orbit = new HashMap<String, String>() {{
        put("Abuja", "Earth");
        put("Spock", "Mars");
        put("ISS", "Earth");
        put("Moon", "Earth");
    }};
	
    Map<String, String> type = new HashMap<String, String>() {{
    	put("Abuja", "Natural");
        put("Spock", "Natural");
        put("ISS", "Manmade");
        put("Moon", "Natural");
    }};
}

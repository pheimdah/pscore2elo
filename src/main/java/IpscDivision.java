package main.java;

import java.util.HashMap;
import java.util.Map;

public enum IpscDivision {

	HANDGUN_CLASSIC("Handgun Classic"), HANDGUN_OPEN("Handgun Open"), HANDGUN_PRODUCTION("Handgun Production"),
	HANDGUN_PRODUCTION_OPTICS("Handgun Production Optics"), HANDGUN_STANDARD("Handgun Standard"),

	MINI_RIFLE_OPEN("Mini Rifle Open"), MINI_RIFLE_STANDARD("Mini Rifle Standard"),

	PCC_IRON("PCC Iron"), PCC_OPTICS("PCC Optics"),

	RIFLE_MAB("Rifle Manual Action Bolt"), RIFLE_MAC("Rifle Manual Action Contemporary"),
	RIFLE_SAO("Rifle Semi Auto Open"), RIFLE_SAS("Rifle Semi Auto Standard"),

	SHOTGUN_MODIFIED("Shotgun Modified"), SHOTGUN_OPEN("Shotgun Open"), SHOTGUN_STANDARD("Shotgun Standard"),
	SHOTGUN_STANDARD_MANUAL("Shotgun Standard Manual");

	public final String resultFileDivisionName;

	private static final Map<String, IpscDivision> lookup = new HashMap<String, IpscDivision>();

	static {
		for (IpscDivision d : IpscDivision.values()) {
			lookup.put(d.getResultFileDivisionName(), d);
		}
	}

	private IpscDivision(String resultFileDivisionName) {
		this.resultFileDivisionName = resultFileDivisionName;
	}

	public String getResultFileDivisionName() {
		return this.resultFileDivisionName;
	}

	public static IpscDivision get(String abbreviation) {
		return lookup.get(abbreviation);
	}
}

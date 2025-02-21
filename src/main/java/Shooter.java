package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shooter {

	private String name;
	private String displayName;
	private int eloRating = 1000;
	private int pendingEloScoreAdjustment = 0;

	public Shooter(String pName) {
		this.name = pName;

		this.displayName = pName.trim() //
				.replaceAll(",", "") // remove the comma
				.replaceAll(" +", " ") // remove extra spaces
				.replaceAll("Heimdal", "Heimdahl");

		// Convert "Alfredsson Alfred" to "Alfred A"
		List<String> shooterNameComponents = new ArrayList<String>(List.of(this.displayName.split("\\s+")));
		Collections.reverse(shooterNameComponents);
		String lastName = shooterNameComponents.get(shooterNameComponents.size() - 1);
		char lastNameInitial = lastName.charAt(0);
		// String maskedLastName = lastNameInitial + "░".repeat(lastName.length() - 1);

		shooterNameComponents.removeLast();
		// shooterNameComponents.add(maskedLastName);
		shooterNameComponents.add(String.valueOf(lastNameInitial));

		this.displayName = String.join(" ", shooterNameComponents);
	}

	public void addPendingEloScoreAdjustment(int a) {
		this.pendingEloScoreAdjustment += a;
	}

	public void applyPendingEloScoreAdjustment() {
		this.eloRating += this.pendingEloScoreAdjustment;
		this.pendingEloScoreAdjustment = 0;
	}

	public int getEloRating() {
		return this.eloRating;
	}

	@Override
	public String toString() {
		return String.format("%s (%d)", displayName, eloRating);
	}

	public double getExpectedScore(int opponentRating) {

		double Ea = (double) 1 / (1 + Math.pow(10.0, ((double) (opponentRating - eloRating) / 400)));

		return Ea;
	}

}

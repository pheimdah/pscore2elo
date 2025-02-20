package main.java;

public class Shooter {

	private String name;
	private int eloRating = 1000;
	private int pendingEloScoreAdjustment = 0;

	public Shooter(String name) {
		this.name = name;
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
		return String.format("%s (%d)", name, eloRating);
	}

	public double getExpectedScore(int opponentRating) {

		double Ea = (double) 1 / (1 + Math.pow(10.0, ((double) (opponentRating - eloRating) / 400)));

		return Ea;
	}

}

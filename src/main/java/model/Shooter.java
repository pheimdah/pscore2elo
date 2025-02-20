package main.java.model;

import java.util.Objects;

public class Shooter {

	private String name;
	private int eloRating = 1000;
	private IpscDivision ipscDivision;
	private int pendingEloScoreAdjustment = 0;

	public Shooter(IpscDivision ipscDivision, String name) {
		this.ipscDivision = ipscDivision;
		this.name = name.replaceAll(" , ", ", ");
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shooter other = (Shooter) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	public double getExpectedScore(int opponentRating) {

		double Ea = (double) 1 / (1 + Math.pow(10.0, ((double) (opponentRating - eloRating) / 400)));

		return Ea;
	}

}

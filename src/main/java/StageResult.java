package main.java;

public class StageResult implements Comparable<StageResult> {

	final String shooterName;
	final float hitFactor;

	public StageResult(String shooterName, float hitFactor) {
		this.shooterName = shooterName;
		this.hitFactor = hitFactor;
	}

	@Override
	public int compareTo(StageResult otherResult) {
		return this.hitFactor >= otherResult.hitFactor ? -1 : 0;
	}

	public String getShooterName() {
		return shooterName;
	}

	public double getHitFactor() {
		return hitFactor;
	}

}

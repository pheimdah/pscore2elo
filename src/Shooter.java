import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shooter {

	private String displayName;
	private int eloRating = 1000;
	private int pendingEloScoreAdjustment = 0;
	private int nrStagesShot = 0;

	public Shooter(String displayName) {

		this.displayName = displayName;

		// Convert "Alfredsson Alfred" to "A. Alfredsson"

		List<String> shooterNameComponents = new ArrayList<>(List.of(this.displayName.split("\\s+")));
		Collections.reverse(shooterNameComponents);

		String firstName = shooterNameComponents.get(0);
		char firstNameInitial = firstName.charAt(0);

		shooterNameComponents.removeFirst();
		shooterNameComponents.addFirst(String.valueOf(firstNameInitial) + ".");

		this.displayName = String.join(" ", shooterNameComponents);

	}

	public void addPendingEloScoreAdjustment(int a) {
		this.pendingEloScoreAdjustment += a;
		this.nrStagesShot += 1;
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
		return String.format("%s (ELO rating of %d based on %d stages)", displayName, eloRating, nrStagesShot);
	}

	public double getExpectedScore(int opponentRating) {

		double Ea = 1 / (1 + Math.pow(10.0, ((double) (opponentRating - eloRating) / 400)));

		return Ea;
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shooter {

	private String displayName;
	private int eloRating = 1000;
	private int pendingEloScoreAdjustment = 0;
	private int nrEncounters= 0;

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

	public int getKFactor() {

		/*
		 * https://en.wikipedia.org/wiki/Elo_rating_system
		 * 
		 * See "Combating deflation"
		 */

		int K = 20;

		if (nrEncounters <= 30) {
			K = 40;
		} else if (eloRating > 2400) {
			K = 10;
		}

		return K;
	}

	public void addPendingEloScoreAdjustment(int a) {
		pendingEloScoreAdjustment += a;
		nrEncounters += 1;
	}

	public void applyPendingEloScoreAdjustment() {
		eloRating += pendingEloScoreAdjustment;
		pendingEloScoreAdjustment = 0;

		if (eloRating < 100) {
			eloRating = 100;
		}
	}

	public int getEloRating() {
		return eloRating;
	}

	@Override
	public String toString() {
		return String.format("**%s** (Elo rating of %d after %d encounters)", displayName, eloRating, nrEncounters);
	}

	public double getExpectedScore(int opponentRating) {

		double Ea = 1 / (1 + Math.pow(10.0, ((double) (opponentRating - eloRating) / 400)));

		return Ea;
	}

}

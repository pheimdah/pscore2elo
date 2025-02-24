import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shooters {

	// Second map keyed by name for lookup
	Map<IpscDivision, Map<String, Shooter>> shootersByDivision;

	public Shooters() {

		// Initialize maps
		shootersByDivision = new HashMap<>();

		for (IpscDivision division : IpscDivision.values()) {
			shootersByDivision.put(division, new HashMap<>());
		}
	}

	public void createShooter(IpscDivision division, String name) {

		if (!shootersByDivision.get(division).containsKey(name)) {
			shootersByDivision.get(division).put(name, new Shooter(name));
		}
	}

	public void applyEloScoreAdjustment() {

		for (IpscDivision key : shootersByDivision.keySet()) {
			for (Shooter shooter : shootersByDivision.get(key).values()) {
				shooter.applyPendingEloScoreAdjustment();
			}
		}
	}

	public void recordResult(IpscDivision division, String winnerName, String loserName) {

		Shooter winner = shootersByDivision.get(division).get(winnerName);
		Shooter loser = shootersByDivision.get(division).get(loserName);

		int winnerEloScoreAdjustment = (int) Math
				.round(winner.getKFactor() * (1 - winner.getExpectedScore(loser.getEloRating())));
		int loserEloScoreAdjustment = (int) Math
				.round(loser.getKFactor() * (0 - loser.getExpectedScore(winner.getEloRating())));

		shootersByDivision.get(division).get(winnerName).addPendingEloScoreAdjustment(winnerEloScoreAdjustment);
		shootersByDivision.get(division).get(loserName).addPendingEloScoreAdjustment(loserEloScoreAdjustment);
	}

	public List<Shooter> getRankedListOfShooters(IpscDivision division) {

		List<Shooter> shooters = new ArrayList<>(this.shootersByDivision.get(division).values());

		Collections.sort(shooters, new Comparator<Shooter>() {
			@Override
			public int compare(Shooter s1, Shooter s2) {
				return s1.getEloRating() - s2.getEloRating();
			}
		});

		return shooters;
	}
}

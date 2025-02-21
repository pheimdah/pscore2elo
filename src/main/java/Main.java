package main.java;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Shooters shooters = new Shooters();

		try {

			List<Stage> allStages = new ArrayList<>();

			for (String discipline : List.of("handgun", "mini_rifle", "pcc", "rifle", "shotgun")) {

				List<Stage> disciplineStages = new ArrayList<>();

				File resultsDirectory = new File("src/main/resources/results/" + discipline);

				for (File matchResultFile : resultsDirectory.listFiles()) {
					PractiScoreResultFile resultFile = new PractiScoreResultFile(matchResultFile);
					disciplineStages.addAll(resultFile.getStages());
				}

				System.out.println(String.format("Loaded %d %s stages", disciplineStages.size(), discipline));
				allStages.addAll(disciplineStages);
			}

			/*
			 * Transform stages into multiple 1v1 matches
			 */
			int one_v_ones = 0;
			int one_v_ones_ignored = 0;
			for (Stage stage : allStages) {
				for (IpscDivision division : stage.getDivisions()) {

					if (division == null) {
						System.err.println("Division unknown for stage " + stage);
						System.exit(1);
					}

					List<StageResult> results = stage.getResultsByDivision(division);
					Collections.sort(results);

					if (results.size() == 1) {
						continue;
					}

					for (int i = 0; i < results.size(); i++) {

						StageResult winner = results.get(i);

						/*
						 * DQs affect the rating enormously. DQ status is not in the data so we can't
						 * exclude it even if we wanted to.
						 */

						if (winner.getHitFactor() == 0) {
							// Combined last place, no winners there
							one_v_ones_ignored++;
							continue;
						}

						// Losers
						for (int j = i + 1; j < results.size(); j++) {
							StageResult loser = results.get(j);

							// Ensure that we know about each shooter
							shooters.createShooter(division, winner.getShooterName());
							shooters.createShooter(division, loser.getShooterName());

							shooters.recordResult(division, winner.getShooterName(), loser.getShooterName());

							one_v_ones++;
						}
					}
				}

				// Re-calculate ELO after each stage
				shooters.applyEloScoreAdjustment();
				// System.out.println("ELO updated. Current ad-hoc ranking: "
				// + shooters.getRankedListOfShooters(IpscDivision.MINI_RIFLE_OPEN));
			}

			System.out.println("");
			for (IpscDivision division : IpscDivision.values()) {

				System.out.print(String.format("%-28s", division.getResultFileDivisionName()));
				System.out.println(shooters.getRankedListOfShooters(division));
			}
			/*
			 * System.out.println(""); System.out.println("IPSC Handgun");
			 * System.out.println("- Classic: " +
			 * shooters.getRankedListOfShooters(IpscDivision.HANDGUN_CLASSIC));
			 * System.out.println("- Open: " +
			 * shooters.getRankedListOfShooters(IpscDivision.HANDGUN_OPEN));
			 * System.out.println("- Production: " +
			 * shooters.getRankedListOfShooters(IpscDivision.HANDGUN_PRODUCTION));
			 * System.out.println( "- Production Optics: " +
			 * shooters.getRankedListOfShooters(IpscDivision.HANDGUN_PRODUCTION_OPTICS));
			 * System.out.println("- Standard: " +
			 * shooters.getRankedListOfShooters(IpscDivision.HANDGUN_STANDARD));
			 * System.out.println(""); System.out.println("IPSC Mini Rifle");
			 * System.out.println("- Open: " +
			 * shooters.getRankedListOfShooters(IpscDivision.MINI_RIFLE_OPEN));
			 * System.out.println("- Standard: " +
			 * shooters.getRankedListOfShooters(IpscDivision.MINI_RIFLE_STANDARD));
			 * System.out.println(""); System.out.println("IPSC PCC");
			 * System.out.println("- Iron: " +
			 * shooters.getRankedListOfShooters(IpscDivision.PCC_IRON));
			 * System.out.println("- Optics: " +
			 * shooters.getRankedListOfShooters(IpscDivision.PCC_OPTICS));
			 * System.out.println(""); System.out.println("IPSC Rifle");
			 * System.out.println("- Manual Action Bolt: " +
			 * shooters.getRankedListOfShooters(IpscDivision.RIFLE_MAB));
			 * System.out.println( "- Manual Action Contemporary: " +
			 * shooters.getRankedListOfShooters(IpscDivision.RIFLE_MAC));
			 * System.out.println("- Semi-Auto Open: " +
			 * shooters.getRankedListOfShooters(IpscDivision.RIFLE_SAO));
			 * System.out.println("- Semi-Auto Standard: " +
			 * shooters.getRankedListOfShooters(IpscDivision.RIFLE_SAS));
			 * System.out.println(""); System.out.println("IPSC Shotgun");
			 * System.out.println("- Modified: " +
			 * shooters.getRankedListOfShooters(IpscDivision.SHOTGUN_MODIFIED));
			 * System.out.println("- Open: " +
			 * shooters.getRankedListOfShooters(IpscDivision.SHOTGUN_OPEN));
			 * System.out.println("- Standard: " +
			 * shooters.getRankedListOfShooters(IpscDivision.SHOTGUN_STANDARD));
			 * System.out.println( "- Standard Manual: " +
			 * shooters.getRankedListOfShooters(IpscDivision.SHOTGUN_STANDARD_MANUAL));
			 */
			System.out.println("");
			System.out.println("1v1 encounters: " + one_v_ones);
			System.out.println("1v1 ignored encounters (shared last place at HF 0): " + one_v_ones_ignored);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

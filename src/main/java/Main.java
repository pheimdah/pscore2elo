package main.java;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.model.IpscDivision;
import main.java.model.Shooters;
import main.java.model.Stage;
import main.java.model.StageResult;

public class Main {

	public static void main(String[] args) {

		Shooters shooters = new Shooters();

		try {

			List<Stage> allStages = new ArrayList<>();

			List<Stage> handgunStages = new ArrayList<>();
			for (File handgunMatchResultFile : new File("src/main/resources/2024_results/handgun/").listFiles()) {
				PractiScoreResultFile resultFile = new PractiScoreResultFile(handgunMatchResultFile);
				handgunStages.addAll(resultFile.getStages());
			}
			System.out.println("Loaded " + handgunStages.size() + " handgun stages");
			allStages.addAll(handgunStages);


			List<Stage> rifleStages = new ArrayList<>();
			for (File rifleMatchResultFile : new File("src/main/resources/2024_results/rifle/").listFiles()) {
				PractiScoreResultFile resultFile = new PractiScoreResultFile(rifleMatchResultFile);
				rifleStages.addAll(resultFile.getStages());
			}
			System.out.println("Loaded " + rifleStages.size() + " rifle stages");
			allStages.addAll(rifleStages);


			/*
			 * Transform stages into multiple 1v1 matches
			 */
			int one_v_ones = 0;
			for (Stage stage : allStages) {
				for (IpscDivision division : stage.getDivisions()) {

					List<StageResult> results = stage.getResultsByDivision(division);
					Collections.sort(results);

					if (results.size() == 1) {
						continue;
					}

					for (int i = 0; i < results.size(); i++) {
						StageResult winner = results.get(i);

						// Losers
						for (int j = i + 1; j < results.size(); j++) {
							StageResult loser = results.get(j);

							// System.out.println(winner.getShooterName() + " won against " +
							// loser.getShooterName());

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
				System.out.println("ELO updated. Current ad-hoc ranking: "
						+ shooters.getRankedListOfShooters(IpscDivision.HANDGUN_CLASSIC));
			}
			System.out.println("One-on-ones matches: " + one_v_ones);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

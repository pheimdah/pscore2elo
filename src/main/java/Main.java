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

			/*
			 * Mini Rifle
			 */
			List<Stage> miniRifleStages = new ArrayList<>();
			for (File rifleMatchResultFile : new File("src/main/resources/2024_results/mini_rifle/").listFiles()) {
				PractiScoreResultFile resultFile = new PractiScoreResultFile(rifleMatchResultFile);
				miniRifleStages.addAll(resultFile.getStages());
			}
			System.out.println("Loaded " + miniRifleStages.size() + " mini rifle stages");
			allStages.addAll(miniRifleStages);

			/*
			 * PCC
			 */
			List<Stage> pccStages = new ArrayList<>();
			for (File rifleMatchResultFile : new File("src/main/resources/2024_results/pcc/").listFiles()) {
				PractiScoreResultFile resultFile = new PractiScoreResultFile(rifleMatchResultFile);
				pccStages.addAll(resultFile.getStages());
			}
			System.out.println("Loaded " + pccStages.size() + " PCC stages");
			allStages.addAll(pccStages);

			/*
			 * RIFLE
			 */
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

						/*
						 * DQs affect the rating enormously. DQ status is not in the data so we can't
						 * exclude it even if we wanted to.
						 */

						if (winner.getHitFactor() == 0) {
							// Combined last place, no winners there
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
			System.out.println("IPSC HANDGUN");
			System.out.println("- Classic: " + shooters.getRankedListOfShooters(IpscDivision.HANDGUN_CLASSIC));
			System.out.println("- Open: " + shooters.getRankedListOfShooters(IpscDivision.HANDGUN_OPEN));
			System.out.println("- Production: " + shooters.getRankedListOfShooters(IpscDivision.HANDGUN_PRODUCTION));
			System.out.println(
					"- Production Optics: " + shooters.getRankedListOfShooters(IpscDivision.HANDGUN_PRODUCTION_OPTICS));
			System.out.println("- Standard: " + shooters.getRankedListOfShooters(IpscDivision.HANDGUN_STANDARD));
			System.out.println("");
			System.out.println("IPSC Mini Rifle");
			System.out.println("- Open: " + shooters.getRankedListOfShooters(IpscDivision.MINI_RIFLE_OPEN));
			System.out.println("- Standard: " + shooters.getRankedListOfShooters(IpscDivision.MINI_RIFLE_STANDARD));
			System.out.println("");
			System.out.println("IPSC PCC");
			System.out.println("- Iron: " + shooters.getRankedListOfShooters(IpscDivision.PCC_IRON));
			System.out.println("- Optics: " + shooters.getRankedListOfShooters(IpscDivision.PCC_OPTICS));
			System.out.println("");
			System.out.println("IPSC Rifle");
			System.out.println("- MAB: " + shooters.getRankedListOfShooters(IpscDivision.RIFLE_MAB));
			System.out.println("- MAC: " + shooters.getRankedListOfShooters(IpscDivision.RIFLE_MAC));
			System.out.println("- SAO: " + shooters.getRankedListOfShooters(IpscDivision.RIFLE_SAO));
			System.out.println("- SAS: " + shooters.getRankedListOfShooters(IpscDivision.RIFLE_SAS));
			System.out.println("");
			System.out.println("1-v-1 encounters: " + one_v_ones);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

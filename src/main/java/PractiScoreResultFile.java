package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;

public class PractiScoreResultFile {

	List<Stage> stages = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public PractiScoreResultFile(File resultFile) throws FileNotFoundException {

		JsonReader jsonReader = new JsonReader(new FileReader(resultFile));

		GsonBuilder builder = new GsonBuilder();
		Object o = builder.create().fromJson(jsonReader, Object.class);

		if (o == null) {
			return;
		}

		List<Object> stageresults = (ArrayList<Object>) o;

		// First element contains overall match results, further elements contains
		// results for each stage in order
		// Iterate stages. First element contains match results, skip that.
		for (int i = 1; i < stageresults.size(); i++) {

			LinkedTreeMap<String, Object> foo = (LinkedTreeMap<String, Object>) stageresults.get(i);

			Stage stage = new Stage((String) foo.get("stageUUID"));

			for (String key : foo.keySet()) { // iterate instead of keyset
				if (key.contains("Stage ")) {

					List<LinkedTreeMap<String, Object>> resultsperdivision = (ArrayList<LinkedTreeMap<String, Object>>) foo
							.get(key);

					// Read only Overall result section, position doesn't matter since we only check
					// hit factor
					ArrayList<LinkedTreeMap<String, String>> res = (ArrayList<LinkedTreeMap<String, String>>) resultsperdivision
							.get(0).get("Overall");

					for (LinkedTreeMap<String, String> bar : res) {

						/*
						 * No-shows will have a stage time of 0 on all stages in the match. Disregard
						 * them.
						 * 
						 * DQed shooters will have a stage time of >0 but hit factor of 0 on stages they
						 * shot in the match. Stages after the DQ will have a time of 0.
						 */
						String sStageTimeSecs = bar.get("stageTimeSecs") //
								.replaceAll(",", "."); // Some files have ',' decimal separators
						Float stageTimeSecs = Float.valueOf(sStageTimeSecs);
						if (stageTimeSecs == 0.0) {
							continue;
						}

						String shooterName = bar.get("shooterName") //
								.replaceAll(",", "") // remove the comma
								.replaceAll(" +", " ") // remove extra spaces
								.trim();

						// Fix misspellings
						shooterName = shooterName //
								.replaceAll("Grönkvist Jonathan", "Grönqvist Jonathan") //
								.replaceAll("Heimdal Patrik", "Heimdahl Patrik") //
								.replaceAll("Morn Tomas", "Mörn Tomas") //
								.replaceAll("Norqvist Alexander", "Norkvist Alexander") //
								.replaceAll("Linden Jonas", "Lindén Jonas") //
								.replaceAll("Öhberg Niklas", "Öberg Nicklas") //
								.replaceAll("Öberg Niklas", "Öberg Nicklas") //
								.replaceAll("Öberg Niclas", "Öberg Nicklas");

						// Fix hit factor
						String sHitFactor = bar.get("hitFactor") //
								.replaceAll(",", "."); // Some files have ',' decimal separators
						Float hitFactor = Float.valueOf(sHitFactor);

						// Make division name unique
						String resultFileDivisionName = bar.get("division");
						String fileSystemSeparator = FileSystems.getDefault().getSeparator();
						if (resultFile.toString().contains(fileSystemSeparator + "handgun")) {
							resultFileDivisionName = "Handgun " + resultFileDivisionName;
						} else if (resultFile.toString().contains(fileSystemSeparator + "rifle")) {
							resultFileDivisionName = "Rifle " + resultFileDivisionName;
						} else if (resultFile.toString().contains(fileSystemSeparator + "shotgun")) {
							resultFileDivisionName = "Shotgun " + resultFileDivisionName;
						}

						IpscDivision division = IpscDivision.get(resultFileDivisionName);

						StageResult stageResult = new StageResult(shooterName, hitFactor);
						stage.addResult(division, stageResult);

					}
					stages.add(stage);
				}
			}
		}
	}

	public List<Stage> getStages() {
		return this.stages;
	}
}

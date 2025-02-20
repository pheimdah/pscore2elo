package main.java.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stage {

	private String id;

	private Map<IpscDivision, ArrayList<StageResult>> resultsByDivision = new HashMap<IpscDivision, ArrayList<StageResult>>();

	public ArrayList<StageResult> getResultsByDivision(IpscDivision division) {
		return resultsByDivision.get(division);
	}

	public Set<IpscDivision> getDivisions() {
		return resultsByDivision.keySet();
	}

	public Stage(String id) {
		this.id = id;

	}

	public void addResult(final IpscDivision division, final StageResult stageResult) {

		if (!this.resultsByDivision.containsKey(division)) {
			this.resultsByDivision.put(division, new ArrayList<StageResult>());
		}

		this.resultsByDivision.get(division).add(stageResult);
	}

	@Override
	public String toString() {
		return id;
	}

}

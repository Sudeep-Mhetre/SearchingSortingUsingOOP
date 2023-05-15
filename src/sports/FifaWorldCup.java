package sports;
//added first
public class FifaWorldCup {
	private String teamName;
	private int goalsAccepted;
	private int goalsMade;
	public FifaWorldCup(String teamName, int goalsAccepted, int goalsMade) {
		super();
		this.teamName = teamName;
		this.goalsAccepted = goalsAccepted;
		this.goalsMade = goalsMade;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getGoalsAccepted() {
		return goalsAccepted;
	}
	public void setGoalsAccepted(int goalsAccepted) {
		this.goalsAccepted = goalsAccepted;
	}
	public int getGoalsMade() {
		return goalsMade;
	}
	public void setGoalsMade(int goalsMade) {
		this.goalsMade = goalsMade;
	}
	@Override
	public String toString() {
		return "FifaWorldCup [teamName=" + teamName + ", goalsAccepted=" + goalsAccepted + ", goalsMade=" + goalsMade + "]";
	}

	}



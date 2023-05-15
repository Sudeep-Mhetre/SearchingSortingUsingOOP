package sports;

public class TeamPerformanceImpl implements ITeamPerformance {

	@Override
	public String[] AddTeamPerformance(FifaWorldCup[] fifa) {
		int index = 0;
		String[] arr = new String[fifa.length];
		for (int i =0; i<fifa.length;i++)
		{
			arr[index]  = fifa[i].getTeamName()+":"+fifa[i].getGoalsAccepted()+":"+fifa[i].getGoalsMade();
			index++;
		}
		return arr;
	}
	
	@Override
	public String[] ShowBestPerformTeam(FifaWorldCup[] fifa) {
		int index = 0,count =0;
		for (int i =0; i<fifa.length;i++)
		{
			if(fifa[i].getGoalsMade()>fifa[i].getGoalsAccepted()) //to sort how many teams have made goals more than they have accepted
			{
				count++;
			}
		}
		
       String[] arr = new String[count]; //Count here is the actual size of the team who have made Goals more and Accepted Less.
		
		for (int i =0; i<count;i++)
		{
			if(fifa[i].getGoalsMade()>fifa[i].getGoalsAccepted())
			{
				arr[index] = fifa[i].getTeamName();
				index++;
			}
		}
		return arr;//return team names who made Goals more and Accepted Less.
	}
}

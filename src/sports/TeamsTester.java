package sports;
import java.util.*;
public class TeamsTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 4;

		FifaWorldCup [] fifa = new FifaWorldCup[3];
		do {
		System.out.println("1. Add team Performance");
		System.out.println("2. Add teams and Show Team Names with best Performance");
		System.out.println("3. Search for team by name");
		System.out.println("4. Sort teams by Score");
		System.out.println("5. Exit");
		 choice = sc.nextInt();
		switch(choice) {	
		case 1:{
			System.out.println("Add 1st team name , Goals Accepted , Goals Made");
			fifa[0] = new FifaWorldCup(sc.next(),sc.nextInt(),sc.nextInt());
			System.out.println("Add 2nd team name , Goals Accepted , Goals Made");
			fifa[1] = new FifaWorldCup(sc.next(),sc.nextInt(),sc.nextInt());
			System.out.println("Add 3rd team name , Goals Accepted , Goals Made");
            fifa[2] = new FifaWorldCup(sc.next(),sc.nextInt(),sc.nextInt());		
			TeamPerformanceImpl team = new TeamPerformanceImpl();		
		for(int i=0;i<fifa.length;i++)
			{
				 String teams [] =team.AddTeamPerformance(fifa);
			     System.out.println("added team details : " +teams[i].toString());
		    }
			break;	
		}
		
		case 2:{	
			System.out.println("Add 1st team name , Goals Accepted , Goals Made");
			fifa[0] = new FifaWorldCup(sc.next(),sc.nextInt(),sc.nextInt());
			System.out.println("Add 2nd team name , Goals Accepted , Goals Made");
			fifa[1] = new FifaWorldCup(sc.next(),sc.nextInt(),sc.nextInt());
			System.out.println("Add 3rd team name , Goals Accepted , Goals Made");
			fifa[2] = new FifaWorldCup(sc.next(),sc.nextInt(),sc.nextInt());		
			TeamPerformanceImpl team = new TeamPerformanceImpl ();		
			String teams[]=team.ShowBestPerformTeam(fifa);
			for(int i=0;i<teams.length;i++)
			{
			     System.out.println("best performing team : " +teams[i].toString());
		    }
			break;
		}
		case 3:{
			System.out.println("Enter Team Name");
			int index = Search.linearSearch(fifa, sc.next());
			if(index != -1) {
				System.out.println(fifa[index]);
			}
			else {
				System.out.println("Team Not Found");
			}
			break;
		}
		case 4:{
			System.out.println("Selection Sort");	
			FifaWorldCup arr[] = Sort.selectionSort(fifa);
			System.out.println(Arrays.toString(arr));
			System.out.println("Insertion Sort");
			FifaWorldCup arr1[] = Sort.insertionSort(fifa);
   		    System.out.println(Arrays.toString(arr1));
			break;
			}
         }
      }while(choice != 5);
	}
  }


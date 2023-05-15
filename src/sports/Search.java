package sports;

public class Search {

	
	public static int linearSearch(FifaWorldCup[] arr, String key) {
		System.out.println("Linear search");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getTeamName().equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(FifaWorldCup[] arr,int n, int key) {
		System.out.println("Binary search");
		int start = 0;
		int end = n;
		while (start<=end) {
			int mid  = (start+end)/2;
			if(arr[mid].getGoalsMade() == key) {
				return mid;
			}
			else if(arr[mid].getGoalsMade()>key){
				end = mid -1;
			}
			else
			{
				start = mid +1;
			}
		}
		return -1;
	}
}

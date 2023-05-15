package sports;

public class Search {
	public static int linearSearch(FifaWorldCup[] arr, String key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getTeamName().equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
//	public static int BinarySearch(FifaWorldCup[] arr,int n, int key) {
//		int start = 0;
//		int end = n;
//		while (start<=end) {
//			int mid  = (start+end)/2;
//			if(arr[mid].key) {
//				
//			}
//		}
	}


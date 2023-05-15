package sports;

public class Sort {
	//Selection Sort
	public static FifaWorldCup[] selectionSort(FifaWorldCup[] arr1) {
		int pass = 0, itr = 0, swap = 0;
		FifaWorldCup arr[] = arr1;
		for(int i=0; i<arr.length-1; i++) {
			pass++;
			for(int j=i+1; j<arr.length; j++) {
				itr++;
				if(arr[i].getGoalsMade()>arr[j].getGoalsAccepted()) {
					swap++;
					FifaWorldCup temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
	return arr;
}
	//Insertion Sort
public static FifaWorldCup[] insertionSort(FifaWorldCup[] arr1) {
	FifaWorldCup arr[] = arr1;
		for(int i = 1; i < arr.length; i++)
		{
			int j;
			FifaWorldCup temp = arr[i];
			for(j = i-1; j>=0 && arr[j].getGoalsMade()<temp.getGoalsMade();j--) {  //if first condition false second condition is not evaluated ==> &&
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		return arr;
	}
}
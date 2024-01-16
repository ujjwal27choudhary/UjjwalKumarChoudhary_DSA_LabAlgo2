package assignment2;

public class InsertionSort {
	public void sort(int[] arr) {
		int com,j;
		for(int k=1;k<arr.length;k++)
		{
			com=arr[k];
			j=k-1;
				while(j>=0 && com>=arr[j])
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=com;
		}
		
	}


}

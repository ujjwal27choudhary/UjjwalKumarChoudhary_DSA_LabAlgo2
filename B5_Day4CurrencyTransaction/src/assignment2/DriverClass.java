package assignment2;
import java.util.Scanner;
import java.util.Arrays;

public class DriverClass {
	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
		System.out.println("please enter the number of currency notes in that country");
		int size = as.nextInt();
		int currency[] = new int[size];
		System.out.println("enter the notes denominations in that country"); 
		for(int i=0; i< currency.length; i++)
		{
			currency[i]=as.nextInt();
			
		}
		
		System.out.println("before Sorting"+Arrays.toString(currency));
		
		
		InsertionSort is=new InsertionSort();
		is.sort(currency);
		System.out.println("After Sorting : "+Arrays.toString(currency));
		
		System.out.println("Enter Amount you need to exchange");
		int amount=as.nextInt();
		as.close();
		
		NotesCount sc=new NotesCount();
		sc.counting(currency,amount);
		
	}
	
	

}

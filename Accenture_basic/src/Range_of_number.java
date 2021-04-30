import java.util.Scanner;
public class Range_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int min = 0;
		int max = 100;
		int i = 0;
		while(i>=0) 
		{
			if(num < max) 
			{
				System.out.println("Range of the number "+ num +" is "+ min +" to "+ max);
				break;
			}
				min += 100;
				max += 100;
				
		}

	}

}

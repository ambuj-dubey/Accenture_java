import java.util.*;
public class Income {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of working days");
		int hr = sc.nextInt();
		if (hr>0)
		{	
			long total = 365*hr*100;
			System.out.println("Total:"+total);
		}
	}

}

import java.util.*;
public class Display {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n<1) {
			System.out.println(n+" is not a valid input");
		}
		else {
			for(int i=n;i>0;i--) {
				System.out.println(str);
			}
		}

	}

}

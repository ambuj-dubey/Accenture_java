import java.util.*;
public class Road_Signaling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the color");
		String signal = sc.nextLine();
		
		if (signal.equals("green"))
		{
			System.out.println("go");
		}
		if (signal.equals("red"))
		{
			System.out.println("stop");
		}
		if (signal.equals("yellow"))
		{
			System.out.println("proceed with caution");
		}
		else
		{
			System.out.println("ready to go");
		}

	}

}

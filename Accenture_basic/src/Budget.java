import java.util.*;
public class Budget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of the mobile");
		int price = sc.nextInt();
		if (price <= 13000) {
			System.out.println("Mobile chosen is within the budget");
		}
		if (price > 13000) {
			System.out.println("Mobile chosen is beyond the budget");
		}

	}

}

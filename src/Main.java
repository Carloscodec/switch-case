import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		String day;
		
		switch (x) {
		case 1:
			day = "sunday";
			break;
		case 2:
			day = "monday";
			break;
		case 3:
			day = "tuesday";
			break;
		case 4:
			day = "wednesday";
			break;
		case 5:
			day = "thursday";
			break;
		case 6:
			day = "friday";
			break;
		case 7:
			day = "saturday";
			break;
		default:
			day = "invalid";
			break;
		}
		
		System.out.println("Day of week: " + day);
		
		input.close();
	}

}

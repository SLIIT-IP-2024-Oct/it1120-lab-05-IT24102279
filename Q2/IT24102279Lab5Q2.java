import java.util.Scanner;

public class IT24102279Lab5Q2{
	public static void main(String[] args){
	System.out.println("Enter The number of new customers :");
	Scanner inputInstance = new Scanner(System.in);
	int number = inputInstance.nextInt();
	string prize;

	switch (number){
		case 0 :
			prize = "No Prize";
			break;
		case 1 :
			prize = "Pen";
			break;
		case 2 :
			prize = "Umbrella";
			break;
		case 3 :
			prize = "Bag";
			break;
		case 4 :
			prize = "Traveling Chair";
			break;
		default :
			prize = "Headphone";

		}
	System.out.print("You recive a ");
	System.out.println(prize);
	}
}
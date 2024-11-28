import java.util.Scanner;

public class IT24102279Lab5Q1 {
    public static void main(String[] args) {
        Scanner scannerObjectInstance = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scannerObjectInstance.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scannerObjectInstance.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scannerObjectInstance.nextInt();

        int smallest = num1; 
        int largest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num2 > largest) {
            largest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}

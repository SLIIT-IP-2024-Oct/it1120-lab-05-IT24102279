import java.util.Scanner;

public class IT24102279Lab5Q3 {
    public static void main(String[] args) {

        final int dailyCharge = 48000;
        System.out.println("Enter Starting date:");
        Scanner input1 = new Scanner(System.in);
        final int startDay = input1.nextInt();
        System.out.println("Enter Ending date:");
        final int endDay = input1.nextInt();

        final int duration = endDay - startDay;
        final int totalAmountNoDiscount = duration * dailyCharge;

        if (startDay < 1 || startDay > 31 || endDay < 1 || endDay > 31) {
            System.out.println("Invalid Date entries. Exiting now.");
            System.exit(0);
        }
        else if (endDay <= startDay) {
            System.out.println("Start Date cannot be larger than End date or both dates are the same. Exiting.");
            System.exit(0);
        }
        else {
            int totalAmount = totalAmountNoDiscount;

            if (duration >= 3 && duration <= 4) {
                totalAmount = totalAmountNoDiscount - (totalAmountNoDiscount * 10 / 100);
            }
            else if (duration >= 5) {
                totalAmount = totalAmountNoDiscount - (totalAmountNoDiscount * 20 / 100);
            }

            System.out.println("Total amount (after discount if applicable): " + totalAmount);
        }

    }
}

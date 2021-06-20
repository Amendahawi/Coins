import java.util.*;

public class CoinCalculator {
    public static void main(String[] args){
        //Importing scanner.
        Scanner kbReader = new Scanner(System.in);

        //Asking user for the number of nickels.
        System.out.println("Input the count of nickels: ");
        //Reading the users input.
        int nickelCount = kbReader.nextInt();
        //Setting a value for the Nickel.
        int nickelWorth = 5;
        //Calculating the total worth of the Nickel (multiple the amount of Nickels by the value of each Nickel).
        double totalNickel = nickelCount*nickelWorth/100.00;
        //Printing total value of the Nickels.
        System.out.println("Total value of nickels: $" + totalNickel);

        //Dimes.
        System.out.println("Input the count of Dime: ");
        int dimeCount = kbReader.nextInt();
        int dimeWorth = 10;
        double totalDime = dimeCount*dimeWorth/100.00;
        System.out.println("Total value of dimes: $" + totalDime);

        //Quarters.
        System.out.println("Input the count of Quarter: ");
        int quarterCount = kbReader.nextInt();
        int quarterWorth = 25;
        double totalQuarter = quarterCount*quarterWorth/100.00;
        System.out.println("Total value of Quarter: $" + totalQuarter);

        //Pennies.
        System.out.println("Input the count of Penny: ");
        int pennyCount = kbReader.nextInt();
        //Closing the Reader.
        kbReader.close();
        int pennyWorth = 1;
        double totalPenny = pennyCount*pennyWorth/100.00;
        System.out.println("Total value of Penny: $" + totalPenny);

        //Adding the total value of each coin.
        double totalValue = totalDime + totalNickel + totalPenny + totalQuarter;
        //Printing the combined value of all the coins.
        System.out.println("$" + totalValue);
    }
}

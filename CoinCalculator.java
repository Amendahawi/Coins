import java.util.*;

public class CoinCalculator {
    public static void main(String[] args){
        //Importing scanner.
        Scanner kbReader = new Scanner(System.in);

        //Asking user for the number of nickels.
        System.out.println("Input the count of nickels: ");
        //Reading the users input.
        int NickelCount = kbReader.nextInt();
        //Setting a value for the Nickel.
        int NickelWorth = 5;
        //Calculating the total worth of the Nickel (multiple the amount of Nickels by the value of each Nickel).
        double TotalNickel = NickelCount*NickelWorth/100.00;
        //Printing total value of the Nickels.
        System.out.println("Total value of nickels: $" + TotalNickel);

        //Dimes.
        System.out.println("Input the count of Dime: ");
        int DimeCount = kbReader.nextInt();
        int DimeWorth = 10;
        double TotalDime = DimeCount*DimeWorth/100.00;
        System.out.println("Total value of dimes: $" + TotalDime);

        //Quarters.
        System.out.println("Input the count of Quarter: ");
        int QuarterCount = kbReader.nextInt();
        int QuarterWorth = 25;
        double TotalQuarter = QuarterCount*QuarterWorth/100.00;
        System.out.println("Total value of Quarter: $" + TotalQuarter);

        //Pennies.
        System.out.println("Input the count of Penny: ");
        int PennyCount = kbReader.nextInt();
        //Closing the Reader.
        kbReader.close();
        int PennyWorth = 1;
        double TotalPenny = PennyCount*PennyWorth/100.00;
        System.out.println("Total value of Penny: $" + TotalPenny);

        //Adding the total value of each coin.
        double TotalValue = TotalDime + TotalNickel + TotalPenny + TotalQuarter;
        //Printing the combined value of all the coins.
        System.out.println("$" + TotalValue);
    }
}

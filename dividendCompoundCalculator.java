import java.util.*;  

public class dividendCompoundCalculator{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type in Stock Price; press enter when done");
        double stockPriceScanned = sc.nextDouble();

        System.out.println("Type in Annualised Dividend; press enter when done");
        double annualDividendScanned = sc.nextDouble();

        System.out.println("Type in Duration of Time in Years; press enter when done");
        int yearsScanned = sc.nextInt();

        System.out.println("Type in Number of Shares; press enter when done");
        int sharesScanned = sc.nextInt();

        sc.close(); 

        double result = dividendCalc(stockPriceScanned, annualDividendScanned, yearsScanned, sharesScanned);
        System.out.println("Your Approximate, Total Yield In Year " + yearsScanned + ": " + result);
    }

    private static double dividendCalc(double stockPrice, double annualDividend, int years, int shares) {
        double total = 0;
        for(int i = 0; i < years; i++){
            total += (shares * annualDvidend);
            shares += total / stockPrice;
        }
        return total + (shares * stockPrice);

    }
    
}


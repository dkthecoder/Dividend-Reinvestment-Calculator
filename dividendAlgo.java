import java.util.*;  

public class dividendAlgo{

    public static void main(String args[]){
        double stockPrice = 54.41;
        double annualDvidend = 1.56;
        int years = 10;
        int shares = 300;

        double total = 0;
        for(int i = 0; i < years; i++){
            total += shares * annualDvidend;
            shares += total / stockPrice;
            System.out.println("Year " + i + ": " + (total + (shares * stockPrice)));
        }

    }

}


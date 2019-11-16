import java.util.Scanner;

public class CashRegisterApp {
	static Scanner kb = new Scanner(System.in);
	static double itemPrice;
	static double moneyTendered;
	static double moneyOverPrice;
	
	

	public static void main(String[] args) {

		askAmount();
		originalAmountChecked(itemPrice, moneyTendered);

	}

	public static void askAmount() {
		System.out.println("What is the the price of the item: ");
		itemPrice = kb.nextDouble();

		System.out.println("How much money was tendered by the customer: ");
		moneyTendered = kb.nextDouble();
		
		kb.close();
	}

	public static void originalAmountChecked(double price, double tendered) {
		if (tendered < price) {
			System.out.println("You provided to little money");
		} else if (tendered == price) {
			System.out.println("exact amount recieved");
		}

		moneyOverPrice = tendered - price;
		
		if (moneyOverPrice >= 20) {
			int numTwenty = (int)(moneyOverPrice / 20);
			moneyOverPrice = (moneyOverPrice % 20);
			System.out.println("Twenty: " + numTwenty);
		}
		if (moneyOverPrice >= 10) {
			int numTen = (int)(moneyOverPrice / 10);
			moneyOverPrice = (moneyOverPrice % 10);
			System.out.println("Tens: " + numTen);
		}
		if (moneyOverPrice >= 5) {
			int numFive = (int)(moneyOverPrice / 5);
			moneyOverPrice = (int) (moneyOverPrice % 5);
			System.out.println("Fives: " + numFive);
		}
		if (moneyOverPrice >= 1) {
			int numOne = (int)(moneyOverPrice / 1);
			moneyOverPrice = (moneyOverPrice % 1);
			System.out.println("Ones: " + numOne);
		}
		if (moneyOverPrice >= .25) {
			int numQuarter = (int)(moneyOverPrice / .25);
			moneyOverPrice = (moneyOverPrice % .25);
			System.out.println("Quarters: " + numQuarter);
		}
		if (moneyOverPrice >= .10) {
			int numDime = (int)(moneyOverPrice / .10);
			moneyOverPrice = (moneyOverPrice % .10);
			System.out.println("Dimes: " + numDime);
		}
		if (moneyOverPrice >= .05) {
			int numNickel = (int)(moneyOverPrice / .05);
			moneyOverPrice = (moneyOverPrice % .05);
			System.out.println("Nickel: " + numNickel);
		}
		if (moneyOverPrice >= .001) {
			int numPenny = (int)(moneyOverPrice / .009);
			System.out.println("Penny: " + numPenny);
		}
	}


}

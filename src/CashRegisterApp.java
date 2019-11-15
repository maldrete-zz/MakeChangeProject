import java.util.Scanner;

public class CashRegisterApp {
	static Scanner kb = new Scanner(System.in);
	private static double itemPrice;
	private static double moneyTendered;
	private static double moneyOverPrice;
	static double twenty = 20.00;
	static double ten = 10.00;
	static double five = 5.00;
	static double one = 1.00;
	static double quarter = 0.25;
	static double dime = 0.10;
	static double nickel = 0.05;
	static double penny = 0.01;
	static int numTwenty = 0;
	static int numTen = 0;
	static int numFive = 0;
	static int numOne = 0;
	static int numQuarter = 0;
	static int numDime = 0;
	static int numNickel = 0;
	static int numPenny = 0;

	public static void main(String[] args) {

		askAmount();
		originalAmountChecked(itemPrice, moneyTendered);

	}

	public static void askAmount() {
		System.out.println("What is the the price of the item: ");
		itemPrice = kb.nextDouble();

		System.out.println("How much money was tendered by the customer: ");
		moneyTendered = kb.nextDouble();
	}

	public static void originalAmountChecked(double price, double tendered) {
		if (tendered < price) {
			System.out.println("You provided to little money");
		} else if (tendered == price) {
			System.out.println("exact amount recieved");
		}
		while (tendered > price) {
			moneyOverPrice = tendered - price;
			if (moneyOverPrice > ten) {
				tendered -= twenty;
				numTwenty += 1;
			}
			if (moneyOverPrice > five) {
				tendered -= ten;
				numTen += 1;
			}
			if (moneyOverPrice > one) {
				tendered -= one;
				numOne += 1;
			}
			if (moneyOverPrice > quarter) {
				tendered -= quarter;
				numQuarter += 1;
			}
			if (moneyOverPrice > dime) {
				tendered -= dime;
				numDime += 1;
			}
			if (moneyOverPrice > nickel) {
				tendered -= nickel;
				numNickel += 1;
			}
			if (moneyOverPrice > dime) {
				tendered -= dime;
				numDime += 1;
			}
			if (moneyOverPrice > nickel) {
				tendered -= nickel;
				numNickel += 1;
			}
			if (moneyOverPrice > penny) {
				tendered -= penny;
				numPenny += 1;
			}

		}
		System.out.printf(numTwenty + " Twenty, " + numTen + " Ten, " + numFive + " Five, " + numOne + " One, "
				+ numQuarter + " numQuarter, " + numDime + " numDime, " + numNickel + " Nickel, " + numPenny + " Penny");

	}

//	public static String changeBreakdown(double price, double tendered) {
//		while (tendered > price) {
//			moneyOverPrice = tendered - price;
//			if (moneyOverPrice > ten)
//				tendered -= twenty;
//			numTwenty += 1;
//		} if (moneyOverPrice > five){
//			tendered -= ten;
//			numTen += 1;
//		} if (moneyOverPrice > one) {
//			tendered -= one;
//			numOne += 1;
//		} if (moneyOverPrice >  quarter) {
//			tendered -= quarter;
//			numQuarter += 1;
//		} if (moneyOverPrice > dime) {
//			tendered -= dime;
//			numDime += 1;
//		} if (moneyOverPrice > nickel) {
//			tendered -= nickel;
//			numNickel += 1;
//		} if (moneyOverPrice > dime) {
//			tendered -= dime;
//			numDime += 1;
//		} if (moneyOverPrice > nickel) {
//			tendered -= nickel;
//			numNickel =+ 1;
//		} if (moneyOverPrice > penny) {
//			tendered -= penny;
//			numPenny += 1;
//			
//		}
//		return numTwenty + " Twenty dollar bill";
//	}

}

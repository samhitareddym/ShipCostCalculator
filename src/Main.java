import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create the Scanner object for input
        Scanner in = new Scanner(System.in);
        //Ask the user to enter the price of item
        System.out.println ("Enter the price of the item: ");
        double itemPrice = in.nextDouble();
        //Declare variables for total price and shipping cost
        double totalPrice;
        double shipCost;
        //If item price is $100 or more, set shipping cost to 0
        if (itemPrice >= 100) {
            shipCost = 0;
        //Else, calculate shipping as 2% of the item price
        }else{
            shipCost = itemPrice * 0.02;
            }
        //Calculate the Total Price
        totalPrice = itemPrice + shipCost;
        //Output Shipping Cost
        System.out.println("The Shipping Cost is:" + shipCost);
        //Output Total Price
        System.out.println("The Total Price is:" + totalPrice);
        }
    }
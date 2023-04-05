import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        Scanner input = new Scanner(System.in);

        System.out.println(
                "We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        // Normal cupcake price set
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println(
                "How much would you like to pay for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);
        //////////////
        // Red Velvet cupcake price set
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println(
                "How much would you like to pay for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String redVelvetPriceText = input.nextLine();

        double redVelvetPrice = Double.parseDouble(redVelvetPriceText);
        redVelvet.setPrice(redVelvetPrice);
        //////////////
        // Red Velvet cupcake price set
        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");
        chocolate.type();
        System.out.println(
                "How much would you like to pay for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String chocolatePriceText = input.nextLine();

        double chocolatePrice = Double.parseDouble(chocolatePriceText);
        chocolate.setPrice(chocolatePrice);
        //////////////
        // Adding cupcakes to menu
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);
    }
}

class Cupcake {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }

}

class RedVelvet extends Cupcake {
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}

class Chocolate extends Cupcake {
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}
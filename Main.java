import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cupcake ArrayList
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        // Soda Array List
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        Drink water = new Drink();
        Drink soda = new Soda();
        Drink milk = new Milk();

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

        //////////////
        System.out.println(
                "We are also in the middle of creating the drink menu. We currently have three drinks on the menu but we need to decide on pricing.");
        // Water price set
        System.out.println("We are deciding on the price for a water. Here is the description:");
        water.type();
        System.out.println(
                "How much would you like to pay for the drink? (Input a numerical number taken to 2 decimal places)");
        String priceWaterText = input.nextLine();

        double priceWater = Double.parseDouble(priceWaterText);
        water.setPrice(priceWater);
        //////////////
        // Soda price set
        System.out.println("We are deciding on the price for a soda. Here is the description:");
        soda.type();
        System.out.println(
                "How much would you like to pay for the drink? (Input a numerical number taken to 2 decimal places)");
        String priceSodaText = input.nextLine();

        double priceSoda = Double.parseDouble(priceSodaText);
        soda.setPrice(priceSoda);
        //////////////
        // Milk price set
        System.out.println("We are deciding on the price for milk. Here is the description:");
        milk.type();
        System.out.println(
                "How much would you like to pay for the drink? (Input a numerical number taken to 2 decimal places)");
        String priceMilkText = input.nextLine();

        double priceMilk = Double.parseDouble(priceMilkText);
        milk.setPrice(priceMilk);
        //////////////
        // Add Drinks to menu Array List
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        //////////////

        new Order(cupcakeMenu, drinkMenu);

        input.close();

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

class Drink {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic bottle of water.");
    }
}

class Soda extends Drink {
    public void type() {
        System.out.println("A bottle of soda.");
    }
}

class Milk extends Drink {
    public void type() {
        System.out.println("A bottle of milk.");
    }
}
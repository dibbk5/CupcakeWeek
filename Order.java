import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Order {

    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to place an order? (Y or N).");
        String placeOrder = input.nextLine();

        ArrayList<Object> order = new ArrayList<Object>();

        if (placeOrder.equalsIgnoreCase("Y")) {
            order.add(LocalDate.now());
            order.add(LocalTime.now());
            int itemNumber = 0;
            boolean ordering = true;

            System.out.println("Here is the menu.\n" +
                    "CUPCAKES");

            for (int i = 0; i < cupcakeMenu.size(); i++) {
                itemNumber += 1;
                System.out.println(itemNumber);

                cupcakeMenu.get(i).type();
                System.out.println("Price: " + cupcakeMenu.get(i).getPrice());
                System.out.println();

            }

            System.out.println("DRINKS");

            for (int i = 0; i < drinkMenu.size(); i++) {
                itemNumber += 1;
                System.out.println(itemNumber);

                drinkMenu.get(i).type();
                System.out.println("Price: " + drinkMenu.get(i).getPrice() + "\n");
                System.out.println();
            }

            while (ordering = true) {
                System.out.println(
                        "What would you like to order? Please use the number associated with each item to order");
                int orderChoice = input.nextInt();
                input.nextLine();

                if (orderChoice == 1) {
                    order.add(cupcakeMenu.get(0));
                    System.out.println("Item added to order.");
                } else if (orderChoice == 2) {
                    order.add(cupcakeMenu.get(1));
                    System.out.println("Item added to order.");
                } else if (orderChoice == 3) {
                    order.add(cupcakeMenu.get(2));
                    System.out.println("Item added to order.");
                } else if (orderChoice == 4) {
                    order.add(drinkMenu.get(0));
                    System.out.println("Item added to order.");
                } else if (orderChoice == 5) {
                    order.add(drinkMenu.get(1));
                    System.out.println("Item added to order.");
                } else if (orderChoice == 6) {
                    order.add(drinkMenu.get(2));
                    System.out.println("Item added to order.");
                } else {
                    System.out.println("Sorry, we don't seem to have that on the menu.");
                }

                System.out.println("Would you like to continue ordering? (Y/N)");
                String stillOrder = input.nextLine();

                if (!stillOrder.equalsIgnoreCase("Y")) {
                    ordering = false;
                }

            }

        } else {
            System.out.println("Have a nice day then");
        }
    }

}

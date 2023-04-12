import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

            while (ordering) {
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

            System.out.println(order.get(0));
            System.out.println(order.get(1));

            double subTotal = 0.0;
            //Getting subtotal of the order
            for(int i = 2; i<order.size(); i++) {
                if(order.get(i).equals(cupcakeMenu.get(0))){
                    cupcakeMenu.get(0).type();
                    System.out.println(cupcakeMenu.get(0).getPrice());
                    subTotal += cupcakeMenu.get(0).getPrice();
                } else if(order.get(i).equals(cupcakeMenu.get(1))){
                    cupcakeMenu.get(1).type();
                    System.out.println(cupcakeMenu.get(1).getPrice());
                    subTotal += cupcakeMenu.get(1).getPrice();
                } else if(order.get(i).equals(cupcakeMenu.get(2))){
                    cupcakeMenu.get(2).type();
                    System.out.println(cupcakeMenu.get(2).getPrice());
                    subTotal += cupcakeMenu.get(2).getPrice();
                } else if(order.get(i).equals(drinkMenu.get(0))){
                    drinkMenu.get(0).type();
                    System.out.println(drinkMenu.get(0).getPrice());
                    subTotal += drinkMenu.get(0).getPrice();
                } else if(order.get(i).equals(drinkMenu.get(1))){
                    drinkMenu.get(1).type();
                    System.out.println(drinkMenu.get(1).getPrice());
                    subTotal += drinkMenu.get(1).getPrice();
                } else if(order.get(i).equals(drinkMenu.get(2))) {
                    drinkMenu.get(2).type();
                    System.out.println(drinkMenu.get(2).getPrice());
                    subTotal += drinkMenu.get(2).getPrice();
                }
            }
            //Prints subTotal
            System.out.println(subTotal);

            new CreateFile();
            new WriteToFile(order);

        } else {
            System.out.println("Have a nice day then");
        }
    }

}

class CreateFile {
    public CreateFile() {
        try {
            File salesData = new File("salesData.txt");
            if (salesData.createNewFile()){
                System.out.println("File created " + salesData.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}

class WriteToFile {
    public WriteToFile(ArrayList<Object> order) {
        try {
            FileWriter fw = new FileWriter("salesData.txt", true);
            PrintWriter salesWriter = new PrintWriter(fw);

            for(int i = 0; i<order.size(); i++) {
                salesWriter.println(order.get(i));
            }

            salesWriter.close();
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}

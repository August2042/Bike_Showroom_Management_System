import java.util.Scanner;

public class BuyBike {
    void buyBike(Bike[] bikes, int bike_counter) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** BUY A BIKE *** =======================");
        System.out.println();

        if (bike_counter > 0) {
            for (int i = 0; i < bike_counter; i++) {
                System.out.println((i + 1) + "]. " + bikes[i].bike_brand + " " + bikes[i].bike_model);
            }

            System.out.print("Enter the bike number you want to buy: ");
            int bikeNumber = sc.nextInt();

            if (bikeNumber >= 1 && bikeNumber <= bike_counter) {
                Bike selectedBike = bikes[bikeNumber - 1];

                System.out.println("======================= *** BIKE DETAILS *** =======================");
                selectedBike.get_details();
                System.out.println("=============================================");
                System.out.println();

                System.out.print("Enter customer name: ");
                sc.nextLine();
                String customerName = sc.nextLine();

                System.out.print("Enter customer phone number: ");
                String customerPhone = sc.nextLine();

                System.out.println();
                System.out.println("======================= *** BILL *** =======================");
                System.out.println("Customer Name: " + customerName);
                System.out.println("Customer Phone: " + customerPhone);
                System.out.println("Bike Brand: " + selectedBike.bike_brand);
                System.out.println("Bike Model: " + selectedBike.bike_model);
                System.out.println("Bike Price: " + selectedBike.bike_price);
                System.out.println("=============================================");

                System.out.print("Enter the quantity you want to buy: ");
                int quantity = sc.nextInt();

                int totalBill = selectedBike.bike_price * quantity;
                System.out.println("Quantity: " + quantity);
                System.out.println("Total Bill: " + totalBill);

                 

                // Payment Option (implementation is simplified for demonstration purposes)
                System.out.println();
                System.out.println("Select Payment Option:");
                System.out.println("1. Cash");
                System.out.println("2. Credit Card");
                System.out.println("3. Debit Card");
                int paymentOption = sc.nextInt();

                // Confirm Payment
                System.out.print("Confirm Payment (Y/N): ");
                sc.nextLine();
                String confirmPayment = sc.nextLine();

                if (confirmPayment.equalsIgnoreCase("Y")) {
                    System.out.println("Payment Successful!");
                } else {
                    System.out.println("Payment Cancelled.");
                }

                System.out.println();
                System.out.println("Thank You for your purchase!");
            } else {
                System.out.println("Invalid bike number. Please enter a valid bike number.");
            }
        } else {
            System.out.println("No bikes available to buy. Please add bikes first!");
        }
    }
}

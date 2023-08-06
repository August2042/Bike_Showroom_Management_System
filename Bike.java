import java.util.Scanner;

public class Bike extends Showroom implements information {
    String bike_brand;
    String bike_model;
    String bike_color;
    String bike_seat_type;
    int bike_price;
    String bike_brake_type;

    public void get_details() {
        System.out.println("BRAND: " + bike_brand);
        System.out.println("MODEL: " + bike_model);
        System.out.println("COLOR: " + bike_color);
        System.out.println("SEAT TYPE: " + bike_seat_type);
        System.out.println("PRICE: " + bike_price);
        System.out.println("BRAKE TYPE: " + bike_brake_type);

    }

    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER BIKE DETAILS *** =======================");
        System.out.println();
        System.out.print("BIKE BRAND: ");
        bike_brand = sc.nextLine();
        System.out.print("BIKE MODEL: ");
        bike_model = sc.nextLine();
        System.out.print(("BIKE COLOR: "));
        bike_color = sc.nextLine();
        System.out.print("BIKE SEAT TYPE(SADDLE/CUSHIONED/RACING): ");
        bike_seat_type = sc.nextLine();
        System.out.print("BIKE PRICE: ");
        bike_price = sc.nextInt();
        sc.nextLine();
        System.out.print("BIKE BRAKE TYPE(DISC BRAKES/RIM BRAKES): ");
        bike_brake_type = sc.nextLine();

        total_bike_in_stock++;
    }
}





 
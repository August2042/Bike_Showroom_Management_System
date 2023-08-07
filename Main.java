import java.util.*;
import java.lang.*;

interface information {
    public void get_details();

    public void set_details();
}

public class Main {

    static void main_menu() {
        System.out.println();
        System.out.println(
                "======================= *** WELCOME TO BIKE SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD BIKES");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET BIKES");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employee employee[] = new Employee[5];

        Bike bike[] = new Bike[5];
        int bike_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;
        BuyBike buyBikeHandler = new BuyBike();

        while (choice != 0) {

            main_menu();
            choice = sc.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employees_counter] = new Employee();
                        employee[employees_counter].set_details();
                        employees_counter++;

                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        bike[bike_counter] = new Bike();
                        bike[bike_counter].set_details();
                        bike_counter++;

                        System.out.println();
                        System.out.println("3].ADD NEW BIKE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        if (showroom_counter > 0) {
                            for (int i = 0; i < showroom_counter; i++) {
                                showroom[i].get_details();
                                System.out.println();
                                System.out.println();
                            }

                        } else {
                            System.out.println("No showroom added yet. Please add showroom first !!!!");
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        if (employees_counter > 0) {
                            for (int i = 0; i < employees_counter; i++) {
                                employee[i].get_details();
                                System.out.println();
                                System.out.println();
                            }
                        } else {
                            System.out.println("No employees added yet. Please add employees first !!!!");
                        }

                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        if (bike_counter > 0) {
                            for (int i = 0; i < bike_counter; i++) {
                                bike[i].get_details();
                                System.out.println();
                                System.out.println();
                            }

                        } else {
                            System.out.println("No bike added yet. Please add bike first !!!!");
                        }

                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;

                    case 7:
                        buyBikeHandler.buyBike(bike, bike_counter);
                        System.out.println();
                        System.out.println("7].BUY A BIKE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }

    }
}
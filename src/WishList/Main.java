package WishList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Chiedo di aggiungere alla lista un regalo
        List<Regalo> presents = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("Insert new present? y/n");
            exit = scanner.nextLine().equals("n");
            if (!exit){
                System.out.println("Description: ");
                String description = scanner.nextLine();
                System.out.println("For who?: ");
                String destination = scanner.nextLine();
                Regalo present = new Regalo(description, destination);
                presents.add(present);
                System.out.println("Your list is " + presents.size() + " long");
            }
        }
        System.out.println(presents);


        scanner.close();
    }
}
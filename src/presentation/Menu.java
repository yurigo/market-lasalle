package presentation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println();
        System.out.println("--- Market ---");
        System.out.println();
        System.out.println("1. Create product");
        System.out.println("2. Create expiring product");
        System.out.println("3. Register professor");
        System.out.println("4. Register student");
        System.out.println("5. Calculate price");
        System.out.println("6. Exit");
        System.out.println();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public String askForString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public int askForInteger(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("That's not a valid integer, try again!");
            } finally {
                scanner.nextLine();
            }
        }
    }

    public double askForDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("That's not a valid double, try again!");
            } finally {
                scanner.nextLine();
            }
        }
    }

    public void showTabulatedList(String[] messages) {
        for (String message : messages) {
            showTabulatedMessage(message);
        }
    }

    public void showTabulatedMessage(String message) {
        System.out.println("\t" + message);
    }

    public void spacing() {
        System.out.println();
    }

    // This should probably be decoupled. This approach was taken to keep the exercise simple.
    public LocalDate askForDate(String message) {
        while (true) {
            try {
                System.out.print(message);
                return LocalDate.parse(scanner.nextLine());
            } catch (DateTimeParseException e) {
                System.out.println("That's not a valid date, try again!");
            }
        }
    }
}

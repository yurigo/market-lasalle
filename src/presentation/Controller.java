package presentation;

import business.MarketManager;

import java.time.LocalDate;

public class Controller {
    private static final int CREATE_PRODUCT = 1;
    private static final int CREATE_EXPIRING_PRODUCT = 2;
    private static final int REGISTER_PROFESSOR = 3;
    private static final int REGISTER_STUDENT = 4;
    private static final int CALCULATE_PRICE = 5;
    private static final int EXIT_MENU = 6;

    private Menu menu;
    private MarketManager marketManager;

    public Controller(Menu menu, MarketManager marketManager) {
        this.menu = menu;
        this.marketManager = marketManager;
    }

    public void run() {
        int option;

        do {
            menu.showMenu();
            option = menu.askForInteger("Enter an option: ");

            runOption(option);
        } while (option != EXIT_MENU);
    }

    private void runOption(int option) {
        switch (option) {
            case CREATE_PRODUCT -> createProduct();
            case CREATE_EXPIRING_PRODUCT -> createExpiringProduct();
            case REGISTER_PROFESSOR -> registerProfessor();
            case REGISTER_STUDENT -> registerStudent();
            case CALCULATE_PRICE -> calculatePrice();
            case EXIT_MENU -> exitMenu();
            default -> menu.showMessage("Wrong option. Enter a number from 1 to 6, both included");
        }
    }

    private void createProduct() {
        menu.spacing();

        String name = menu.askForString("Enter the product's name: ");
        double weight = menu.askForDouble("Enter the product's weight: ");
        double price = menu.askForDouble("Enter the product's price: ");

        marketManager.createProduct(name, weight, price);

        menu.spacing();
        menu.showMessage("The product was successfully created");
    }

    private void createExpiringProduct() {
        menu.spacing();

        String name = menu.askForString("Enter the expiring product's name: ");
        double weight = menu.askForDouble("Enter the expiring product's weight: ");
        double price = menu.askForDouble("Enter the expiring product's price: ");
        LocalDate expirationDate = menu.askForDate("Enter the product's expiration date: ");
        int discount = menu.askForInteger("Enter the discount to apply when the product expires: ");

        marketManager.createExpiringProduct(name, weight, price, expirationDate, discount);

        menu.spacing();
        menu.showMessage("The expiring product was successfully created");
    }

    private void registerProfessor() {
        menu.spacing();

        String login = menu.askForString("Enter the professor's login: ");
        int experienceYears = menu.askForInteger("Enter the professor's experience years: ");

        marketManager.registerProfessor(login, experienceYears);

        menu.spacing();
        menu.showMessage("The professor was successfully registered");
    }

    private void registerStudent() {
        menu.spacing();

        String login = menu.askForString("Enter the student's login: ");
        String area = menu.askForString("Enter the student's area: ");

        marketManager.registerStudent(login, area);

        menu.spacing();
        menu.showMessage("The student was successfully registered");
    }

    private void calculatePrice() {
        menu.spacing();

        String name = menu.askForString("Enter the product's name: ");
        String login = menu.askForString("Enter the customer's login: ");

        menu.spacing();
        menu.showMessage("That customer would pay " + marketManager.calculatePrice(name, login) + "€ for that product");
    }

    private void exitMenu() {
        menu.spacing();
        menu.showMessage("Leaving the Market...");
    }
}

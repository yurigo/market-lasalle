package business;

// TODO the business package probably needs more classes ✔️

import business.product.Perishable;
import business.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;

public class MarketManager {
    // TODO probably add attributes
        ArrayList<Product> products;


    public MarketManager() {
        // TODO probably initialize said attributes
        products = new ArrayList<Product>();
    }

    // TODO all functionalities
    public void createProduct(String name, double weight, double price) {
        // creo un producto y lo persisto en memoria...
        Product p = new Product(name, weight, price);
        products.add(p);

    }

    public void createExpiringProduct(String name, double weight, double price, LocalDate expirationDate, int discount) {
        Perishable p = new Perishable(name, weight, price, expirationDate, discount);
        products.add(p);
    }

    public void registerProfessor(String login, int experienceYears) {

    }

    public void registerStudent(String login, String area) {

    }

    public double calculatePrice(String name, String login) {
        // Assume name and login are unique and exist

        return 0.0;
    }
}

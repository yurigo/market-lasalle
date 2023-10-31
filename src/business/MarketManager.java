package business;

// TODO the business package probably needs more classes ✔️

import business.consumer.Consumer;
import business.consumer.Student;
import business.consumer.Teacher;
import business.product.Perishable;
import business.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class MarketManager {
    // TODO probably add attributes
        ArrayList<Product> products;
        // LinkedList<Product> products;
//        ArrayList<Teacher> teachers;
//        ArrayList<Student> students;
        ArrayList<Consumer> consumers;


    public MarketManager() {
        // TODO probably initialize said attributes
        // products = new ArrayList<Product>();
        products = new ArrayList<Product>();
//        teachers = new ArrayList<Teacher>();
//        students = new ArrayList<Student>();
        consumers = new ArrayList<Consumer>();
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
        Teacher t = new Teacher(login, experienceYears);
        consumers.add(t);
    }

    public void registerStudent(String login, String area) {
        Student s = new Student(login, area);
        consumers.add(s);
    }

    public double calculatePrice(String name, String login) {
        // Assume name and login are unique and exist
        // name va a ser el nombre del Producto
        // login va a ser el login del Consumer

        // consumers.stream().filter(cousumer -> consumer.).findFirst().orElse(null);
        Product product = findProductByName(name);
        Consumer consumer = findConsumerByLogin(login);

        if (product == null) return 0.0;
        if (consumer == null) return 0.0;

        System.out.println(product.getName());
        System.out.println(consumer.getLogin());

        return consumer.calculateDiscountedPrice(product);
    }

    private Consumer findConsumerByLogin(String login) {
        for (Consumer consumer : consumers){
            if (consumer.hasName(login)){
                return consumer;
            }
        }
        return null;
    }

    private Product findProductByName(String name){

//        for (int i = 0 ; i < products.stream().count() ; i++){
//           if (name.equalsIgnoreCase(products.get(i).getName())){
//                return products.get(i);
//            }
//        }
//        return null;

        for (Product product : products){
            if (product.hasName(name)){
                return product;
            }
        }
        return null;
    }
}

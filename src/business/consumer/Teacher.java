package business.consumer;

import business.product.Product;

import java.time.LocalDate;

public class Teacher extends Consumer  {

    //Integer expertiseYears;
    //LocalDate initDate;
    int experienceYears;

//    public Teacher(String login) {
//        super(login);
//    }

//    public Teacher(String login, LocalDate initDate) {
//        super(login);
//        this.initDate = initDate;
//    }


    public Teacher(String login, int experienceYears) {
        super(login);
        this.experienceYears = experienceYears;
    }

    @Override
    public Double calculateDiscountedPrice(Product p) {
        if (this.experienceYears > 2) return p.getPrice() / 2;
        else return p.getPrice();
    }
}

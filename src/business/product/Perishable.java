package business.product;

import java.time.LocalDate;

public class Perishable extends Product{
    private LocalDate expirationDate;
    private Integer discount;

    public Perishable(String name, Double weight, Double price, LocalDate expirationDate, Integer discount) {
        super(name, weight, price);
        this.expirationDate = expirationDate;
        this.discount = discount;
    }
}

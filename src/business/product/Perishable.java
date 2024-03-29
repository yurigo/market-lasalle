package business.product;

import java.time.LocalDate;

public class Perishable extends Product{
    private LocalDate expirationDate;
    private Integer discount;

    public Double getPrice(){
        if (expirationDate.minusDays(3).isBefore(LocalDate.now())){
            // aplicar descuento
            Double discount = super.getPrice() * this.discount / 100;
            return super.getPrice() - discount;
        }
        return super.getPrice();
    }

    public Perishable(String name, Double weight, Double price, LocalDate expirationDate, Integer discount) {
        super(name, weight, price);
        this.expirationDate = expirationDate;
        this.discount = discount;
    }
}

package business.consumer;

import business.product.Product;

public class Student extends Consumer{
    String area;
    public Student(String login, String area) {
        super(login);
        this.area = area;
    }

    @Override
    public Double calculateDiscountedPrice(Product p) {
        Double diezPorCiento = p.getPrice() * 10 / 100;

        if (this.area.equalsIgnoreCase("ingenieria")) return p.getPrice() - diezPorCiento;
        else return p.getPrice() + diezPorCiento;

    }
}

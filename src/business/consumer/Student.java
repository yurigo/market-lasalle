package business.consumer;

import business.product.Product;

public class Student extends Consumer{
    String area;
    public Student(String login, String area) {
        super(login);
        this.area = area;
    }

    @Override
    public Double calculateDiscountedPrice(Double  price) {
        Double diezPorCiento = price * 10 / 100;

        if (this.area.equalsIgnoreCase("ingenieria")) return price - diezPorCiento;
        else return price + diezPorCiento;

    }
}

package business.consumer;

import business.product.Product;

abstract public class Consumer {
    public String getLogin() {
        return login;
    }

    private String login;

    public Consumer(String login) {
        this.login = login;
    }


    public boolean hasName(String login) {
        return login.equalsIgnoreCase(this.login);
    }

    abstract public Double calculateDiscountedPrice(Product p);
}
